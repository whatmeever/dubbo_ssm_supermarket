package com.supermarket.service;

import com.supermarket.pojo.FreshGoods;

import java.util.List;

public interface FreshGoodsService {
    //通过gtid来获取该类型的产品
    List<FreshGoods> getFreshGoodsByGtid(int gtid);
}
