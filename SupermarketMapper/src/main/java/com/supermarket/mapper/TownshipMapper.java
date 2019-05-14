package com.supermarket.mapper;

import com.supermarket.pojo.Township;
import com.supermarket.pojo.TownshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TownshipMapper {
    int countByExample(TownshipExample example);

    int deleteByExample(TownshipExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Township record);

    int insertSelective(Township record);

    List<Township> selectByExample(TownshipExample example);

    Township selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Township record, @Param("example") TownshipExample example);

    int updateByExample(@Param("record") Township record, @Param("example") TownshipExample example);

    int updateByPrimaryKeySelective(Township record);

    int updateByPrimaryKey(Township record);
}