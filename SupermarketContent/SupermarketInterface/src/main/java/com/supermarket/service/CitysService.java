package com.supermarket.service;

import com.supermarket.pojo.Citys;
import com.supermarket.pojo.CitysExample;

import java.util.List;

public interface CitysService {
    List<Citys> selectByExample(CitysExample example);
}
