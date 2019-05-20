package com.supermarket.service;

import com.supermarket.pojo.Province;
import com.supermarket.pojo.ProvinceExample;

import java.util.List;

public interface ProvinceService {
    List<Province> selectByExample(ProvinceExample example);

    Province selectByPrimaryKey(Integer pid);
}
