package com.supermarket.impl;

import com.supermarket.mapper.ProvinceMapper;
import com.supermarket.pojo.Province;
import com.supermarket.pojo.ProvinceExample;
import com.supermarket.service.ProvinceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Resource
    private ProvinceMapper provinceMapper;
    @Override
    public List<Province> selectByExample(ProvinceExample example) {
        return provinceMapper.selectByExample(example);
    }

    @Override
    public Province selectByPrimaryKey(Integer pid) {
        return provinceMapper.selectByPrimaryKey(pid);
    }
}
