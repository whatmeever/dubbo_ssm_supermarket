package com.supermarket.impl;

import com.supermarket.mapper.UsersMapper;
import com.supermarket.pojo.Users;
import com.supermarket.pojo.UsersExample;
import com.supermarket.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public List<Users> selectByExample(UsersExample example) {
        return usersMapper.selectByExample(example);
    }

    @Override
    public int countByExample(UsersExample example) {
        return usersMapper.countByExample(example);
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return usersMapper.updateByPrimaryKey(record);
    }

    @Override
    public Users selectByPrimaryKey(String userId) {
        return usersMapper.selectByPrimaryKey(userId);
    }
}
