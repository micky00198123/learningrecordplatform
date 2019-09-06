package com.cslg.lrp.domain;


/**
 * 用户Id对应的部门Id（一个用户属于哪个部门）
 * 可以一对多，一个用户Id有多条记录，对应不同部门Id
 */
public class IdMatch {

    private String userId;
    private int deptId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }


}
