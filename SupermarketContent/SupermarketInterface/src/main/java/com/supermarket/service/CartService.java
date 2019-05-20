package com.supermarket.service;

import java.util.List;

public interface CartService {
    List<Cart> getCartByUserId(String userId);
}
