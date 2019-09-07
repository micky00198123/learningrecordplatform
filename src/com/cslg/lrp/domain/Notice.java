package com.cslg.lrp.domain;

/**
 * @author HuayuFlora
 * @Data 2019/9/1 14:50
 * 封装发布者用户名，公告内容，最后修改时间，收藏标签
 */
public class Notice {
    private String publisherUserId;
    private String noticeContent;
    private String noticeTime;
    private boolean noticeCollection;
    public String getPublisherUserId() {
        return publisherUserId;
    }

    public void setPublisherUserId(String publisherUserId) {
        this.publisherUserId = publisherUserId;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public String getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    public boolean getNoticeCollection() {
        return noticeCollection;
    }

    public void setNoticeCollection(boolean noticeCollection) {
        this.noticeCollection = noticeCollection;
    }
}
