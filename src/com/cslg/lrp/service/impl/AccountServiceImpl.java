package com.cslg.lrp.service.impl;

import com.cslg.lrp.service.AccountService;
import com.cslg.lrp.util.ServiceTools;

/**
 * 登录注册业务实现类
 * @author MLP
 */
public class AccountServiceImpl implements AccountService {

    /**
     * 检查是否登录成功
     *
     * @param userName
     * @param password
     * @return
     */
    @Override
    public boolean cheekAccount(String userName, String password) {

        return false;
    }

    /**
     * 保存注册的用户信息
     *
     * @param user
     * @return
     */
    @Override
    public boolean saveAccount(User user) {
        // 将用户密码进行MD5加密
        String mD5Password = ServiceTools.getMd5String(user.getUserPassword);
        user.setUserPassword(mD5Password);

        return false;
    }
}
