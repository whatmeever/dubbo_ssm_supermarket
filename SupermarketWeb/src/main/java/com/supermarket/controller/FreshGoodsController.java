package com.supermarket.controller;

import com.supermarket.pojo.FreshGoods;
import com.supermarket.pojo.FreshGoodsExample;
import com.supermarket.pojo.GoodType;
import com.supermarket.service.FreshGoodsService;
import com.supermarket.service.GoodTypeSerivce;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class FreshGoodsController {
    @Resource
    private FreshGoodsService freshGoodsService;
    @Resource
    private GoodTypeSerivce goodTypeSerivce;

    @GetMapping("/getFreshGoods")
    public String getFreshGoodsByGtid(HttpServletRequest request, Model model){
        String id = request.getParameter("gtid");
        int gtid = Integer.parseInt(id);
        HashMap<String, String> hashMap = new HashMap<>();
        GoodType goodType = goodTypeSerivce.getGoodType(gtid);
        List<FreshGoods> list= freshGoodsService.getFreshGoodsByGtid(gtid);
        for (FreshGoods freshGoods:list){
            String img = freshGoods.getImg();
            String[] splits = img.split("-");
            String imgs = splits[0];
            hashMap.put(freshGoods.getFdid(),imgs);
        }
        //该物品的类型
        model.addAttribute("goodType",goodType);
        //该物品的图片
        model.addAttribute("imgs",hashMap);
        //物品
        model.addAttribute("freshGoods",list);
        return "product";
    }

    @ResponseBody
    @GetMapping("/getSpecialGoods")
    public List<FreshGoods> getSpecialGoods(){
        FreshGoodsExample example = new FreshGoodsExample();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andIfPromotionEqualTo(1);
        List<FreshGoods> freshGoods = freshGoodsService.getFreshGoodsByExample(example);
        return freshGoods;
    }
    @ResponseBody
    @GetMapping("/getSpecialGood")
    public List<FreshGoods> getSpecialGood(){
        FreshGoodsExample example = new FreshGoodsExample();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andIfPromotionEqualTo(1);
        List<FreshGoods> list = new ArrayList<>();
        List<FreshGoods> freshGoods = freshGoodsService.getFreshGoodsByExample(example);
        for (int i = 0;i<7;i++){
            list.add(freshGoods.get(i));
        }
        return  list;
    }

    @ResponseBody
    @GetMapping("/getDiscountGoods")
    public List<FreshGoods> getDiscountGoods(){
        FreshGoodsExample example = new FreshGoodsExample();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andDiscountLessThanOrEqualTo(30);
        criteria.andDiscountGreaterThan(0);
        List<FreshGoods> freshGood = freshGoodsService.getFreshGoodsByDiscount(example);
        return freshGood;
    }
    @ResponseBody
    @GetMapping("/getHaiXians")
    public List<FreshGoods> getHaiXians(){
        FreshGoodsExample example = new FreshGoodsExample();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGtidEqualTo(8);
        List<FreshGoods> freshGoods = freshGoodsService.getFreshGoodsByHaiXian(example);
        List<FreshGoods> list = new ArrayList<>();
        for (int i = 0;i<3;i++){
            list.add(freshGoods.get(i));
        }
        return list;
    }



}
