package com.workflow.demo.service.system.menu;

import com.workflow.demo.entity.system.Menu;
import com.workflow.demo.util.PageData;

import java.util.List;

/**
 * @Author: Elvis
 * @Date: 2019/8/31 22:18
 */
public interface MenuManager {
    /**
     * @param parentId
     * @return
     * @throws Exception
     */
    public List<Menu> listSubMenuByParentId(String parentId)throws Exception;

    /**
     * @param pd
     * @return
     * @throws Exception
     */
    public PageData getMenuById(PageData pd) throws Exception;

    /**
     * @param menu
     * @throws Exception
     */
    public void saveMenu(Menu menu) throws Exception;

    /**
     * @param pd
     * @return
     * @throws Exception
     */
    public PageData findMaxId(PageData pd) throws Exception;

    /**
     * @param MENU_ID
     * @throws Exception
     */
    public void deleteMenuById(String MENU_ID) throws Exception;

    /**
     * @param menu
     * @throws Exception
     */
    public void edit(Menu menu) throws Exception;

    /**
     * @param pd
     * @return
     * @throws Exception
     */
    public PageData editicon(PageData pd) throws Exception;

    /**
     * @param MENU_ID
     * @return
     * @throws Exception
     */
    public List<Menu> listAllMenu(String MENU_ID) throws Exception;

    /**
     * @param MENU_ID
     * @return
     * @throws Exception
     */
    public List<Menu> listAllMenuQx(String MENU_ID) throws Exception;
}
