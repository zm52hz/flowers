package com.jack.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;



import com.jack.dao.UserDao;
import com.jack.entity.User;
import com.util.dao.impl.BaseDaoImpl;
import com.util.entity.Pagination;

@Repository
public class UserDaoImpl extends BaseDaoImpl<String, User> implements UserDao {

	@Override
	public List<User> findUserList(User user) {
		// TODO Auto-generated method stub
		String userName=user.getUserName();
		String userPassword=user.getUserPassword();
		StringBuilder builder=new StringBuilder();
		if(userName!=null&&!"".equals(userName)){
			builder.append("and userName='"+userName+"'");
		}
		if(userPassword!=null&&!"".equals(userPassword)){
			builder.append("and userPassword='"+userPassword+"'");
		}
		return super.find(builder.toString());
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		super.delete(user.getId());
	}

	@Override
	public Pagination findUsers(Pagination pagination,User user) {
		// TODO Auto-generated method stub
		StringBuilder builder=new StringBuilder();
		String userName=user.getUserName();
		if(userName!=null&&!"".equals(userName)){
			builder.append("and userName='"+userName+"'");
		}
		return super.findPage(builder.toString(), pagination);
	}

	
}
