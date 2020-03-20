package com.jack.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jack.dao.OrderDao;
import com.jack.entity.Order;
import com.util.dao.impl.BaseDaoImpl;

@Repository
public class OrderDaoImpl extends BaseDaoImpl<String, Order> implements OrderDao  {

	@Override
	public List<Order> findOrders(Order order) {
		// TODO Auto-generated method stub
		String userId=order.getUserId();
//		Timestamp createDate=order.getCreateDate();
//		int status=order.getStatus();
		StringBuilder builder =new StringBuilder();
		if(userId!=null&&!"".equals(userId)){
			builder.append("and userId='"+userId+"'");
		}
		return super.query(builder.toString());
	}

	
}
