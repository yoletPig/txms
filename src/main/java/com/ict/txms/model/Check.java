package com.ict.txms.model;

public class Check {
    private String subtime;

    private Integer checkuserid;

    private Integer checkstate;

    private String checktable;

    private String checkcontent;

    private Integer checkroleid;

    private String checktext;

    private String checktime;

    public String getSubtime() {
        return subtime;
    }

    public void setSubtime(String subtime) {
        this.subtime = subtime == null ? null : subtime.trim();
    }

    public Integer getCheckuserid() {
        return checkuserid;
    }

    public void setCheckuserid(Integer checkuserid) {
        this.checkuserid = checkuserid;
    }

    public Integer getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(Integer checkstate) {
        this.checkstate = checkstate;
    }

    public String getChecktable() {
        return checktable;
    }

    public void setChecktable(String checktable) {
        this.checktable = checktable == null ? null : checktable.trim();
    }

    public String getCheckcontent() {
        return checkcontent;
    }

    public void setCheckcontent(String checkcontent) {
        this.checkcontent = checkcontent == null ? null : checkcontent.trim();
    }

    public Integer getCheckroleid() {
        return checkroleid;
    }

    public void setCheckroleid(Integer checkroleid) {
        this.checkroleid = checkroleid;
    }

    public String getChecktext() {
        return checktext;
    }

    public void setChecktext(String checktext) {
        this.checktext = checktext == null ? null : checktext.trim();
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }
}