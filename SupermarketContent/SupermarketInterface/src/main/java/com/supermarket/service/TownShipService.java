package com.supermarket.service;

import com.supermarket.pojo.Township;
import com.supermarket.pojo.TownshipExample;

import java.util.List;

public interface TownShipService {
    List<Township> selectByExample(TownshipExample example);

}
