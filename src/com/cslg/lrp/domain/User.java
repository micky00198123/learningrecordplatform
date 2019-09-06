package com.cslg.lrp.domain;


/**
 * 封装用户个人信息：学号（账号）、用户名、用户性别、年级、技术、是否单身
 * 登陆信息（密码）在LoginData
 * 所在部门在IdMatch
 */
public class User {

    private String userId;
    private String userName;
    private String userSex;
    private int userGrade;
//    private String userDept;
    private String userTech;
    private String userSingle;
/**
    * private String userNum;
 */
//    private String userPassword;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public int getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(int userGrade) {
        this.userGrade = userGrade;
    }

//    public String getUserDept() {
//        return userDept;
//    }
//
//    public void setUserDept(String userDept) {
//        this.userDept = userDept;
//    }

    public String getUserTech() {
        return userTech;
    }

    public void setUserTech(String userTech) {
        this.userTech = userTech;
    }

    public String getUserSingle() {
        return userSingle;
    }

    public void setUserSingle(String userSingle) {
        this.userSingle = userSingle;
    }
/**
  *  public String getUserNum() {
   *     return userNum;
   * }
*
 *   public void setUserNum(String userNum) {
  *      this.userNum = userNum;
   * }
*/
//    public String getUserPassword() {
//        return userPassword;
//    }
//
//    public void setUserPassword(String userPassword) {
//        this.userPassword = userPassword;
//    }




}
