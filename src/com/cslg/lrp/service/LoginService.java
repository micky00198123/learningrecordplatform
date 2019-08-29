package com.cslg.lrp.service;

import com.cslg.lrp.domain.LoginData;

/**
 * @author MLP
 */
public interface LoginService {

    /**
     * 检查用户名和密码是否匹配
     * @param ld 登录模型
     * @return 是否登录成功
     */
    public boolean loginAccount(LoginData ld);

}
