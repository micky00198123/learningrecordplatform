package com.cslg.lrp.service.impl;

import com.cslg.lrp.Dao.NewsDaoImpl;
import com.cslg.lrp.domain.LoginData;
import com.cslg.lrp.service.LoginService;
import com.cslg.lrp.util.ServiceTools;

/**
 * @author MLP
 */
public class LoginServiceImpl implements LoginService {

    private NewsDaoImpl nd = new NewsDaoImpl();


    @Override
    public boolean loginAccount(LoginData ld) {

        if(ld == null) {
            return false;
        }
        // MD5加密
        ld.setPassword(ServiceTools.getMd5String(ld.getPassword()));
        return nd.getOldsTitle(ld);
    }
}
