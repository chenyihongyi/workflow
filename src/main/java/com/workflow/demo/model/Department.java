package com.workflow.demo.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenyihongyi
 * @since 2019-08-31
 */
@TableName("sys_department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("DICTIONARIES_ID")
	private String dictionariesId;
    /**
     * 名称
     */
	@TableField("NAME")
	private String name;
    /**
     * 英文
     */
	@TableField("NAME_EN")
	private String nameEn;
    /**
     * 编码
     */
	@TableField("BIANMA")
	private String bianma;
    /**
     * 排序
     */
	@TableField("ORDER_BY")
	private Integer orderBy;
    /**
     * 上级ID
     */
	@TableField("PARENT_ID")
	private String parentId;
    /**
     * 备注
     */
	@TableField("BZ")
	private String bz;
    /**
     * 排查表
     */
	@TableField("TBSNAME")
	private String tbsname;
	@TableField("TBFIELD")
	private String tbfield;
	@TableField("YNDEL")
	private String yndel;


	public String getDictionariesId() {
		return dictionariesId;
	}

	public void setDictionariesId(String dictionariesId) {
		this.dictionariesId = dictionariesId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getBianma() {
		return bianma;
	}

	public void setBianma(String bianma) {
		this.bianma = bianma;
	}

	public Integer getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getTbsname() {
		return tbsname;
	}

	public void setTbsname(String tbsname) {
		this.tbsname = tbsname;
	}

	public String getTbfield() {
		return tbfield;
	}

	public void setTbfield(String tbfield) {
		this.tbfield = tbfield;
	}

	public String getYndel() {
		return yndel;
	}

	public void setYndel(String yndel) {
		this.yndel = yndel;
	}

}
