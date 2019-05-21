package com.supermarket.impl;

import com.supermarket.mapper.CartMapper;
import com.supermarket.pojo.Cart;
import com.supermarket.pojo.CartExample;
import com.supermarket.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Resource
    private CartMapper cartMapper;

    @Override
    public List<Cart> getCartByUserId(String userId) {
        CartExample example = new CartExample();
        CartExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return cartMapper.selectByExample(example);
    }

    @Override
    public int insertSelective(Cart record) {
        return cartMapper.insertSelective(record);
    }
}
