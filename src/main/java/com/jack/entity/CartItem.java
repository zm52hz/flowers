package com.jack.entity;

import java.io.Serializable;


public class CartItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Product product; //购物车中的某种商品
	private int quantity; //购物车某种商品的数量
	private double price;  //购物车某种商品总价格
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
