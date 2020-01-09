package com.task.po;

import java.io.Serializable;

/**
 * student
 * @author 
 */
public class Student implements Serializable {
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 照片
     */
    private String picture;

    /**
     * 是否工作
     */
    private Integer working;

    /**
     * 公司名称
     */
    private String company;

    /**
     * 职位
     */
    private String job;

    /**
     * 职业id
     */
    private Integer professionId;

    /**
     * 经验年限
     */
    private String expreience;

    /**
     * 是否为优秀员工
     */
    private Integer excellent;

    private Long createTime;

    private Long updateTime;

    private String createBy;

    private String updateBy;

    /**
     * 职业
     */
    private String profession;

    private static final long serialVersionUID = 1L;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getWorking() {
        return working;
    }

    public void setWorking(Integer working) {
        this.working = working;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getProfessionId() {
        return professionId;
    }

    public void setProfessionId(Integer professionId) {
        this.professionId = professionId;
    }

    public String getExpreience() {
        return expreience;
    }

    public void setExpreience(String expreience) {
        this.expreience = expreience;
    }

    public Integer getExcellent() {
        return excellent;
    }

    public void setExcellent(Integer excellent) {
        this.excellent = excellent;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}