package com.cslg.lrp.service;

/**
 * 登录注册业务接口
 * @author MLP
 */
public interface AccountService {

    /**
     * 检查是否登录成功
     * @param userName
     * @param password
     * @return
     */
    public boolean cheekAccount(String userName, String password);

    /**
     * 保存注册的用户信息
     * @param user
     * @return
     */
    public boolean saveAccount(User user);

}
