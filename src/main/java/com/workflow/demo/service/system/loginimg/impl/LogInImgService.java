package com.workflow.demo.service.system.loginimg.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.workflow.demo.dao.DaoSupport;
import com.workflow.demo.service.system.loginimg.LogInImgManager;
import com.workflow.demo.util.PageData;

import javax.annotation.Resource;
import java.util.List;

/**
 * 登录页面背景图片
 * @Author: Elvis
 * @Date: 2019/8/31 23:18
 */
public class LogInImgService implements LogInImgManager {

    @Resource(name = "daoSupport")
    private DaoSupport dao;

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception{
        dao.save("LogInImgMapper.save", pd);
    }

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception{
        dao.delete("LogInImgMapper.delete", pd);
    }

    /**修改
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd)throws Exception{
        dao.update("LogInImgMapper.edit", pd);
    }

    /**列表
     * @param page
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<PageData> list(Page page)throws Exception{
        return (List<PageData>)dao.findForList("LogInImgMapper.datalistPage", page);
    }

    /**列表(全部)
     * @param pd
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<PageData> listAll(PageData pd)throws Exception{
        return (List<PageData>)dao.findForList("LogInImgMapper.listAll", pd);
    }

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception{
        return (PageData)dao.findForObject("LogInImgMapper.findById", pd);
    }

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
        dao.delete("LogInImgMapper.deleteAll", ArrayDATA_IDS);
    }

}
