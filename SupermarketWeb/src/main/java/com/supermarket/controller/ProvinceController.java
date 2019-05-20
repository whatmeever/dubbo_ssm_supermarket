package com.supermarket.controller;

import com.supermarket.pojo.Province;
import com.supermarket.pojo.ProvinceExample;
import com.supermarket.service.ProvinceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProvinceController {
    @Resource
    private ProvinceService provinceService;

    private static ProvinceExample example;
    static {
        example = new ProvinceExample();
    }
    @ResponseBody
    @GetMapping("/getProvinces")
    public List<Province> getProvince(){
        List<Province> provinces = provinceService.selectByExample(example);
        return provinces;
    }

   /* @ResponseBody
    @PostMapping("/getProvinceByPid")
    public Province getProvinceByPid(HttpServletRequest request){
        String id = request.getParameter("pid");
        int pid = Integer.parseInt(id);
        Province province = provinceService.selectByPrimaryKey(pid);
        return province;
    }
*/
}
