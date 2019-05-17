package com.supermarket.service;

import com.supermarket.pojo.GoodType;
import com.supermarket.pojo.GoodTypeExample;

import java.util.List;

public interface GoodTypeSerivce {
    //查询商品的所有类型
   /* List<GoodType> getGoodTypes(GoodTypeExample example);

    GoodType getGoodType(int gtid);*/

   List<GoodType> selectByExample(GoodTypeExample example);

    GoodType selectByPrimaryKey(Integer gtid);

}
