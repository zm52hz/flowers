package com.jack.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="sort",catalog="flower")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Sort implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String sortName;
	private String sortImg;
	
	@Id
	@Column(name="id",unique=true,nullable=false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="sortName",unique=true,nullable=false)
	public String getSortName() {
		return sortName;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	
	@Column(name="sortImg")
	public String getSortImg() {
		return sortImg;
	}
	public void setSortImg(String sortImg) {
		this.sortImg = sortImg;
	}
	
	
	
}
