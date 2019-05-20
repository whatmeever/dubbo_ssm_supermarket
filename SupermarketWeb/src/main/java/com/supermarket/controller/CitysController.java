package com.supermarket.controller;

import com.supermarket.pojo.Citys;
import com.supermarket.pojo.CitysExample;
import com.supermarket.service.CitysService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Controller
public class CitysController {
    @Resource
    private CitysService citysService;

    private static CitysExample example;
    static {
        example = new CitysExample();
    }

    @ResponseBody
    @PostMapping("/getCitys")
    public List<Citys> getCitys(CitysExample example, HttpServletRequest request) {
        String id = request.getParameter("pid");
        int pid = Integer.parseInt(id);
        example.clear();
        CitysExample.Criteria criteria = example.createCriteria();
        criteria.andPidEqualTo(pid);
        List<Citys> citys = citysService.selectByExample(example);
        return citys;
    }
}
