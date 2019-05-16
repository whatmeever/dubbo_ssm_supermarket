package com.supermarket.impl;

import com.supermarket.mapper.FreshGoodsMapper;
import com.supermarket.pojo.FreshGoods;
import com.supermarket.service.GoodDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GoodDetailsServiceImpl implements GoodDetailsService {
    @Resource
    private FreshGoodsMapper freshGoodsMapper;
    @Override
    public FreshGoods selectByPrimaryKey(String fdid) {
        return freshGoodsMapper.selectByPrimaryKey(fdid);
    }
}
