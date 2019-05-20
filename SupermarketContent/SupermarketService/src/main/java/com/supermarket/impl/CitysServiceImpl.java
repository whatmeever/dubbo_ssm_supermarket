package com.supermarket.impl;

import com.supermarket.mapper.CitysMapper;
import com.supermarket.pojo.Citys;
import com.supermarket.pojo.CitysExample;
import com.supermarket.service.CitysService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CitysServiceImpl implements CitysService {
    @Resource
    private CitysMapper citysMapper;
    @Override
    public List<Citys> selectByExample(CitysExample example) {
        return citysMapper.selectByExample(example);
    }
}
