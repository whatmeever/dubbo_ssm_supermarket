package com.supermarket.service;

import com.supermarket.pojo.Logistics;
import com.supermarket.pojo.LogisticsExample;

import java.util.List;

public interface LogisticsService {
    List<Logistics> selectByExample(LogisticsExample example);
}
