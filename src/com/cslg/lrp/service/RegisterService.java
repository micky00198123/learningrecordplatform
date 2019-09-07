package com.cslg.lrp.service;

import com.cslg.lrp.domain.LoginData;
import com.cslg.lrp.domain.User;

/**
 * @author MLP
 */
public interface RegisterService {

    /**
     * 检查学号是否出现重复
     * @param id 学号
     * @return 是否重复
     */
    public boolean checkDuplicateNames(String id);

    /**
     * 注册用户
     * @param user 用户个人信息模型
     * @param ld 用户账号密码模型
     * @return 是否注册成功
     */
    public boolean registerAccount(User user, LoginData ld);

}
