package com.supermarket.service;

import com.supermarket.pojo.FreshGoods;
import com.supermarket.pojo.FreshGoodsExample;

import java.util.List;

public interface GoodDetailsService {
    //根据物品id查详情
    FreshGoods selectByPrimaryKey(String fdid);
    //查询所有商品
    List<FreshGoods> selectByExample(FreshGoodsExample example);
}
