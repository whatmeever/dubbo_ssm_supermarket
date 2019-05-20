package com.supermarket.impl;

import com.supermarket.mapper.TownshipMapper;
import com.supermarket.pojo.Township;
import com.supermarket.pojo.TownshipExample;
import com.supermarket.service.TownShipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TownShipServiceImpl implements TownShipService {
    @Resource
    private TownshipMapper townshipMapper;

    @Override
    public List<Township> selectByExample(TownshipExample example) {
        return townshipMapper.selectByExample(example);
    }
}
