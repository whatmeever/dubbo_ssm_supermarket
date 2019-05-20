package com.supermarket.util;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class RedisSaveManagerUtil{

    @Resource
    protected RedisTemplate<String,Object> redisTemplate;

    //增加一个key-value
    public boolean add(final String key,final String value){
        boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                //redisTemplate对象序列化
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                byte[] keyb = serializer.serialize(key);
                byte[] valueb = serializer.serialize(value);
                //使用redisConnection对象set key-value
                return redisConnection.setNX(keyb,valueb);
            }
        });
        return result;
    }

    //批量新增 使用pipeline
    public boolean add(final List<String> keys,final List<String> values){
        boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                for (int i = 0;i < values.size();i++){
                    byte[]  keyb = serializer.serialize(keys.get(i));
                    byte[] valueb = serializer.serialize(values.get(i));
                    redisConnection.setNX(keyb,valueb);
                }
                return true;
            }
        },false,true);
        return result;
    }

    //删除一组
    public void delete(final List<String> keys){
        redisTemplate.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                for (String i : keys){
                    byte[] key = serializer.serialize(i);
                    redisConnection.del(key);
                }
                return true;
            }
        });
    }

    //删除一个
    public void delete(String key){
        List<String> list = new ArrayList<>();
        list.add(key);
        delete(list);
    }
    //获取一个key-value
    public String get(final String key){
        String result = redisTemplate.execute(new RedisCallback<String>() {
            @Override
            public String doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                byte[] keyb = serializer.serialize(key);
                byte[] value = redisConnection.get(keyb);
                if (value == null){
                    return null;
                }
                String valueb = serializer.deserialize(value);
                return valueb;
            }
        });
        return result;
    }

    //修改 key-value
    public boolean update(final String key,final String value){
        if (get(key) == null){
            throw new NullPointerException("数据不存在，key="+key);
        }
        boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                byte[] keyb = serializer.serialize(key);
                byte[] valueb = serializer.serialize(value);
                redisConnection.set(keyb,valueb);
                return true;
            }
        });
        return result;
    }
}
