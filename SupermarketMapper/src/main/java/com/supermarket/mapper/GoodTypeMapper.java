package com.supermarket.mapper;

import com.supermarket.pojo.GoodType;
import com.supermarket.pojo.GoodTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodTypeMapper {
    int countByExample(GoodTypeExample example);

    int deleteByExample(GoodTypeExample example);

    int deleteByPrimaryKey(Integer gtid);

    int insert(GoodType record);

    int insertSelective(GoodType record);

    List<GoodType> selectByExample(GoodTypeExample example);

    GoodType selectByPrimaryKey(Integer gtid);

    int updateByExampleSelective(@Param("record") GoodType record, @Param("example") GoodTypeExample example);

    int updateByExample(@Param("record") GoodType record, @Param("example") GoodTypeExample example);

    int updateByPrimaryKeySelective(GoodType record);

    int updateByPrimaryKey(GoodType record);
}