package com.cslg.lrp.dao;

import com.cslg.lrp.domain.*;

/**
 * @author HuayuFlora
 * @Data 2019/9/1 14:50
 */
public interface Personal {
    /**
     * 根据登录信息查找所有信息
     * @return user
     */
    public void findAll(LoginData user);

    /**
     *判断打卡记录是否添加成功
     * @param user
     * @param data
     * @return true/false
     */
    boolean addCarding(User user,String data);

    /**
     * 查找该用户打卡记录
     * @param user
     * @return CardNote
     */
    public CardNote findCardingNote(User user);

    /**
     * 根据部门编码查找对应用户
     * @param IdMatch
     */
    public void depMember(IdMatch IdMatch);

    /**
     * 修改用户信息
     * @param user
     * @return true/false
     */
    boolean updateUser(User user);

    /**
     * 根据部门名称，查找对应标签技术列表
     * @param department
     */
    public void departmentSkill(Department department);
}
