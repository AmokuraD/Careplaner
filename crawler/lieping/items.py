# -*- coding: utf-8 -*-

# Define here the models for your scraped items
#
# See documentation in:
# https://doc.scrapy.org/en/latest/topics/items.html

import scrapy
from scrapy import Item, Field
from scrapy.loader.processors import TakeFirst, Join, MapCompose

class LiepingItem(scrapy.Item):
    # 一级分类，包括：开发，测试...
    first_ctg =  Field(input_processor=Join())
    # 二级分分类，包括：java, c, 自然语言处理
    second_ctg = Field(input_processor=Join())
    # 岗位详情
    positiondetail = Field(input_processor=Join())
    # 岗位名
    positionname = Field(input_processor=Join())
