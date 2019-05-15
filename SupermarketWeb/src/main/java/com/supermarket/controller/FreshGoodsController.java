package com.supermarket.controller;

import com.supermarket.pojo.FreshGoods;
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
import java.util.List;

@Controller
public class FreshGoodsController {
    @Resource
    private FreshGoodsService freshGoodsService;
    @Resource
    private GoodTypeSerivce goodTypeSerivce;
  /*  @ResponseBody
    @GetMapping("/getFreshGoods")
    public List<FreshGoods> getFreshGoodsByGtid(HttpServletRequest request, Model model){
        String id = request.getParameter("gtid");
        int gtid = Integer.parseInt(id);
        List<String> strings = new ArrayList<>();
        GoodType goodType = goodTypeSerivce.getGoodType(gtid);
        model.addAttribute("goodType",goodType);
        List<FreshGoods> list= freshGoodsService.getFreshGoodsByGtid(gtid);
        model.addAttribute("freshGoods",list);
        for (FreshGoods freshGoods:list){
            String img = freshGoods.getImg();
            String[] splits = img.split("-");
            String imgs = splits[0];
            strings.add(imgs);
        }
        return list;
    }*/
}
