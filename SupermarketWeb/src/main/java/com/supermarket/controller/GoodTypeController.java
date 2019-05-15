package com.supermarket.controller;

import com.supermarket.pojo.GoodType;
import com.supermarket.pojo.GoodTypeExample;
import com.supermarket.service.GoodTypeSerivce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GoodTypeController {
    @Resource
    private GoodTypeSerivce goodTypeSerivce;
    private GoodTypeExample example;

    @ResponseBody
    @GetMapping("/getGoodTypes")
    public List<GoodType> getGoodTypes(){
        return goodTypeSerivce.getGoodTypes(example);
    }
}
