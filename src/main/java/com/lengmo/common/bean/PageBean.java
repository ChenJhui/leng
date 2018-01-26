package com.lengmo.common.bean;

import java.io.Serializable;

public class PageBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int currentPage = 1;	//��ǰҳ
	
	private int pageSize = 10;		//һҳ��ʾ����������
	
	private int offset ;			//��ǰҳƫ����

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
