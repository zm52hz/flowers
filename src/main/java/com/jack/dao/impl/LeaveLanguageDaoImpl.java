package com.jack.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jack.dao.LeaveLanguageDao;
import com.jack.entity.LeaveLanguage;
import com.util.dao.impl.BaseDaoImpl;

@Repository
public class LeaveLanguageDaoImpl extends BaseDaoImpl<String, LeaveLanguage> implements LeaveLanguageDao{

	@Override
	public List<LeaveLanguage> findLeaveLanguages(LeaveLanguage language) {
		// TODO Auto-generated method stub
		String orderId=language.getOrderId();
		StringBuilder builder=new StringBuilder();
		if(orderId!=null&&!"".equals(orderId)){
			builder.append("and order='"+orderId+"'");
		}
		return super.query(builder.toString());
	}

}
