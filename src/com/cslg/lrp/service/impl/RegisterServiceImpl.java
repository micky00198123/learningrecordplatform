package com.cslg.lrp.service.impl;

import com.cslg.lrp.dao.impl.NewsDaoImpl;
import com.cslg.lrp.domain.User;
import com.cslg.lrp.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {

    NewsDaoImpl nd = new NewsDaoImpl();

    @Override
    public boolean checkDuplicateNames(String id) {
        if(id == null || id.equals("")) {
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
