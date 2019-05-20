package com.supermarket.base;

import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;


public class BaseRedisDao {

    @Resource
    protected RedisTemplate<String,Object> redisTemplate;

    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public RedisTemplate<String, Object> getRedisTemplate() {
        return redisTemplate;
    }
}
