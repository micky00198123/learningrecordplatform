package src.com.cslg.lrp.domain;

/**
 * 登录模型,封装了学号和密码
 */
public class LoginData {

    // 学号
    private String userId;

    // 密码
    private String password;

    public LoginData() {
    }

    public LoginData(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
