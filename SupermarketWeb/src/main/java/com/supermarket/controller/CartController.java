package com.supermarket.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.supermarket.pojo.*;
import com.supermarket.service.CartService;
import com.supermarket.service.FreshGoodsService;
import com.supermarket.util.RedisSaveManagerUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class CartController {
    @Resource
    private CartService cartService;
    private FreshGoodsService freshGoodsService;
    @Resource
    private RedisSaveManagerUtil redisSaveManagerUtil;
    private static CartExample cartExample;

    static {
        cartExample = new CartExample();

    }
    //返回-1代表未登陆,返回1代表增加成功

    @PostMapping("/addGoodToCart")
    public String addGoodToCart(HttpServletRequest request){
        String fdid = request.getParameter("fdid");
        System.out.println(fdid+"++++++++++++fdid+++++++++++++++++++++");
        Users users = (Users) request.getSession().getAttribute("users");

        if (fdid != null){
            Cart cart = (Cart) request.getSession().getAttribute("cart");
            System.out.println(cart+"++++++++++++++++cart++++++++++++++++++++++");
            FreshGoods freshGoods = freshGoodsService.selectByPrimaryKey(fdid);
            if (cart == null){
                Cart cart1 = new Cart();
                String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                cart1.setCount(1);
                cart1.setUserId(users.getUserId());
                cart1.setFdid(fdid);
                cart1.setCid(uuid);
                int i = cartService.insertSelective(cart);
                System.out.println(i+"++++++++++++null++++++++++++++++++");
            }else{
                if(cart.getFdid().equals(fdid)){
                    Integer count = cart.getCount();
                    count++;
                    cart.setCount(count);
                    int i = cartService.insertSelective(cart);
                    System.out.println(i+"+++++++++++++++haha+++++++++++++++");
                }else {
                    cart.setFdid(fdid);
                    cart.setUserId(users.getUserId());
                    cart.setCount(1);
                    int i=cartService.insertSelective(cart);
                    System.out.println(i+"++++++++++++++haha2++++++++++++++++");
                }
                request.getSession().setAttribute("cart", cart);
            }
        }
        return "index";
    }
}
