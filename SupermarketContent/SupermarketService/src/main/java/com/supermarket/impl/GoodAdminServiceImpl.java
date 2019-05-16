package com.supermarket.impl;

import com.supermarket.mapper.FreshGoodsMapper;
import com.supermarket.pojo.FreshGoods;
import com.supermarket.pojo.FreshGoodsExample;
import com.supermarket.service.GoodAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodAdminServiceImpl implements GoodAdminService {
    @Autowired
    private FreshGoodsMapper freshGoodsMapper;

    @Override
    public int countByExample(FreshGoodsExample example) {
        return freshGoodsMapper.countByExample(example);
    }

    @Override
    public List<FreshGoods> selectByExample(FreshGoodsExample example) {
        return freshGoodsMapper.selectByExample(example);
    }

    @Override
    public FreshGoods selectByPrimaryKey(String fdid) {
        return freshGoodsMapper.selectByPrimaryKey(fdid);
    }

    @Override
    public int updateByPrimaryKey(FreshGoods record) {
        return freshGoodsMapper.updateByPrimaryKey(record);
    }
}
