package com.supermarket.impl;

import com.supermarket.mapper.FreshGoodsMapper;
import com.supermarket.pojo.FreshGoods;
import com.supermarket.pojo.FreshGoodsExample;
import com.supermarket.service.GoodDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodDetailsServiceImpl implements GoodDetailsService {
    @Resource
    private FreshGoodsMapper freshGoodsMapper;
    @Override
    public FreshGoods selectByPrimaryKey(String fdid) {
        return freshGoodsMapper.selectByPrimaryKey(fdid);
    }

    @Override
    public List<FreshGoods> selectByExample(FreshGoodsExample example) {
        return freshGoodsMapper.selectByExample(example);
    }
}
