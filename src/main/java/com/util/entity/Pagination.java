package com.util.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pagination<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int totalPage;//总页数
	private int totalCount;//总记录数
	private int currentPage=1;//当前所在页数
	private int pageSize=20;//页面大小
	private List<T> data=new ArrayList<T>();
	
	public Pagination(){
		
	}
	
	public Pagination(int currentPage){
		this.currentPage=currentPage;
	}
	
	public Pagination(int currentPage,int pageSize){
		this.currentPage=currentPage;
		this.pageSize=pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

}
