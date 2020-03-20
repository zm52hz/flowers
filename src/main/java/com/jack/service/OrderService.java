package com.jack.service;

import java.util.List;

import com.jack.entity.Cart;
import com.jack.entity.Order;
import com.jack.entity.Product;
import com.util.service.BaseService;

public interface OrderService extends BaseService<String, Order> {

	
	//从购物车中生成订单或直接购物商品
	public String generateOrder(Cart cart,Order order,Product product);

	public List<Order> findOrders(Order order);
}
