package com.cslg.lrp.dao.impl;

import com.cslg.lrp.dao.Personal;
import com.cslg.lrp.domain.*;

/**
 * @author HuayuFlora
 * @Data 2019/9/1 14:50
 */
public class PersonalImpl implements Personal {
    @Override
    public void findAll(LoginData user) {

    }

    @Override
    public boolean addCarding(User user, String data) {
        return false;
    }

    @Override
    public CardNote findCardingNote(User user) {
        return null;
    }

    @Override
    public void depMember(IdMatch IdMatch) {

    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public void departmentSkill(Department department) {

    }
}
