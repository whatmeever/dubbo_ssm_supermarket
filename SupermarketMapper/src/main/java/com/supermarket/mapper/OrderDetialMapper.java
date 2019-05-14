package com.supermarket.mapper;

import com.supermarket.pojo.OrderDetial;
import com.supermarket.pojo.OrderDetialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetialMapper {
    int countByExample(OrderDetialExample example);

    int deleteByExample(OrderDetialExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(OrderDetial record);

    int insertSelective(OrderDetial record);

    List<OrderDetial> selectByExample(OrderDetialExample example);

    OrderDetial selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") OrderDetial record, @Param("example") OrderDetialExample example);

    int updateByExample(@Param("record") OrderDetial record, @Param("example") OrderDetialExample example);

    int updateByPrimaryKeySelective(OrderDetial record);

    int updateByPrimaryKey(OrderDetial record);
}