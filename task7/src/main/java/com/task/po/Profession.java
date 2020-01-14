package com.task.po;

import java.io.Serializable;

/**
 * profession
 * @author 
 */
public class Profession implements Serializable {
    private Long id;

    /**
     * 1为前端，2后端，3移动开发，4整站开发，5运营维护
     */
    private Integer classifyId;

    /**
     * 职业名
     */
    private String name;

    /**
     * 头像
     */
    private String picture;

    /**
     * 介绍
     */
    private String introduction;

    /**
     * 门槛
     */
    private Long sill;

    /**
     * 在学人数
     */
    private Long grade;

    /**
     * 门栏
     */
    private String growth;

    /**
     * 稀缺度
     */
    private Long scarcity;

    /**
     * 一阶段薪水
     */
    private String salaryOne;

    /**
     * 二阶段薪水
     */
    private String salaryTwo;

    /**
     * 三阶段薪水
     */
    private String salaryThree;

    /**
     * 人数
     */
    private Long number;

    private Long createTime;

    private Long updateTime;

    private String createBy;

    private String updateBy;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Long getSill() {
        return sill;
    }

    public void setSill(Long sill) {
        this.sill = sill;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public Long getScarcity() {
        return scarcity;
    }

    public void setScarcity(Long scarcity) {
        this.scarcity = scarcity;
    }

    public String getSalaryOne() {
        return salaryOne;
    }

    public void setSalaryOne(String salaryOne) {
        this.salaryOne = salaryOne;
    }

    public String getSalaryTwo() {
        return salaryTwo;
    }

    public void setSalaryTwo(String salaryTwo) {
        this.salaryTwo = salaryTwo;
    }

    public String getSalaryThree() {
        return salaryThree;
    }

    public void setSalaryThree(String salaryThree) {
        this.salaryThree = salaryThree;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
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
}