package com.supermarket.pojo;

import java.io.Serializable;
import java.util.Date;

public class Evaluation implements Serializable {
    private Integer eid;

    private String userId;

    private String fdid;

    private Integer grade;

    private Date evaDate;

    private String detial;

    private static final long serialVersionUID = 1L;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFdid() {
        return fdid;
    }

    public void setFdid(String fdid) {
        this.fdid = fdid == null ? null : fdid.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getEvaDate() {
        return evaDate;
    }

    public void setEvaDate(Date evaDate) {
        this.evaDate = evaDate;
    }

    public String getDetial() {
        return detial;
    }

    public void setDetial(String detial) {
        this.detial = detial == null ? null : detial.trim();
    }
}