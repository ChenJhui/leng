package com.lengmo.common.bean;

import java.io.Serializable;

public class PageBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int currentPage = 1;	//当前页
	
	private int pageSize = 10;		//一页显示多少条数据
	
	private int offset ;			//当前页偏移量

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getOffset() {
		return (currentPage-1)*pageSize;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
	
}
