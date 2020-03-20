package com.jack.service;


import java.util.List;

import com.jack.entity.User;
import com.util.entity.Pagination;
import com.util.service.BaseService;

public interface UserService extends BaseService<String,User> {

	List<User> findUserList(User user);
	
	List<User> findAll();
	
	void deleteUser(User user);
	
	Pagination findUsers(Pagination pagination,User user);
}
