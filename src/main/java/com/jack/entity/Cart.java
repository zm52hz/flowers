package com.jack.entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Cart {
	//private Map<String,CartItem>cartItemMap=new LinkedHashMap<String,CartItem>();
	private List<Map<String,CartItem>> mapList=new ArrayList<Map<String,CartItem>>();
	private List<CartItem> cartItemList=new ArrayList<CartItem>();
	private double totalPrice;//记住购物车中所有商品总价钱
	private int totalNum;//购物车中的总件数
	
//	public Map<String, CartItem> getMap() {
//		return cartItemMap;
//	}
//	public void setMap(Map<String, CartItem> cartItemMap) {
//		this.cartItemMap = cartItemMap;
//	}
	public List<Map<String, CartItem>> getMapList() {
		return mapList;
	}
	public void setMapList(List<Map<String, CartItem>> mapList) {
		this.mapList = mapList;
	}
	public List<CartItem> getCartItemList() {
		return cartItemList;
	}
	public void setCartItemList(List<CartItem> cartItemList) {
		this.cartItemList = cartItemList;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
	
}
