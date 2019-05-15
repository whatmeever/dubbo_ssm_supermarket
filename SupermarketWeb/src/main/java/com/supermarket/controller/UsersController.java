package com.supermarket.controller;

import com.supermarket.pojo.Users;
import com.supermarket.pojo.UsersExample;
import com.supermarket.service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UsersController {
    @Resource
    private UsersService usersService;

    @GetMapping("/getAllUser")
    public List<Users> getAllUser(){
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUserNameEqualTo("张三");
        return usersService.selectByExample(usersExample);
    }
}
