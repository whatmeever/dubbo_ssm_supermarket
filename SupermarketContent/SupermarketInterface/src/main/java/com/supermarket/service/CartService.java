package com.supermarket.service;

import com.supermarket.pojo.Cart;

import java.util.List;

public interface CartService {
    List<Cart> getCartByUserId(String userId);

    int insertSelective(Cart record);
}
