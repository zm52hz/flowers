package com.jack.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jack.entity.LeaveLanguage;
import com.jack.service.LeaveLanguageService;
import com.util.controller.BaseController;
import com.util.entity.ResponseEntity;

@RestController
@RequestMapping("LeaveLanguage")
public class LeaveLanguageController extends BaseController{

	private static final Logger LOGGER=Logger.getLogger(LeaveLanguageController.class);
	
	@Autowired
	private LeaveLanguageService languageService;
	
	@GetMapping
	public ResponseEntity getLeaveLanguagesByOrderId(LeaveLanguage language){
		ResponseEntity re=new ResponseEntity();
		try{
			List<LeaveLanguage> list=languageService.findLeaveLanguages(language);
			re.setData(list);
			re.setStatusCode("200");
		}catch(Exception e){
			e.printStackTrace();
			String errorMsg=e.getMessage();
			re.setStatusCode("500");
			re.setErrorCode("500");
			LOGGER.info(errorMsg);
		}
		return re;
	}
	
	@PostMapping
	public ResponseEntity addLeaveLanguage(LeaveLanguage leaveLanguage){
		ResponseEntity re=new ResponseEntity();
		try{
			languageService.save(leaveLanguage);
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
	
}
