package com.supermarket.impl;

import com.supermarket.mapper.LogisticsMapper;
import com.supermarket.pojo.Logistics;
import com.supermarket.pojo.LogisticsExample;
import com.supermarket.service.LogisticsService;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LogisticsServiceImpl implements LogisticsService {
    @Resource
    private LogisticsMapper logisticsMapper;
    @Override
    public List<Logistics> selectByExample(LogisticsExample example) {
        return logisticsMapper.selectByExample(example);
    }
}
