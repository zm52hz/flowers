package com.jack.entity;

import java.io.Serializable;
import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="reply",catalog="flower")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Reply implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String LeaveLanguageId;//对应的留言表中Id
	private String content;
	private String userId;
	private Timestamp createDate;
	
	@Id
	@Column(name="id",unique=true,nullable=false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="LeaveLanguageId",nullable=false)
	public String getLeaveLanguageId() {
		return LeaveLanguageId;
	}
	public void setLeaveLanguageId(String leaveLanguageId) {
		LeaveLanguageId = leaveLanguageId;
	}
	
	@Column(name="content")
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Column(name="userId",nullable=false)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Column(name="createDate",nullable=false)
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	
	

	
}
