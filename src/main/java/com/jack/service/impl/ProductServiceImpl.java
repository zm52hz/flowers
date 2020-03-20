package com.jack.service.impl;

import java.util.List;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jack.dao.ProductDao;
import com.jack.entity.Product;
import com.jack.service.ProductService;
import com.util.service.impl.BaseServiceImpl;

@Service
@Data
public class ProductServiceImpl extends BaseServiceImpl<String, Product> implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> findProducts(Product product) {
		// TODO Auto-generated method stub
		return productDao.findProducts(product);
	}

}
