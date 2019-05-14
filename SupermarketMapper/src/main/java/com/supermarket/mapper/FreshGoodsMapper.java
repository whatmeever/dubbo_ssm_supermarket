package com.supermarket.mapper;

import com.supermarket.pojo.FreshGoods;
import com.supermarket.pojo.FreshGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreshGoodsMapper {
    int countByExample(FreshGoodsExample example);

    int deleteByExample(FreshGoodsExample example);

    int deleteByPrimaryKey(String fdid);

    int insert(FreshGoods record);

    int insertSelective(FreshGoods record);

    List<FreshGoods> selectByExample(FreshGoodsExample example);

    FreshGoods selectByPrimaryKey(String fdid);

    int updateByExampleSelective(@Param("record") FreshGoods record, @Param("example") FreshGoodsExample example);

    int updateByExample(@Param("record") FreshGoods record, @Param("example") FreshGoodsExample example);

    int updateByPrimaryKeySelective(FreshGoods record);

    int updateByPrimaryKey(FreshGoods record);
}