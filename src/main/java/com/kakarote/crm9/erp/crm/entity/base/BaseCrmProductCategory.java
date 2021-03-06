package com.kakarote.crm9.erp.crm.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCrmProductCategory<M extends BaseCrmProductCategory<M>> extends Model<M> implements IBean {

	public void setCategoryId(java.lang.Integer categoryId) {
		set("category_id", categoryId);
	}
	
	public java.lang.Integer getCategoryId() {
		return getInt("category_id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setPid(java.lang.Integer pid) {
		set("pid", pid);
	}
	
	public java.lang.Integer getPid() {
		return getInt("pid");
	}

}
