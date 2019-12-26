package com.demo.pojo;

import java.io.Serializable;

/**
 * guestbook
 * @author 
 */
public class Guestbook implements Serializable {
    /**
     * 留言id
     */
    private Integer guestbookId;

    /**
     * 作品id
     */
    private Integer worksId;

    private Integer adminId;

    /**
     * 访客id
     */
    private Integer visitorId;

    /**
     * 访客留言内容
     */
    private String message;

    /**
     * 是否为精选评论，0不是，1为精选
     */
    private Integer guerstbookStatus;

    /**
     * 修改留言状态的时间
     */
    private Long statusTime;

    /**
     * 修改留言状态的人
     */
    private String statusBy;

    private Long createTime;

    private String createBy;

    private static final long serialVersionUID = 1L;

    public Integer getGuestbookId() {
        return guestbookId;
    }

    public void setGuestbookId(Integer guestbookId) {
        this.guestbookId = guestbookId;
    }

    public Integer getWorksId() {
        return worksId;
    }

    public void setWorksId(Integer worksId) {
        this.worksId = worksId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getGuerstbookStatus() {
        return guerstbookStatus;
    }

    public void setGuerstbookStatus(Integer guerstbookStatus) {
        this.guerstbookStatus = guerstbookStatus;
    }

    public Long getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(Long statusTime) {
        this.statusTime = statusTime;
    }

    public String getStatusBy() {
        return statusBy;
    }

    public void setStatusBy(String statusBy) {
        this.statusBy = statusBy;
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


}