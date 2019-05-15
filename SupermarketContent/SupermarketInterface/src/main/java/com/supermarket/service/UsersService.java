package com.supermarket.service;

import com.supermarket.pojo.Users;
import com.supermarket.pojo.UsersExample;

import java.util.List;

public interface UsersService {
    List<Users> selectByExample(UsersExample example);
    int countByExample(UsersExample example);
}
