package com.supermarket.impl;

import com.supermarket.mapper.GoodTypeMapper;
import com.supermarket.pojo.FreshGoods;
import com.supermarket.pojo.GoodType;
import com.supermarket.pojo.GoodTypeExample;
import com.supermarket.service.GoodTypeSerivce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class GoodTypeServiceImpl implements GoodTypeSerivce {
    @Resource
    private GoodTypeMapper goodTypeMapper;
    @Override
    public List<GoodType> getGoodTypes(GoodTypeExample example) {
        return goodTypeMapper.selectByExample(example);
    }

    @Override
    public GoodType getGoodType(int gtid) {
        return goodTypeMapper.selectByPrimaryKey(gtid);
    }


}
