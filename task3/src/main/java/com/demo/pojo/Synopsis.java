package com.demo.pojo;

import java.io.Serializable;

/**
 * synopsis
 * @author 
 */
public class Synopsis implements Serializable {
    /**
     * 简介表id（轨迹，工作室简介，成员介绍）
     */
    private Integer synopsisId;

    /**
     * 简介图片、放url
     */
    private String synopsisImg;

    private String synopsisName;

    /**
     * 简介的视频连接
     */
    private String synopsisVideo;

    /**
     * 简介内容
     */
    private String synopsisContent;

    private Long createTime;

    private String createBy;

    private Long updateTime;

    private String updateBy;

    private static final long serialVersionUID = 1L;

    public Integer getSynopsisId() {
        return synopsisId;
    }

    public void setSynopsisId(Integer synopsisId) {
        this.synopsisId = synopsisId;
    }

    public String getSynopsisImg() {
        return synopsisImg;
    }

    public void setSynopsisImg(String synopsisImg) {
        this.synopsisImg = synopsisImg;
    }

    public String getSynopsisName() {
        return synopsisName;
    }

    public void setSynopsisName(String synopsisName) {
        this.synopsisName = synopsisName;
    }

    public String getSynopsisVideo() {
        return synopsisVideo;
    }

    public void setSynopsisVideo(String synopsisVideo) {
        this.synopsisVideo = synopsisVideo;
    }

    public String getSynopsisContent() {
        return synopsisContent;
    }

    public void setSynopsisContent(String synopsisContent) {
        this.synopsisContent = synopsisContent;
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