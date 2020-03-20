package com.test;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Expression;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jack.entity.Order;
import com.jack.entity.User;
import com.jack.service.OrderService;
import com.jack.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml" })
public class Test1 {

	private static final Logger LOGGER = Logger.getLogger(TestUserService.class);  

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private UserService userService;

	public void findOrderListByuserId(){
		String sql="and userId=? ";
		List<Order> list=orderService.find(sql,"222");
		System.out.println(list.size());
	}
	
	
	public void findOrderByCriteria(){
		Criterion criterion=Expression.eq("userId", "220");
		double totalPrice=1500;
		Criterion criterion2=Expression.lt("totalPrice",totalPrice);
		List<Order> list=orderService.find(criterion,criterion2);
		System.out.println(list.size());
	}
	
	@Test
	public void findUserByCriteria(){
		//List <User> list=userService.findByProperty("userOrderAddress", "川");
		User user=userService.findUniqueByProperty("id", "5e609490b05846228427bb94a2b97277");
		System.out.println(user.getCreateDate());
	}
}
