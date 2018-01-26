package com.lengmo.authorization.common.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.lengmo.common.bean.PageResultBean;
import com.lengmo.common.bean.ResultBean;

public class CustomExcrptionResolver implements HandlerExceptionResolver {

	
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		ResultBean resultBean = null ;
		PageResultBean pageResultBean = null ;
		String msg = "页面出现错误，请重新尝试！";
		
		if(ex instanceof RuntimeException) {
			resultBean = new ResultBean(ex);
			resultBean.setMsg(msg);
		}else if(ex instanceof UnknownAccountException) {
			
		}
		
		return null;
	}

}
