package com.cslg.lrp.dao;

import com.cslg.lrp.domain.LoginData;
import com.cslg.lrp.domain.User;

public interface NewsDao {
    /**
     * 查看重名
     * @param id
     * @return 该用户名是否存在
     */
    boolean getNewsTitle(String id);
    /**
     * 登录查询
     *@param user
     * @return 是否登录成功
     */
    public boolean getOldsTitle(LoginData user);

    /**
     * 是否注册成功
     * @param users
     * @param user
     * @return 是否注册成功
     */
    boolean add(User users,LoginData user);
}
