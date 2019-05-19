# -*- coding: utf-8 -*-
import scrapy
from scrapy.http import FormRequest, Request
from urllib.parse import quote, urlencode
from scrapy.http.cookies import CookieJar
from scrapy.loader import ItemLoader


class TestSpider(scrapy.Spider):
    name = 'test'
    # allowed_domains = ['liepin.com']
    # 主页url
    start_urls = ['https://www.liepin.com/zhaopin/?',]    

    def start_requests(self):
        data = {
            'key': 'java',
            'curPage': '',
        }
        for i in range(1, 5):
            data['curPage'] = str(i)
            url=self.start_urls[0] + urlencode(data)
            print(url)
            yield Request(url=url, callback=self.parse, dont_filter=True,)

    def parse(self, response):
        job_detail_urls = response.css('ul.sojob-list li div.job-info a')
        for url in job_detail_urls:
            yield response.follow(url=url, callback=self.get_detail, errback=self.error_back)

    def get_detail(self,response):
        details = response.css('div.job-description div.content *::text').getall()
        details = [detail.strip() for detail in details if detail.strip()]
        print(''.join(details))

    def error_back(self, failure):
        """
        错误回调
        """
        self.logger.error("Error: %s" % str(failure.args))
        self.crawler.stats.inc_value('Failed_Request')