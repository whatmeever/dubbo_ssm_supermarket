package com.supermarket.service;

import com.supermarket.pojo.Users;
import com.supermarket.pojo.UsersExample;

import java.util.List;
import java.util.Map;

public interface UsersService {
    List<Users> selectByExample(UsersExample example);
    int countByExample(UsersExample example);
    int updateByPrimaryKey(Users record);
    Users selectByPrimaryKey(String userId);
    Users selectUserByUser(Map map);
    int insert(Users record);
}
