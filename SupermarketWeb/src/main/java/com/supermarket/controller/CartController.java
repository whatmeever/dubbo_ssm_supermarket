package com.supermarket.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.supermarket.pojo.Cart;
import com.supermarket.pojo.CartExample;
import com.supermarket.pojo.Users;
import com.supermarket.service.CartService;
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
    @Resource
    private RedisSaveManagerUtil redisSaveManagerUtil;
    private static CartExample cartExample;
    static {
        cartExample = new CartExample();
    }
    //返回-1代表未登陆,返回1代表增加成功
    @ResponseBody
    @PostMapping("/addGoodToCart")
    public int addGoodToCart(HttpServletRequest req){
        HttpSession session = req.getSession();
        Users users = (Users)session.getAttribute("users");
        String fdid = req.getParameter("fdid");
        String count = req.getParameter("count");
        List<Cart> carts = null;
        if (users == null){
            return -1;
        }else {
            carts = JSON.parseObject(redisSaveManagerUtil.get(users.getUserId()),new TypeReference<List<Cart>>(){});
            if (carts == null){
                carts = new ArrayList<>();
                String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                Cart cart = new Cart();
                cart.setCid(uuid);
                cart.setUserId(users.getUserId());
                cart.setFdid(fdid);
                cart.setCount(Integer.parseInt(count));
                carts.add(cart);
                String cartsJson = JSON.toJSONString(carts);
                redisSaveManagerUtil.add(users.getUserId(),cartsJson);
                return 1;
            }else {
                for (Cart cart : carts) {
                    if (cart.getFdid().equalsIgnoreCase(fdid)){
                        cart.setCount(cart.getCount()+Integer.parseInt(count));
                        String cartsJson = JSON.toJSONString(carts);
                        redisSaveManagerUtil.update(users.getUserId(),cartsJson);
                        return 1;
                    }
                }
                Cart cartb = new Cart();
                cartb.setCid(carts.get(0).getCid());
                cartb.setUserId(users.getUserId());
                cartb.setFdid(fdid);
                cartb.setCount(Integer.parseInt(count));
                carts.add(cartb);
                String cartsJson = JSON.toJSONString(carts);
                redisSaveManagerUtil.update(users.getUserId(),cartsJson);
                return 1;
            }
        }
    }
}
