package com.demo.pojo;

import java.io.Serializable;

/**
 * works
 * @author 
 */
public class Works implements Serializable {
    private Integer worksId;

    /**
     * 作品名
     */
    private String worksName;

    /**
     * 作品简介
     */
    private String worksSynopsis;

    /**
     * 作品图片链接
     */
    private String worksUrl;

    /**
     * 作品视频链接
     */
    private String worksVideo;

    /**
     * 作品作者（或工作室）
     */
    private String worksAuthor;

    /**
     * 作品上下架状态，0下架，1上架
     */
    private Integer worksStatus;

    private Long createTime;

    private String createBy;

    private Long updateTime;

    private String updateBy;

    /**
     * 下架时间
     */
    private Long putTime;

    /**
     * 下架人
     */
    private String putBy;

    /**
     * 所属一级导航栏
     */
    private Integer firstId;

    /**
     * 所属二级导航栏
     */
    private Integer secondId;

    private static final long serialVersionUID = 1L;

    public Integer getWorksId() {
        return worksId;
    }

    public void setWorksId(Integer worksId) {
        this.worksId = worksId;
    }

    public String getWorksName() {
        return worksName;
    }

    public void setWorksName(String worksName) {
        this.worksName = worksName;
    }

    public String getWorksSynopsis() {
        return worksSynopsis;
    }

    public void setWorksSynopsis(String worksSynopsis) {
        this.worksSynopsis = worksSynopsis;
    }

    public String getWorksUrl() {
        return worksUrl;
    }

    public void setWorksUrl(String worksUrl) {
        this.worksUrl = worksUrl;
    }

    public String getWorksVideo() {
        return worksVideo;
    }

    public void setWorksVideo(String worksVideo) {
        this.worksVideo = worksVideo;
    }

    public String getWorksAuthor() {
        return worksAuthor;
    }

    public void setWorksAuthor(String worksAuthor) {
        this.worksAuthor = worksAuthor;
    }

    public Integer getWorksStatus() {
        return worksStatus;
    }

    public void setWorksStatus(Integer worksStatus) {
        this.worksStatus = worksStatus;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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

    public Long getPutTime() {
        return putTime;
    }

    public void setPutTime(Long putTime) {
        this.putTime = putTime;
    }

    public String getPutBy() {
        return putBy;
    }

    public void setPutBy(String putBy) {
        this.putBy = putBy;
    }

    public Integer getFirstId() {
        return firstId;
    }

    public void setFirstId(Integer firstId) {
        this.firstId = firstId;
    }

    public Integer getSecondId() {
        return secondId;
    }

    public void setSecondId(Integer secondId) {
        this.secondId = secondId;
    }


}