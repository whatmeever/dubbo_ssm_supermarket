package com.supermarket.controller;

import com.supermarket.pojo.FreshGoods;
import com.supermarket.service.GoodDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class GoodDetailsController {
    @Resource
    private GoodDetailsService goodDetailsService;
    /*@ResponseBody*/
    @GetMapping("/getGoodDetailsByFdid")
    public String getGoodDetailsByFdid(HttpServletRequest request, Model model){
        String fdid = request.getParameter("fdid");
        FreshGoods freshGoods = goodDetailsService.selectByPrimaryKey(fdid);
        String[] strings = freshGoods.getImg().split("-");
        model.addAttribute("imgs",strings);
        model.addAttribute("freshGoods",freshGoods);
        return "single";
    }
}
