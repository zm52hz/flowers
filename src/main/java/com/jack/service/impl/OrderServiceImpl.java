package com.jack.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jack.dao.OrderDao;
import com.jack.dao.OrderItemDao;
import com.jack.dao.ProductDao;
import com.jack.entity.Cart;
import com.jack.entity.CartItem;
import com.jack.entity.Order;
import com.jack.entity.OrderItem;
import com.jack.entity.Product;
import com.jack.service.OrderService;
import com.util.dao.BaseDao;
import com.util.entity.Common;
import com.util.service.impl.BaseServiceImpl;

@Service
public class OrderServiceImpl extends BaseServiceImpl<String, Order> implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	@Autowired 
	private OrderItemDao orderItemDao;
	
	@Autowired 
	private ProductDao productDao;

	@Transactional
	@Override
	public String generateOrder(Cart cart,Order order,Product product) {
		// TODO Auto-generated method stub
		List<OrderItem> items=new ArrayList<OrderItem>();
		double totalPrice=0;
		String id=null;
		try{
			order.setId(Common.getUUID());
			if(product.getId()==null||"".equals(product.getId())){
				List<Map<String, CartItem>> cartList=cart.getMapList();
			    for (Map<String, CartItem> cartItemMap : cartList) {
				   for (String key : cartItemMap.keySet()) {
						 OrderItem oi=new OrderItem();
						 oi.setProductId(key);
						 oi.setAmount(cartItemMap.get(key).getQuantity());
						 oi.setPrice(cartItemMap.get(key).getPrice());
						 oi.setOrderId(order.getId());
						 oi.setId(Common.getUUID());
						 totalPrice+=oi.getPrice();
						 items.add(oi);				      
						 orderItemDao.save(oi);
						}
					  }
				   }else{
					   product=productDao.get(product.getId());
					   OrderItem oi=new OrderItem();
					   oi.setId(Common.getUUID());
					   oi.setAmount(1);
					   oi.setPrice(product.getProPrice());
					   oi.setOrderId(order.getId());
					   oi.setProductId(product.getId());
					   totalPrice=oi.getPrice();
					   items.add(oi);
					   orderItemDao.save(oi);
				   }
				   order.setOrderItemList(items);
				   order.setTotalPrice(totalPrice);
				   order.setCreateDate(Common.createDate());
				   id=orderDao.save(order);
		}catch(Exception e){
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public List<Order> findOrders(Order order) {
		// TODO Auto-generated method stub
		return orderDao.findOrders(order);
	}
	
}
