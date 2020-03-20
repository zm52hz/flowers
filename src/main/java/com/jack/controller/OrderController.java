package com.jack.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;





import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jack.entity.Cart;
import com.jack.entity.Order;
import com.jack.entity.Product;
import com.jack.service.OrderItemService;
import com.jack.service.OrderService;
import com.jack.service.ProductService;
import com.util.controller.BaseController;
import com.util.entity.ResponseEntity;

@RestController
@RequestMapping("order")
public class OrderController extends BaseController {

	private static final Logger LOGGER=Logger.getLogger(OrderController.class);
	
	@Autowired 
	private OrderService orderService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private OrderItemService orderItemService;
	
	@GetMapping
	public ResponseEntity getOrderListByUserId(Order order,HttpServletRequest request){
		String userId=(String) super.getSessionParams(request, "userId");
		ResponseEntity re=new ResponseEntity();
		try{
			order.setUserId(userId);
			List<Order> orderList=orderService.findOrders(order);
			re.setData(orderList);
			re.setStatusCode("200");
		}catch(Exception e){
			e.printStackTrace();
			String errorMsg=e.getMessage();
			re.setStatusCode("500");
			re.setErrorMsg("500");
			LOGGER.info(errorMsg);
		}
		return re;
	}
	
	//从购物车中生成订单或直接生成订单
	@PostMapping
	public ResponseEntity saveOrder(Order order,Product product,HttpServletRequest request){
		Cart cart=(Cart) super.getSessionParams(request, "cart");
		ResponseEntity re=new ResponseEntity();
		try{
		   String id=orderService.generateOrder(cart, order, product);
		   re.setData(id);
		   re.setStatusCode("200");
		}catch(Exception e){		
			e.printStackTrace();
			String errorMsg=e.getMessage();
		    re.setStatusCode("500");
			re.setErrorCode("500");
			re.setErrorMsg(errorMsg);
			LOGGER.info(errorMsg);
		}
		return re;
	}
}
