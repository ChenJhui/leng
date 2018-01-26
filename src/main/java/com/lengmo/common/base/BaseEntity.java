package com.lengmo.common.base;

import java.io.Serializable;
/**
 * 通用id实体类
 * @author Administrator
 *
 */
public class BaseEntity implements Serializable{

	private static final long serialVersionUID = -4741040472531838087L;
	private int id ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
