package com.cslg.lrp.domain;

/**
 * @author HuayuFlora
 * @Data 2019/9/1 14:50
 * 封装日志作者用户名，日志内容，日志最后修改时间，赞同量，收藏标签
 */
public class Journal {
    private String journalUserId;
    private String journalContent;
    private String journalTime;
    private int journalApproval;
    private boolean journalCollection;
    public String getJournalUserId() {
        return journalUserId;
    }

    public void setJournalUserId(String journalUserId) {
        this.journalUserId = journalUserId;
    }

    public String getJournalContent() {
        return journalContent;
    }

    public void setJournalContent(String journalContent) {
        this.journalContent = journalContent;
    }

    public String getJournalTime() {
        return journalTime;
    }

    public void setJournalTime(String journalTime) {
        this.journalTime = journalTime;
    }
    public int getJournalApproval() {
        return journalApproval;
    }

    public void setJournalApproval(int journalApproval) {
        this.journalApproval = journalApproval;
    }

    public boolean getJournalCollection() {
        return journalCollection;
    }

    public void setJournalCollection(boolean journalCollection) {
        this.journalCollection = journalCollection;
    }
}
