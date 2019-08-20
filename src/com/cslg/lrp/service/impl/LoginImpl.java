package com.cslg.lrp.service.impl;

import com.cslg.lrp.domain.LoginData;
import com.cslg.lrp.service.Login;
import com.cslg.lrp.util.ServiceTools;

public class LoginImpl implements Login {

    @Override
    public boolean loginAccount(LoginData ld) {

        if(ld == null) {
            return false;
        }
        // MD5加密
        ld.setPassword(ServiceTools.getMd5String(ld.getPassword()));

        return false;
    }
}
