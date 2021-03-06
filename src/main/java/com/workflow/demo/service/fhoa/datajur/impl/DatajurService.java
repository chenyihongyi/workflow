package com.workflow.demo.service.fhoa.datajur.impl;

import com.workflow.demo.dao.DaoSupport;
import com.workflow.demo.service.fhoa.datajur.DatajurManager;
import com.workflow.demo.util.PageData;

import javax.annotation.Resource;

/**
 * @Author: Elvis
 * @Date: 2019/8/31 22:57
 */
public class DatajurService implements DatajurManager {

    @Resource(name = "daoSupport")
    private DaoSupport dao;

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception{
        dao.save("DatajurMapper.save", pd);
    }

    /**修改
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd)throws Exception{
        dao.update("DatajurMapper.edit", pd);
    }


    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception{
        return (PageData)dao.findForObject("DatajurMapper.findById", pd);
    }

    /**取出某用户的组织数据权限
     * @param pd
     * @throws Exception
     */
    public PageData getDEPARTMENT_IDS(String USERNAME)throws Exception{
        return (PageData)dao.findForObject("DatajurMapper.getDEPARTMENT_IDS", USERNAME);
    }
}
