package com.workflow.demo.service.system.fhlog;

import com.baomidou.mybatisplus.plugins.Page;
import com.workflow.demo.util.PageData;

import java.util.List;

/**
 * @Author: Elvis
 * @Date: 2019/8/31 23:00
 */
public interface FHlogManager {

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(String USERNAME, String CONTENT)throws Exception;

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception;

    /**列表
     * @param page
     * @throws Exception
     */
    public List<PageData> list(Page page)throws Exception;

    /**列表(全部)
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAll(PageData pd)throws Exception;

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception;

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS)throws Exception;
}
