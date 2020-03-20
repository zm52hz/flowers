package com.jack.service;


import java.util.List;

import com.jack.entity.Cart;
import com.jack.entity.Product;



public interface CartService {

	//依据pid查找product
	public Product findProductBy(Product product);
	
	//设置购物车总价格和总件数
	public void setCartall(Cart cart);
	
	//把商品添加到购物车的方法
	public Cart addProductToCart(Product product,Cart cart);
	
	//删除购物车中的购物项
	public Cart deleteCartItemById(String id ,Cart cart);
	
	//清空购物车
	public Cart clearCart(Cart cart );
	
	//改变购物车某种购物项的数量
	public Cart changeItemQuantity(String id,String quantity,Cart cart);
}
