package com.workflow.demo.service.impl;

import com.workflow.demo.model.Department;
import com.workflow.demo.dao.DepartmentMapper;
import com.workflow.demo.service.DepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {
	
}
