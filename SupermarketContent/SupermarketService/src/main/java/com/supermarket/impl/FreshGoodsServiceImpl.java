package com.supermarket.impl;

import com.supermarket.mapper.FreshGoodsMapper;
import com.supermarket.pojo.FreshGoods;
import com.supermarket.pojo.FreshGoodsExample;
import com.supermarket.service.FreshGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class FreshGoodsServiceImpl implements FreshGoodsService {
    @Resource
    private FreshGoodsMapper freshGoodsMapper;

    @Override
    public List<FreshGoods> getFreshGoodsByGtid(int gtid) {
        FreshGoodsExample example = new FreshGoodsExample();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGtidEqualTo(gtid);
        return freshGoodsMapper.selectByExample(example);
    }
}
