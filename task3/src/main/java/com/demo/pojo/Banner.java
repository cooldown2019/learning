package com.demo.pojo;

import java.io.Serializable;

/**
 * banner
 * @author 
 */
public class Banner implements Serializable {
    /**
     * 轮播图id
     */
    private Integer bannerId;

    /**
     * 轮播图名字
     */
    private String bannerName;

    /**
     * 作品链接
     */
    private String bannerUrl;

    /**
     * 对应封面作品的链接
     */
    private String bannerImg;

    /**
     * 上下架状态,  0表示下架，1表示上架
     */
    private Integer bannerStatus;

    private Long createTime;

    private String createBy;

    private Long updateTime;

    private String updateBy;

    private static final long serialVersionUID = 1L;

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    public Integer getBannerStatus() {
        return bannerStatus;
    }

    public void setBannerStatus(Integer bannerStatus) {
        this.bannerStatus = bannerStatus;
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


}