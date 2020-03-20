package com.jack.dao.impl;

import java.util.List;

import lombok.Data;
import org.springframework.stereotype.Repository;

import com.jack.dao.ProductDao;
import com.jack.entity.Product;
import com.util.dao.impl.BaseDaoImpl;

@Repository
@Data
public class ProductDaoImpl extends BaseDaoImpl<String, Product> implements ProductDao {

	@Override
	public List<Product> findProducts(Product product) {
		// TODO Auto-generated method stub
		String sortId=product.getSortId();
		StringBuilder builder=new StringBuilder();
		if(sortId!=null&&!"".equals(sortId)){
			builder.append("and sortId='"+sortId+"'");
		}
		return super.query(builder.toString());
	}

}
