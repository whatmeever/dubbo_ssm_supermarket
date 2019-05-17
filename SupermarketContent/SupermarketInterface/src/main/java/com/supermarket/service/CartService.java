package com.supermarket.service;

import com.supermarket.pojo.Cart;
import com.supermarket.pojo.CartExample;

import java.util.List;

public interface CartService {
    List<Cart> getCartByUserId(String userId);
}
