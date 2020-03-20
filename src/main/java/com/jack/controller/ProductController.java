package com.jack.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jack.Vo.ProductVo;
import com.jack.entity.Product;
import com.jack.service.ProductService;
import com.util.controller.BaseController;
import com.util.entity.Common;
import com.util.entity.ResponseEntity;

@RestController
@RequestMapping("product")
public class ProductController extends BaseController {

	private static final Logger LOGGER=Logger.getLogger(ProductController.class);
	
	@Autowired 
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity getProductList(Product product){
		ResponseEntity re=new ResponseEntity();
		try{
			List<Product> productList=productService.findProducts(product);
			re.setData(productList);
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
	
	@GetMapping("{id}")
	public ResponseEntity getProductById(@PathVariable String id){
		ResponseEntity re=new ResponseEntity();
		try{
			Product product=productService.get(id);
			re.setData(product);
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
	
	@PostMapping
	public ResponseEntity addProduct(@Valid ProductVo productVo,BindingResult result){
		ResponseEntity re=null;
		try{
			re=super.hasError(result);
			if(re!=null){
				return re;
			}
			re=new ResponseEntity();
			Product product=new Product();
			product.setId(Common.getUUID());
			product.setProDesc(productVo.getProDesc());
			product.setProImage(productVo.getProImage());
			product.setProPrice(productVo.getProPrice());
			product.setProInventory(productVo.getProInventory());
			product.setProLeaguage(productVo.getProLeaguage());
			product.setProName(productVo.getProName());
			product.setProPack(productVo.getProPack());
			product.setSortId(productVo.getSortId());
			product.setProUse(productVo.getProUse());
			productService.save(product);
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
	
	@PutMapping
	public ResponseEntity updataProduct(@Valid ProductVo productVo,BindingResult result){
		ResponseEntity re=null;
		try{
			re=super.hasError(result);
			if(re!=null){
				return re;
			}
			re=new ResponseEntity();
			Product product=new Product();
			product.setId(productVo.getId());
			product.setProDesc(productVo.getProDesc());
			product.setProImage(productVo.getProImage());
			product.setProInventory(productVo.getProInventory());
			product.setProLeaguage(productVo.getProLeaguage());
			product.setProName(productVo.getProName());
			product.setProPrice(productVo.getProPrice());
			product.setProPack(productVo.getProPack());
			//product.setProtypeId(productVo.getProtypeId());
			product.setSortId(productVo.getSortId());
			product.setProUse(productVo.getProUse());
			productService.saveOrUpdate(product);
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
