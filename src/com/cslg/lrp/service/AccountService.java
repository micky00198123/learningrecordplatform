package com.cslg.lrp.service;

import com.cslg.lrp.domain.User;

/**
 * 登录注册业务接口
 * @author MLP
 */
public interface AccountService {

    /**
     * 账号检查
     * @param userName 用户名
     * @param password 密码
     * @return 是否登录成功
     */
    boolean cheekAccount(String userName, String password);

    /**
     * 保存账号信息
     * @param user 用户类实例
     * @return 是否保存成功
     */
    boolean saveAccount(User user);

}
