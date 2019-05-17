package com.supermarket.service;

import com.supermarket.pojo.FreshGoods;
import com.supermarket.pojo.FreshGoodsExample;

import java.util.List;

public interface FreshGoodsService {
    //通过gtid来获取该类型的产品
    /*List<FreshGoods> getFreshGoodsByGtid(int gtid);
    //获取特价商品
    List<FreshGoods> getFreshGoodsByExample(FreshGoodsExample example);
    //获取特别优惠，也就是折扣小于30的产品
    List<FreshGoods> getFreshGoodsByDiscount(FreshGoodsExample example);
    //查询所有的海鲜产品
    List<FreshGoods> getFreshGoodsByHaiXian(FreshGoodsExample example);*/

    //通过gtid来获取该类型的产品
    List<FreshGoods> selectByExample(FreshGoodsExample example);

}
