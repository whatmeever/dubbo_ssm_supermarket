package com.supermarket.service;

import com.supermarket.pojo.FreshGoods;

public interface GoodDetailsService {
    //根据物品id查详情
    FreshGoods selectByPrimaryKey(String fdid);
}
