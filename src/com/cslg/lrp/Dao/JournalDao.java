package com.cslg.lrp.dao;

import com.cslg.lrp.domain.Journal;

/**
 * @author HuayuFlora
 * @Data 2019/9/1 14:50
 */
public interface JournalDao {
    /**
     * 获取日志记录列表
     */
    public void getJournalList();

    /**
     * 判断是否加入收藏
     * @param journal
     * @return true/false
     */
    boolean addCollection(Journal journal);

    /**
     * 获取收藏记录列表
     */
    public void getCollectionList();

    /**
     * 修改日志信息（赞同量）
     * @param journal
     * @return
     */
    boolean updateJournal(Journal journal);
    /**
     * 判断是否取消已收藏
     * @param journal
     * @return
     */
    boolean deleteCollection(Journal journal);
}
