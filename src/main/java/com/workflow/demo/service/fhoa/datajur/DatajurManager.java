package com.workflow.demo.service.fhoa.datajur;

import com.workflow.demo.util.PageData;

/**
 * @Author: Elvis
 * @Date: 2019/8/31 22:56
 */
public interface DatajurManager {

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception;

    /**修改
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd)throws Exception;

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception;

    /**取出某用户的组织数据权限
     * @param pd
     * @throws Exception
     */
    public PageData getDEPARTMENT_IDS(String USERNAME)throws Exception;
}
