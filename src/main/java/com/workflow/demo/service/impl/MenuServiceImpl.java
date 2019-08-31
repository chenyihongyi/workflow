package com.workflow.demo.service.impl;

import com.workflow.demo.entity.system.Menu;
import com.workflow.demo.dao.MenuMapper;
import com.workflow.demo.service.MenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenyihongyi
 * @since 2019-08-31
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {
	
}
