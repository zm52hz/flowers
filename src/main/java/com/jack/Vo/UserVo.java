package com.jack.Vo;

import java.sql.Timestamp;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class UserVo {
	private java.lang.String id;
	
	@NotBlank(message="用户名不能为空")
	private java.lang.String userName;
	
	@NotBlank(message="密码不能为空")
	private java.lang.String userPassword;
	
	@Email(message="注意email格式输入")
	private java.lang.String userEmail;
	
	@NotBlank(message="手机号码不能为空")
	private java.lang.String userPhone;
	private java.lang.String userOrderAddress;
    private Timestamp createDate;
    
  
    
	public java.lang.String getId() {
		return id;
	}
	public void setId(java.lang.String id) {
		this.id = id;
	}
	public java.lang.String getUserName() {
		return userName;
	}
	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}
	public java.lang.String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(java.lang.String userPassword) {
		this.userPassword = userPassword;
	}
	public java.lang.String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(java.lang.String userEmail) {
		this.userEmail = userEmail;
	}
	public java.lang.String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(java.lang.String userPhone) {
		this.userPhone = userPhone;
	}
	public java.lang.String getUserOrderAddress() {
		return userOrderAddress;
	}
	public void setUserOrderAddress(java.lang.String userOrderAddress) {
		this.userOrderAddress = userOrderAddress;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	
}
