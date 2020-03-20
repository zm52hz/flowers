package com.util.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseEntity {

	@JsonProperty("StatusCode")
	private String StatusCode;
	private String statusCode;
	private Object data;
	private String errorCode;
	private String errorMsg;
	
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.StatusCode = statusCode;
		this.statusCode = statusCode;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
