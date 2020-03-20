package com.jack.service;

import java.util.List;

import com.jack.entity.Product;
import com.util.service.BaseService;

public interface ProductService extends BaseService<String, Product> {

	public List<Product> findProducts(Product product);
}
