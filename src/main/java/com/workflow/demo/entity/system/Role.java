package com.workflow.demo.entity.system;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenyihongyi
 * @since 2019-08-31
 */
@TableName("sys_role")
@Data
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ROLE_ID")
	private String roleId;

	@TableField("ROLE_NAME")
	private String roleName;

	@TableField("RIGHTS")  //上级ID
	private String rights;

	@TableField("PARENT_ID")
	private String parentId;

	@TableField("ADD_QX")
	private String addQx;

	@TableField("DEL_QX")
	private String delQx;

	@TableField("EDIT_QX")
	private String editQx;

	@TableField("CHA_QX")
	private String chaQx;

	@TableField("RNUMBER")
	private String rnumber;




}
