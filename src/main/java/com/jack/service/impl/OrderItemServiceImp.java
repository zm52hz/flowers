package com.jack.service.impl;

import org.springframework.stereotype.Service;

import com.jack.entity.OrderItem;
import com.jack.service.OrderItemService;
import com.util.service.impl.BaseServiceImpl;

@Service
public class OrderItemServiceImp extends BaseServiceImpl<String,OrderItem> implements OrderItemService {

}
