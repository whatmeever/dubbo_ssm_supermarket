package com.layui.utils;

import java.io.Serializable;
import java.util.List;

public class DataUtil<T> implements Serializable {
    //接口状态，正常情况下为0
    private int code = 0;
    //接口信息,正常情况下为空""
    private String msg = "";
    //数据数量
    private int count;
    //数据
    private List<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
