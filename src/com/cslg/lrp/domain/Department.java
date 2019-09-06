package com.cslg.lrp.domain;


/**
 * 每个部门Id对应的部门名称
 * 部门Id数据库中默认为0（不对应任何部门）
 */
public class Department{

    private int deptId;
    private String deptName;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


}