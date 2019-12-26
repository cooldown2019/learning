package com.demo.pojo;

import java.io.Serializable;

/**
 * navbar_first
 * @author 
 */
public class NavbarFirst implements Serializable {
    private Integer firstId;

    /**
     * 一级导航栏名
     */
    private String firstName;

    private Long createTime;

    private String creatBy;

    private Long updateTime;

    private String updateBy;

    private static final long serialVersionUID = 1L;

    public Integer getFirstId() {
        return firstId;
    }

    public void setFirstId(Integer firstId) {
        this.firstId = firstId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(String creatBy) {
        this.creatBy = creatBy;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

}