package com.lengmo.common.base;

import java.io.Serializable;
/**
 * ͨ��idʵ����
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
