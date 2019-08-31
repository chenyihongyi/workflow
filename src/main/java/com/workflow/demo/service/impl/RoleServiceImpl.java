package com.workflow.demo.service.impl;

import com.workflow.demo.entity.system.Role;
import com.workflow.demo.dao.RoleMapper;
import com.workflow.demo.service.RoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
	
}
