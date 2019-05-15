package com.supermarket.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.layui.utils.DataUtil;
import com.supermarket.pojo.Users;
import com.supermarket.pojo.UsersExample;
import com.supermarket.service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
public class UsersController {
    @Resource
    private UsersService usersService;
    private static UsersExample usersExample;
    static {
        usersExample = new UsersExample();
    }

    @GetMapping("/getAllUser")
    public DataUtil<Users> getAllUser(HttpServletRequest req){
        String userId = req.getParameter("userId");
        String userName = req.getParameter("userName");
        int page = Integer.parseInt(req.getParameter("page"));
        int limit = Integer.parseInt(req.getParameter("limit"));
        usersExample.clear();
        UsersExample.Criteria usersExampleCriteria = usersExample.createCriteria();
        if (userId != null && !"".equalsIgnoreCase(userId)){
            usersExampleCriteria.andUserIdLike(userId+"%");
        }
        if (userName != null && !"".equalsIgnoreCase(userName)){
            String name = null;
            try {
                 name = new String(userName.getBytes("ISO-8859-1"), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            usersExampleCriteria.andUserNameLike(name+"%");
        }
        int count = usersService.countByExample(usersExample);
        //分页
        PageHelper.startPage(page,limit);
        List<Users> users = usersService.selectByExample(usersExample);
        PageInfo<Users> usersPageInfo = new PageInfo<>(users);
        List<Users> list = usersPageInfo.getList();
        DataUtil<Users> usersDataUtil = new DataUtil<>();
        usersDataUtil.setCount(count);
        usersDataUtil.setData(list);
        return usersDataUtil;
    }
    //审核新用户
    @ResponseBody
    @PostMapping("/reviewNewUser")
    public int reviewNewUser(HttpServletRequest req){
        String userId = req.getParameter("userId");
        Users users = usersService.selectByPrimaryKey(userId);
        users.setIfNew(1);
        int i = usersService.updateByPrimaryKey(users);
        return i;
    }

    //通过userId获得一个用户
    @ResponseBody
    @PostMapping("/getUserByUserId")
    public Users getUserByUserId(HttpServletRequest req){
        String userId = req.getParameter("userId");
        Users users = usersService.selectByPrimaryKey(userId);
        return users;
    }
}
