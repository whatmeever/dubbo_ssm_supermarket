package com.supermarket.controller;

import com.supermarket.pojo.FreshGoods;
import com.supermarket.pojo.FreshGoodsExample;
import com.supermarket.pojo.GoodType;
import com.supermarket.service.FreshGoodsService;
import com.supermarket.service.GoodTypeSerivce;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    private static FreshGoodsExample example;
    static{
        example=new FreshGoodsExample();
    }
    @GetMapping("/getFreshGoods")
    public String getFreshGoodsByGtid(HttpServletRequest request, Model model){
        String id = request.getParameter("gtid");
        int gtid = Integer.parseInt(id);
        HashMap<String, String> hashMap = new HashMap<>();
        GoodType goodType = goodTypeSerivce.selectByPrimaryKey(gtid);
        example.clear();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGtidEqualTo(gtid);
        List<FreshGoods> list= freshGoodsService.selectByExample(example);
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
        example.clear();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andIfPromotionEqualTo(1);
        List<FreshGoods> freshGoods = freshGoodsService.selectByExample(example);
        return freshGoods;
    }
    @ResponseBody
    @GetMapping("/getSpecialGood")
    public List<FreshGoods> getSpecialGood(){
        example.clear();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andIfPromotionEqualTo(1);
        List<FreshGoods> list = new ArrayList<>();
        List<FreshGoods> freshGoods = freshGoodsService.selectByExample(example);
        for (int i = 0;i<7;i++){
            list.add(freshGoods.get(i));
        }
        return  list;
    }

    @ResponseBody
    @GetMapping("/getDiscountGoods")
    public List<FreshGoods> getDiscountGoods(){
        example.clear();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andDiscountLessThanOrEqualTo(30);
        criteria.andDiscountGreaterThan(0);
        List<FreshGoods> freshGood = freshGoodsService.selectByExample(example);
        return freshGood;
    }
    @ResponseBody
    @GetMapping("/getHaiXians")
    public List<FreshGoods> getHaiXians(){
        example.clear();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGtidEqualTo(8);
        List<FreshGoods> freshGoods = freshGoodsService.selectByExample(example);
        List<FreshGoods> list = new ArrayList<>();
        for (int i = 0;i<3;i++){
            list.add(freshGoods.get(i));
        }
        return list;
    }
    @ResponseBody
    @GetMapping("/getJiuShuis")
    public List<FreshGoods> getJiuShuis(){
        example.clear();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGtidEqualTo(4);
        List<FreshGoods> freshGoods = freshGoodsService.selectByExample(example);
        List<FreshGoods> list = new ArrayList<>();
        for (int i = 0;i<3;i++){
            list.add(freshGoods.get(i));
        }
        return list;
    }
    @ResponseBody
    @GetMapping("/getFruits")
    public List<FreshGoods> getFruits(){
        example.clear();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGtidEqualTo(1);
        List<FreshGoods> freshGoods = freshGoodsService.selectByExample(example);
        List<FreshGoods> list = new ArrayList<>();
        for (int i = 0;i<3;i++){
            list.add(freshGoods.get(i));
        }
        return list;
    }
    @ResponseBody
    @PostMapping("/getFreshGoodsByChoose")
    public List<FreshGoods> getFreshGoodsByChoose(HttpServletRequest request){
        String pre = request.getParameter("pre");
        String discount = request.getParameter("discount");
        String gtid = request.getParameter("gtid");
        String minPrice = request.getParameter("minPrice");
        String maxPrice = request.getParameter("maxPrice");

        example.clear();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        if (!pre.equals("-1")){
            int i = Integer.parseInt(pre);
            criteria.andPreferenceEqualTo(i);
        }
        if(!discount.equals("0")){
            int i = Integer.parseInt(discount);
            criteria.andDiscountGreaterThanOrEqualTo(i);
        }
        if (minPrice != null && maxPrice != null){
            double min = Double.parseDouble(minPrice);
            double max = Double.parseDouble(maxPrice);
            criteria.andPriceBetween(min,max);
        }
        if (gtid != null){
            int i = Integer.parseInt(gtid);
            criteria.andGtidEqualTo(i);
        }
        List<FreshGoods> list = freshGoodsService.selectByExample(example);

        return list;

    }
    //小搜索框
    @PostMapping("/getSouSuoGoods")
    public  String getSouSuoGoods(HttpServletRequest request,Model model){
        String id = request.getParameter("gtid");
        int gtid = Integer.parseInt(id);
        String goodName = request.getParameter("goodName");
        HashMap<String, String> hashMap = new HashMap<>();
        GoodType goodType = goodTypeSerivce.selectByPrimaryKey(gtid);
        example.clear();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGtidEqualTo(gtid);
        criteria.andGoodNameLike("%"+goodName+"%");
        List<FreshGoods> list= freshGoodsService.selectByExample(example);
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
    @PostMapping("/getBigSouSuoGoods")
    public String getBigSouSuoGoods(HttpServletRequest request,Model model){
        String goodName = request.getParameter("goodName");
        example.clear();
        FreshGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGoodNameLike("%"+goodName+"%");
        List<FreshGoods> list = freshGoodsService.selectByExample(example);

        HashMap<String, String> hashMap = new HashMap<>();
        for (FreshGoods freshGoods:list){
            String img = freshGoods.getImg();
            String[] splits = img.split("-");
            String imgs = splits[0];
            hashMap.put(freshGoods.getFdid(),imgs);
        }

        Integer gtid = list.get(0).getGtid();
        if (gtid != 0){
            GoodType goodType = goodTypeSerivce.selectByPrimaryKey(gtid);
            model.addAttribute("goodType",goodType);
            //该物品的图片
            model.addAttribute("imgs",hashMap);
            //物品
            model.addAttribute("freshGoods",list);

        }
        return "product";
    }



}
