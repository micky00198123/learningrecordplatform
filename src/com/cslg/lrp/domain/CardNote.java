package com.cslg.lrp.domain;

/**
 * @author HuayuFlora
 * @Data 2019/9/1 14:50
 * 封装打卡用户：学号（账号）、用户名
 * 打卡时间
 */
public class CardNote {
    private String cardUserId;
    private String cardUserName;
    private String cardUserTime;
    public String getCardUserId() {
        return cardUserId;
    }

    public void setCardUserId(String cardUserId) {
        this.cardUserId = cardUserId;
    }

    public String getCardUserName() {
        return cardUserName;
    }

    public void setCardUserName(String cardUserName) {
        this.cardUserName = cardUserName;
    }

    public String getCardUserSex() {
        return cardUserTime;
    }

    public void setCardUserSex(String cardUserTime) {
        this.cardUserTime = cardUserTime;
    }
}
