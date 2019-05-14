package com.supermarket.mapper;

import com.supermarket.pojo.Courier;
import com.supermarket.pojo.CourierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourierMapper {
    int countByExample(CourierExample example);

    int deleteByExample(CourierExample example);

    int deleteByPrimaryKey(String account);

    int insert(Courier record);

    int insertSelective(Courier record);

    List<Courier> selectByExample(CourierExample example);

    Courier selectByPrimaryKey(String account);

    int updateByExampleSelective(@Param("record") Courier record, @Param("example") CourierExample example);

    int updateByExample(@Param("record") Courier record, @Param("example") CourierExample example);

    int updateByPrimaryKeySelective(Courier record);

    int updateByPrimaryKey(Courier record);
}