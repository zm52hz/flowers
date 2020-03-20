package com.jack.Vo;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

public class ProductVo {

	private String id;
	
	@NotBlank(message="产品类型Id不能为空")
	private String sortId;
	
	@NotBlank(message="产品名不能为空")
	private String proName;
	private String proDesc;
	private String proPack;
	private String proLeaguage;
	
	@Min(value=1,message="产品价格不能小与零")
	private int     proPrice;
	private int proInventory;
	private String proImage;
	private String proUse;
	private int proSaleNum;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSortId() {
		return sortId;
	}
	public void setSortId(String sortId) {
		this.sortId = sortId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProDesc() {
		return proDesc;
	}
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	public String getProPack() {
		return proPack;
	}
	public void setProPack(String proPack) {
		this.proPack = proPack;
	}
	public String getProLeaguage() {
		return proLeaguage;
	}
	public void setProLeaguage(String proLeaguage) {
		this.proLeaguage = proLeaguage;
	}
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public int getProInventory() {
		return proInventory;
	}
	public void setProInventory(int proInventory) {
		this.proInventory = proInventory;
	}
	public String getProImage() {
		return proImage;
	}
	public void setProImage(String proImage) {
		this.proImage = proImage;
	}
	public String getProUse() {
		return proUse;
	}
	public void setProUse(String proUse) {
		this.proUse = proUse;
	}
	public int getProSaleNum() {
		return proSaleNum;
	}
	public void setProSaleNum(int proSaleNum) {
		this.proSaleNum = proSaleNum;
	}
}
