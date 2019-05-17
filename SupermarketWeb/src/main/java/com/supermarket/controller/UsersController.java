package com.supermarket.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.layui.utils.DataUtil;
import com.supermarket.pojo.Users;
import com.supermarket.pojo.UsersExample;
import com.supermarket.service.UsersService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;

@Controller
public class UsersController {
    @Resource
    private UsersService usersService;
    private static UsersExample usersExample;
    static {
        usersExample = new UsersExample();
    }
    @ResponseBody
    @GetMapping("/getAllUser")
    public DataUtil<Users> getAllUser(HttpServletRequest req){
        String userId = req.getParameter("userId");
        String userName = req.getParameter("userName");
        int page = Integer.parseInt(req.getParameter("page"));
        int limit = Integer.parseInt(req.getParameter("limit"));
        System.out.println("==========================page:"+page);
        System.out.println("==========================limit:"+limit);
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
        /*int count = usersService.countByExample(usersExample);*/
        //分页
        /*List<Users> list = usersService.MyPageHpler(page, limit, usersExample);*/
        PageHelper.startPage(page,limit);
        List<Users> users = usersService.selectByExample(usersExample);
        PageInfo<Users> usersPageInfo = new PageInfo<>(users);
        List<Users> list = usersPageInfo.getList();
        System.out.println("============================size:"+list.size());
        DataUtil<Users> usersDataUtil = new DataUtil<>();
        usersDataUtil.setCount(list.size());
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

    //通过userId获得一个用户,并返回一个用户信息页面
    @GetMapping("/getUserByUserId")
    public String getUserByUserId(HttpServletRequest req, Model model){
        String userId = req.getParameter("userId");
        Users users = usersService.selectByPrimaryKey(userId);
        model.addAttribute("users",users);
        return "/ht/page/userAdmin/userInfo";
    }

    @ResponseBody
    @GetMapping("/getUserByUserId2")
    public Users getUserByUserId2(HttpServletRequest req){
        String userId = req.getParameter("userId");
        Users users = usersService.selectByPrimaryKey(userId);
        return users;
    }

    //用户登录
    @PostMapping("/userLogin")
    public String userLogin(HttpServletRequest req){
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        try {
            Subject subject = SecurityUtils.getSubject();
            HttpSession session = req.getSession();
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            subject.login(token);
            HashMap<String,String> map = new HashMap<>();
            map.put("username",username);
            map.put("password",password);
            Users users = usersService.selectUserByUser(map);
            session.setAttribute("users",users);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "index";
        }
        return "index";
    }
    //用户注销
    @GetMapping("/userLogout")
    public String userLogout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "index";
    }
}
