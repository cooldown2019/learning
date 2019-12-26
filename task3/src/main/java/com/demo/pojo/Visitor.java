package com.demo.pojo;



import org.springframework.stereotype.Component;

import java.io.Serializable;


/**
 * visitor
 * @author 
 */
@Component
public class Visitor implements Serializable {
    private Integer visitorId;

    /**
     * 游客昵称（随机生成）
     */
    private String visitorName;

    private Long createTime;

    private static final long serialVersionUID = 1L;



    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

}