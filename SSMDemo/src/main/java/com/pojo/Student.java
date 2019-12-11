package com.pojo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Student {
    @NotNull(message = "id不能为空")
    private long id;


    @NotBlank(message = "姓名不能为空")
    private String name;

    private long qq;

    private String jnshutype;

    private String jointime;

    private String school;

    private long onlineid;

    private String dailyurl;

    private String slogan;

    private String counsellor;

    private String knownpath;

    private Date createtime;

    private Date updatetime;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qq=" + qq +
                ", jnshutype='" + jnshutype + '\'' +
                ", jointime=" + jointime +
                ", school='" + school + '\'' +
                ", onlineid=" + onlineid +
                ", dailyurl='" + dailyurl + '\'' +
                ", slogan='" + slogan + '\'' +
                ", counsellor='" + counsellor + '\'' +
                ", knownpath='" + knownpath + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQq() {
        return qq;
    }

    public void setQq(long qq) {
        this.qq = qq;
    }

    public String getJnshutype() {
        return jnshutype;
    }

    public void setJnshutype(String jnshutype) {
        this.jnshutype = jnshutype;
    }

    public String getJointime() {
        return jointime;
    }

    public void setJointime(String jointime) {
        this.jointime = jointime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public long getOnlineid() {
        return onlineid;
    }

    public void setOnlineid(long onlineid) {
        this.onlineid = onlineid;
    }

    public String getDailyurl() {
        return dailyurl;
    }

    public void setDailyurl(String dailyurl) {
        this.dailyurl = dailyurl;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(String counsellor) {
        this.counsellor = counsellor;
    }

    public String getKnownpath() {
        return knownpath;
    }

    public void setKnownpath(String knownpath) {
        this.knownpath = knownpath;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
