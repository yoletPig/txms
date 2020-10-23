package com.ict.txms.model;

public class ClockIn {
    private Integer id;

    private Integer userid;

    private String dt;

    private String dtt;

    private String way;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt == null ? null : dt.trim();
    }

    public String getDtt() {
        return dtt;
    }

    public void setDtt(String dtt) {
        this.dtt = dtt == null ? null : dtt.trim();
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way == null ? null : way.trim();
    }
}