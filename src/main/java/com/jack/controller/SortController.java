package com.jack.controller;


import java.util.List;

import net.sf.ehcache.transaction.xa.commands.Command;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jack.entity.Sort;
import com.jack.service.SortService;
import com.util.controller.BaseController;
import com.util.entity.Common;
import com.util.entity.ResponseEntity;

@RestController
@RequestMapping("sort")
public class SortController extends BaseController{

	private static final Logger LOGGER=Logger.getLogger(SortController.class);
	
	
	@Autowired
	private SortService sortService;
	
	@GetMapping
	public ResponseEntity getAllSort(){
		ResponseEntity re =new ResponseEntity();
		try{
			List<Sort> list=sortService.findAll();
			re.setData(list);
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
	public ResponseEntity addSort(Sort sort){
		ResponseEntity re=new ResponseEntity();
		try{
			sort.setId(Common.getUUID());
			String id=sortService.save(sort);
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
	
	@PutMapping
	public ResponseEntity updataSort(Sort sort){
		ResponseEntity re=new ResponseEntity();
		try{
			sortService.saveOrUpdate(sort);
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
	
	@DeleteMapping("id")
	public ResponseEntity deleteSortById(@PathVariable String id){
		ResponseEntity re=new ResponseEntity();
		try{
			sortService.delete(id);
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
