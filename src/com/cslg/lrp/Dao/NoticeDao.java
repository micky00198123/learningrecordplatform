package com.cslg.lrp.dao;

import com.cslg.lrp.domain.Notice;

/**
 * @author HuayuFlora
 * @Data 2019/9/1 14:50
 */
public interface NoticeDao {
    /**
     * 查看公告
     */
    public void getNotice();
    /**
     * 注册
     *  @param notice
     * @return 是否添加成功
     */
    boolean add(Notice notice);
    /**
     * 删除
     * @param notice
     * @return 是否删除成功
     */
    boolean delete(Notice notice);
    /**
     * 修改
     * @param notice
     * @return 是否修改成功
     */
    boolean update(Notice notice);

    /**
     * 判断是否加入收藏
     * @param notice
     * @return
     */
    boolean collectionNotice(Notice notice);

    /**
     * 判断是否取消已收藏
     * @param notice
     * @return
     */
    boolean deleteCollectionNotice(Notice notice);
}
