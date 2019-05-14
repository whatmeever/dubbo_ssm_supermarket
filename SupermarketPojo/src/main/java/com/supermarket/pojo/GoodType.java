package com.supermarket.pojo;

import java.io.Serializable;

public class GoodType implements Serializable {
    private Integer gtid;

    private String gtname;

    private static final long serialVersionUID = 1L;

    public Integer getGtid() {
        return gtid;
    }

    public void setGtid(Integer gtid) {
        this.gtid = gtid;
    }

    public String getGtname() {
        return gtname;
    }

    public void setGtname(String gtname) {
        this.gtname = gtname == null ? null : gtname.trim();
    }
}