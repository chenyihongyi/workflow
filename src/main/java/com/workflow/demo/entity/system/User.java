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
@TableName("sys_user")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("USER_ID")
	private String userId;
	@TableField("USERNAME")
	private String username;
	@TableField("PASSWORD")
	private String password;
	@TableField("NAME")
	private String name;
	@TableField("RIGHTS")
	private String rights;
	@TableField("ROLE_ID")
	private String roleId;
	@TableField("LAST_LOGIN")
	private String lastLogin;
	@TableField("IP")
	private String ip;
	@TableField("STATUS")
	private String status;
	@TableField("BZ")
	private String bz;
	@TableField("SKIN")
	private String skin;
	@TableField("EMAIL")
	private String email;
	@TableField("NUMBER")
	private String number;
	@TableField("PHONE")
	private String phone;
	@TableField("ROLE_IDS")
	private String roleIds;





}
