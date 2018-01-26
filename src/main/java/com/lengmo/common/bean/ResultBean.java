package com.lengmo.common.bean;

import java.io.Serializable;

/**
 * 请求数据返回类
 * @author Administrator
 *
 * @param <T>
 */
public class ResultBean<T> implements Serializable {

	public static final long serialVersionUID = 1L;

	public static final int SUCCESS = 1 ;
	
	public static final int FIAL = 0 ;
	/**
	 * 未登录
	 */
	public static final int NO_LOGIN = -1 ;
	
	/**
	 * 未授权
	 */
	public static final int NO_PERMISSION = -2 ;
	
	private T data ;
	
	private String msg = "success";
	
	private int code = SUCCESS;
	
	public ResultBean(){
		super();
	}
	
	public ResultBean(T data) {
		super();
		this.data = data ;
	}
	
	public ResultBean(Throwable e) {
		super();
		this.msg = e.getMessage() ;
		this.code = FIAL ;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
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
