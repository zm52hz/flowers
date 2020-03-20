package com.jack.dao.impl;

import org.springframework.stereotype.Repository;

import com.jack.dao.OrderItemDao;
import com.jack.entity.OrderItem;
import com.util.dao.impl.BaseDaoImpl;

@Repository
public class OrderItemDaoImpl extends BaseDaoImpl<String, OrderItem> implements OrderItemDao{

}
