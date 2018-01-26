package com.lengmo.common.bean;

import java.io.Serializable;
import java.util.List;

public class PageResultBean<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final int SUCCESS = 1 ;
	
	public static final int FIAL = 0 ;
	
	private List<T> data ;		//	分页数据
	
	private int totalRecord ;	//总数据量
	
	private String msg = "success"; 
	
	private int code = SUCCESS;
	
	public PageResultBean() {
		super();
	}
	
	public PageResultBean(List<T> data,int totalRecord) {
		super();
		this.data = data;
		this.totalRecord = totalRecord;
	}
	
	public PageResultBean(Throwable e) {
		super();
		this.msg = e.getMessage();
		this.code = FIAL;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
