package com.supermarket.controller;

import com.supermarket.pojo.Township;
import com.supermarket.pojo.TownshipExample;
import com.supermarket.service.TownShipService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TownShipController {
    @Resource
    private TownShipService townShipService;

    private  static TownshipExample example;

    static {
        example = new TownshipExample();
    }

    @ResponseBody
    @PostMapping("/getTownShips")
    public List<Township> getTownShips(HttpServletRequest request){
        String id = request.getParameter("tid");
        int tid = Integer.parseInt(id);
        example.clear();
        TownshipExample.Criteria criteria = example.createCriteria();
        criteria.andCidEqualTo(tid);
        List<Township> townships = townShipService.selectByExample(example);
        return  townships;
    }
}
