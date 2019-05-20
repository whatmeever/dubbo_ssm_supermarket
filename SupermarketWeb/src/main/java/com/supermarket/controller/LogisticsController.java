package com.supermarket.controller;

import com.supermarket.pojo.Logistics;
import com.supermarket.pojo.LogisticsExample;
import com.supermarket.service.LogisticsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LogisticsController {
    @Resource
    private LogisticsService logisticsService;

    @GetMapping("/getLogisticsAll")
    public String getLogisticsAll(Model model){
        LogisticsExample logisticsExample = new LogisticsExample();
        LogisticsExample.Criteria criteria = logisticsExample.createCriteria();
        List<Logistics> logistics = logisticsService.selectByExample(logisticsExample);
        model.addAttribute("logistics",logistics);

        return "logistics";


    }

}
