package com.jack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jack.dao.UserDao;
import com.jack.entity.User;
import com.jack.service.UserService;
import com.util.entity.Pagination;
import com.util.service.impl.BaseServiceImpl;

@Service
public class UserServiceImpl extends BaseServiceImpl<String, User> implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> findUserList(User user) {
		// TODO Auto-generated method stub
		return userDao.findUserList(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userDao.deleteUser(user);
	}

	@Override
	public Pagination findUsers(Pagination pagination, User user) {
		// TODO Auto-generated method stub
		return userDao.findUsers(pagination, user);
	}
	
}
