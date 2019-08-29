package src.com.cslg.lrp.Dao.untitled.src.Dao;

import com.cslg.lrp.domain.User;
import com.cslg.lrp.domain.LoginData;

public interface NewsDao {
    public void getList();
    /**
     * 查询列表
     * @return 列表
     * emmm
     */
    boolean getNewsTitle(String id);
    /**
     * 查看重名
     * @paramuserName 用户名
     * @return 该用户名是否存在
     */
    public boolean getOldsTitle(LoginData user);
    /**
     * 登录查询
     *@paramuserName 用户名
     *  @parampassword 密码
     * @return 是否登录成功
     */
    boolean add(User users);
    /**
     * 注册
     *  @parampuser内容
     * @return 是否添加成功
     */
    boolean delete(User users);
    /**
     * 修改
     * @paramuser内容
     * @return 是否删除成功
     */
    boolean update(User users);
    /**
     * 修改
     * @param user内容
     * @return 是否修改成功
     */

}
