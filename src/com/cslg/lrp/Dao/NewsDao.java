package com.cslg.lrp.dao;

import com.cslg.lrp.domain.LoginData;
import com.cslg.lrp.domain.User;

public interface NewsDao {
    /**
     * 查询列表
     * @return 列表
     * emmm
     */
    public void getList();
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
     * 注册
     *  @param user
     * @return 是否添加成功
     */
    boolean add(User user);
    /**
     * 删除
     * @param user
     * @return 是否删除成功
     */
    boolean delete(User user);
    /**
     * 修改
     * @param user
     * @return 是否删除成功
     */
    boolean update(User user);
}
