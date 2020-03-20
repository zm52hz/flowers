package com.util.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.util.entity.ResponseEntity;

public class BaseController {

	public static Object getSessionParams(HttpServletRequest request,String name){
        return request.getSession().getAttribute(name);		
	}
	
	public ResponseEntity hasError(BindingResult result){
		ResponseEntity re=null;
		if(result.hasErrors()){
			re=new ResponseEntity();
			StringBuilder errMsg=new StringBuilder();
			List<ObjectError> allErrors=result.getAllErrors();
			for(ObjectError error : allErrors){
				String msg=error.getDefaultMessage();
				errMsg.append(msg).append(";");
			}
			re.setStatusCode("400");
			re.setErrorCode("400");
			re.setErrorMsg(errMsg.toString());
		    return re;
		}
		return re;
	}
}
