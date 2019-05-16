package com.supermarket.controller;

import com.supermarket.pojo.FreshGoods;
import com.supermarket.pojo.FreshGoodsExample;
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
import java.util.List;

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
    @GetMapping("/getGoodDetailsAll")
    @ResponseBody
    public List<FreshGoods> getGoodDetailsAll(Model model){
        FreshGoodsExample example = new FreshGoodsExample();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andDiscountEqualTo(50);
        List<FreshGoods> fgoods= goodDetailsService.selectByExample(example);
        model.addAttribute("freshGoodsAll",fgoods);
        return fgoods;
    }
    @GetMapping("/getGoodDetailsByFdid2")
    public String getGoodDetailsByFdid2(HttpServletRequest request, Model model){
        String fdid = request.getParameter("fdid");
        FreshGoods freshGoods = goodDetailsService.selectByPrimaryKey(fdid);
        String[] strings = freshGoods.getImg().split("-");
        model.addAttribute("imgs",strings);
        model.addAttribute("freshGoods",freshGoods);
        return "single";
    }
}
