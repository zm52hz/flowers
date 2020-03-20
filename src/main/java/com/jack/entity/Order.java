package com.jack.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="order",catalog="flower")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String userId;
	private double totalPrice;          //订单金额
	private String revName;            //收货人姓名
	private String revAddr;           //收货人地址
	private String revPhone;          //收货人电话
	private Timestamp createDate;    //订单生成时间
	private Timestamp deliveryTime;  //配送时间
	private int status;       //订单状态
	public List<OrderItem> orderItemList; //当前订单下的所有订单项
	
	@Id
	@Column(name="id",unique=true,nullable=false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "userId", nullable = false)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Column(name = "totalPrice")
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	@Column(name = "revName")
	public String getRevName() {
		return revName;
	}
	public void setRevName(String revName) {
		this.revName = revName;
	}
	
	@Column(name = "revAddr")
	public String getRevAddr() {
		return revAddr;
	}
	public void setRevAddr(String revAddr) {
		this.revAddr = revAddr;
	}
	
	@Column(name = "revPhone")
	public String getRevPhone() {
		return revPhone;
	}
	public void setRevPhone(String revPhone) {
		this.revPhone = revPhone;
	}
	
	@Column(name = "createDate", nullable = false)
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	
	@Column(name = "deliveryTime")
	public Timestamp getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(Timestamp deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	
	@Column(name = "status", nullable = false)
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Transient
	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}
	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}
	
}
