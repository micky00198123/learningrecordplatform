package com.cslg.lrp.service;

import com.cslg.lrp.domain.LoginData;

public interface Login {

    /**
     * 检查是否登录成功
     * @param ld 登录模型
     * @return 是否登录成功
     */
    public boolean loginAccount(LoginData ld);

}
