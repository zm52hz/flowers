package com.jack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="product",catalog="flower")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Product implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String sortId;
	private String proName;
	private String proDesc;
	private String proPack;
	private String proLeaguage;
	private int     proPrice;
	private int proInventory;
	private String proImage;
	private String proUse;
	private int proSaleNum;
	
	@Id
	@Column(name="id",unique=true,nullable=false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "proName", nullable = false)
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	
	@Column(name = "sortId", nullable = false)
	public String getSortId() {
		return sortId;
	}
	public void setSortId(String sortId) {
		this.sortId = sortId;
	}
	
	@Column(name = "proDesc")
	public String getProDesc() {
		return proDesc;
	}
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	
	@Column(name = "proPack")
	public String getProPack() {
		return proPack;
	}
	public void setProPack(String proPack) {
		this.proPack = proPack;
	}
	
	@Column(name = "proLeaguage")
	public String getProLeaguage() {
		return proLeaguage;
	}
	public void setProLeaguage(String proLeaguage) {
		this.proLeaguage = proLeaguage;
	}
	
	@Column(name = "proPrice", nullable = false)
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	
	@Column(name = "proInventory")
	public int getProInventory() {
		return proInventory;
	}
	public void setProInventory(int proInventory) {
		this.proInventory = proInventory;
	}
	
	@Column(name = "proImage")
	public String getProImage() {
		return proImage;
	}
	public void setProImage(String proImage) {
		this.proImage = proImage;
	}
	
	@Column(name = "proUse")
	public String getProUse() {
		return proUse;
	}
	public void setProUse(String proUse) {
		this.proUse = proUse;
	}
	
	@Column(name = "proSaleNum")
	public int getProSaleNum() {
		return proSaleNum;
	}
	public void setProSaleNum(int proSaleNum) {
		this.proSaleNum = proSaleNum;
	}
}
