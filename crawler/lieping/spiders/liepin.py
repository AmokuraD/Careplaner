# -*- coding: utf-8 -*-
import scrapy
from scrapy.http import FormRequest, Request
from urllib.parse import quote, urlencode
from scrapy.http.cookies import CookieJar
from scrapy.loader import ItemLoader
from lieping.items import LiepingItem
import copy

class LiepinSpider(scrapy.Spider):
    name = 'liepin'
    allowed_domains = ['liepin.com']
    # 主页url
    start_urls = ['https://www.liepin.com/it/',]
    # 搜索页面url
    search_url = 'https://www.liepin.com/zhaopin/?'

    def parse(self, response):
        job_lists = response.css('ul.sidebar li dl')[0]
        first_ctgs = job_lists.css('dt::text').getall()
        second_ctgs = job_lists.css('dd')
        for i in range(0,5):
            for a in second_ctgs[i].css('a'):
                loader = ItemLoader(item=LiepingItem(), response=response)
                # 职位一级分类
                loader.add_value('first_ctg', first_ctgs[i])
                #  职位二级分类
                second_ctg = a.css('::text').get()
                loader.add_value('second_ctg', a.css('::text').get())
                # 构造GET请求参数
                data = {}
                # 搜索岗位
                data['key'] = second_ctg
                for pageno in range(0, self.settings.get('MAX_PAGES')):
                    # 当前页面
                    data['curPage'] = str(pageno)
                    url= self.search_url + urlencode(data)
                    yield Request(url=url,
                                  callback=self.parse_list,
                                  meta={'item':copy.deepcopy(loader.load_item())},
                                  dont_filter=True,
                                  priority=10,)


    def parse_list(self, response):
        # 获取每一张卡片
        positions = response.css('ul.sojob-list li div.job-info')
        for position in positions:
            # 岗位名称
            position_name = position.css('a::text').get().strip()
            # 提取岗位详情url
            url = position.css('a::attr(href)').get()
            url = response.urljoin(url)
            # 检测urljoin是否正常作用
            # print(url)
            # 将岗位名称存入item
            loader = ItemLoader(item=response.meta['item'], response=response)
            loader.add_value('positionname', position_name)

            yield Request(url=url,
                          callback=self.get_detail, 
                          meta={'item':loader.load_item()},
                          priority=8)

    def get_detail(self,response):
        details = response.css('div.job-description div.content *::text').getall()
        details = [detail.strip() for detail in details if detail.strip()]
        loader = ItemLoader(item=response.meta['item'], response=response)
        loader.add_value('positiondetail', ''.join(details))
        return loader.load_item()