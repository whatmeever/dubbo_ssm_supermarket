package com.supermarket.service;

import com.supermarket.pojo.FreshGoods;
import com.supermarket.pojo.FreshGoodsExample;

import java.util.List;

public interface GoodAdminService {
    int countByExample(FreshGoodsExample example);
    List<FreshGoods> selectByExample(FreshGoodsExample example);
    FreshGoods selectByPrimaryKey(String fdid);
    int updateByPrimaryKey(FreshGoods record);
}
