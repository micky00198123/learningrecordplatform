package com.cslg.lrp.service.impl;

import com.cslg.lrp.dao.NewsDaoImpl;
import com.cslg.lrp.domain.User;
import com.cslg.lrp.service.RegisterService;

/**
 * @author MLP
 */
public class RegisterServiceImpl implements RegisterService {

    private NewsDaoImpl nd = new NewsDaoImpl();

    @Override
    public boolean checkDuplicateNames(String id) {
        if(id == null || "".equals(id)) {
            return false;
        }
        return nd.getNewsTitle(id);
    }

    @Override
    public boolean registerAccount(User user) {
        if(user == null) {
            return false;
        }
        return nd.add(user);
    }
}
