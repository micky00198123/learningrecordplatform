package com.cslg.lrp.domain;

/**
 * 登录模型,封装了用户名和密码
 */
public class LoginData {

    // 用户名
    private String userName;

    //密码
    private String password;

    public LoginData() {
    }

    public LoginData(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
