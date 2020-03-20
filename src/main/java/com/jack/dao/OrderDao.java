package com.jack.dao;

import java.util.List;

import com.jack.entity.Order;
import com.util.dao.BaseDao;

public interface OrderDao extends BaseDao<String, Order>{

	List<Order> findOrders(Order order);
}
