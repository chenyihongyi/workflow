package com.workflow.demo.service.system.buttonrightsManager;

import com.workflow.demo.util.PageData;

import java.util.List;

/**
 * @Author: Elvis
 * @Date: 2019/8/31 22:34
 */
public interface ButtonrightsManager {

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception;

    /**通过(角色ID和按钮ID)获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception;

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception;

    /**列表(全部)
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAll(PageData pd)throws Exception;

    /**列表(全部)左连接按钮表,查出安全权限标识(主副职角色综合)
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAllBrAndQxnameByZF(String[] ROLE_IDS)throws Exception;

    /**列表(全部)左连接按钮表,查出安全权限标识(主职角色)
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAllBrAndQxname(PageData pd)throws Exception;
}
