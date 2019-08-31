package com.workflow.demo.service.system.buttonrightsManager.impl;

import com.workflow.demo.dao.DaoSupport;
import com.workflow.demo.service.system.buttonrightsManager.ButtonrightsManager;
import com.workflow.demo.util.PageData;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Elvis
 * @Date: 2019/8/31 22:36
 */
public class ButtonrightsService implements ButtonrightsManager {

    @Resource(name = "daoSupport")
    private DaoSupport dao;

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception{
        dao.save("ButtonrightsMapper.save", pd);
    }

    /**通过(角色ID和按钮ID)获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd) throws Exception {
        return (PageData)dao.findForObject("ButtonrightsMapper.findById", pd);
    }

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception{
        dao.delete("ButtonrightsMapper.delete", pd);
    }

    /**列表(全部)
     * @param pd
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<PageData> listAll(PageData pd)throws Exception{
        return (List<PageData>)dao.findForList("ButtonrightsMapper.listAll", pd);
    }

    /**列表(全部)左连接按钮表,查出安全权限标识(主副职角色综合)
     * @param pd
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<PageData> listAllBrAndQxnameByZF(String[] ROLE_IDS)throws Exception{
        return (List<PageData>)dao.findForList("ButtonrightsMapper.listAllBrAndQxnameByZF", ROLE_IDS);
    }

    /**列表(全部)左连接按钮表,查出安全权限标识(主职角色)
     * @param pd
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<PageData> listAllBrAndQxname(PageData pd)throws Exception{
        return (List<PageData>)dao.findForList("ButtonrightsMapper.listAllBrAndQxname", pd);
    }

}
