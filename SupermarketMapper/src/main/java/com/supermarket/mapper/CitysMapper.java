package com.supermarket.mapper;

import com.supermarket.pojo.Citys;
import com.supermarket.pojo.CitysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CitysMapper {
    int countByExample(CitysExample example);

    int deleteByExample(CitysExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Citys record);

    int insertSelective(Citys record);

    List<Citys> selectByExample(CitysExample example);

    Citys selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Citys record, @Param("example") CitysExample example);

    int updateByExample(@Param("record") Citys record, @Param("example") CitysExample example);

    int updateByPrimaryKeySelective(Citys record);

    int updateByPrimaryKey(Citys record);
}