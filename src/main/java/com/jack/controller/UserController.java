package com.jack.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
















import com.jack.Vo.UserVo;
import com.jack.entity.User;
import com.jack.service.UserService;
import com.util.controller.BaseController;
import com.util.entity.Common;
import com.util.entity.Pagination;
import com.util.entity.ResponseEntity;

@Api(description="用户信息",tags="User")
@RestController
@RequestMapping("user")
public class UserController extends BaseController {
 
	private static final Logger LOGGER=Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
//	@GetMapping
//	public ResponseEntity showUserInfos(User user){
//		ResponseEntity re=new ResponseEntity();
//		try{
//		    List<User> userList=userService.findUserList(user);
//		    re.setData(userList);
//		    if(userList.size()>0){
//		       re.setStatusCode("200");
//		    }else{
//		    	re.setStatusCode("400");
//		    }
//		   
//	    }catch(Exception e){
//		    e.printStackTrace();
//		    String errorMsg=e.getMessage();
//		    re.setStatusCode("500");
//		    re.setErrorCode("500");
//		    re.setErrorMsg(errorMsg);
//		    LOGGER.info(errorMsg);
//	  }
//	   return re;
//	}
	@ApiOperation(value = "查询所有的人员信息并分页展示", notes = "查询所有的人员信息并分页展示")
	@GetMapping
	public ResponseEntity getUserList(Pagination pagination,User user){
		ResponseEntity re=new ResponseEntity();
		try {
			Map<String,Object> retMap=new HashMap<String, Object>();
			pagination=userService.findUsers(pagination, user);
			retMap.put("list",pagination.getData());
			retMap.put("totalRecord", pagination.getTotalCount());
			retMap.put("totalPage",pagination.getTotalPage());	
			re.setData(retMap);
			re.setStatusCode("200");
		} catch (Exception e) {
			e.printStackTrace();
			String errorMsg=e.getMessage();
			re.setStatusCode("500");
			re.setErrorCode("500");
			re.setErrorMsg(errorMsg);
			LOGGER.info(errorMsg);
		}
		return re;
	}
	
	
	@ApiOperation(value = "根据用户Id查询用户信息", notes = "查询用户信息")
	@GetMapping("{userId}")
	public ResponseEntity getUserInfoById(@PathVariable String userId){
		ResponseEntity re=new ResponseEntity();
		try{
			User userInfo=userService.get(userId);
			re.setData(userInfo);
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
	public ResponseEntity createUser(@Valid UserVo userVo,BindingResult result){
		ResponseEntity re=null;
		try{
			re=super.hasError(result);
			if(re!=null){
				return re;
			}
			User user=new User();
			user.setUserEmail(userVo.getUserEmail());
			user.setUserOrderAddress(userVo.getUserOrderAddress());
			user.setUserPhone(userVo.getUserPhone());
			user.setUserName(userVo.getUserName());
			user.setUserPassword(userVo.getUserPassword());
			user.setId(Common.getUUID());
			user.setCreateDate(Common.createDate());
			String id =userService.save(user);
			re=new ResponseEntity();
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
	
	@DeleteMapping("{id}")
	public ResponseEntity deleteUserById(@PathVariable String id){
		ResponseEntity re=new ResponseEntity();
		try{
			userService.delete(id);
		    re.setStatusCode("200");
		}catch(Exception e){
			String errorMsg=e.getMessage();
			re.setStatusCode("500");
			re.setErrorCode("500");
			re.setErrorMsg(errorMsg);
			LOGGER.info(errorMsg);
		}
		return re;
	}
	
}
