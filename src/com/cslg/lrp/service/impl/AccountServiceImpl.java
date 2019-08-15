package com.cslg.lrp.service.impl;

import com.cslg.lrp.domain.User;
import com.cslg.lrp.service.AccountService;
import com.cslg.lrp.util.ServiceTools;

/**
 * 登录注册业务实现类
 * @author MLP
 */
public class AccountServiceImpl implements AccountService {

    @Override
    public boolean cheekAccount(String userName, String password) {
        // 检查非空
        if(userName == null || password == null) {
            return false;
        }
        if(userName.equals("") || password.equals("")) {
            return false;
        }


        return false;
    }

    @Override
    public boolean saveAccount(User user) {
        // 检查非空
        if(user == null) {
            return false;
        }
        // 将用户密码进行MD5加密
        String mD5Password = ServiceTools.getMd5String(user.getUserPassword());
        if(mD5Password == null) {
            return false;
        }
        user.setUserPassword(mD5Password);

        return false;
    }
}
