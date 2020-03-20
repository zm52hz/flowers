package com.jack.dao;

import java.util.List;

import com.jack.entity.Product;
import com.util.dao.BaseDao;

public interface ProductDao extends BaseDao<String, Product> {

	public List<Product> findProducts(Product product);
}
