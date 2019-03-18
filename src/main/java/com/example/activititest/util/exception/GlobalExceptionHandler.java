/**
 * 文件说明:  统一异常处理类
 */
package com.example.activititest.util.exception;


import com.example.activititest.util.ToWeb;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@SuppressWarnings({ "rawtypes", "unchecked" })
@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {

	//处理自定义的异常
	@ExceptionHandler(BaseException.class)
	@ResponseBody
	public Object customHandler(BaseException e){
		return ToWeb.buildResult().status(e.getCode()).msg(e.getMessage());
	}

}
