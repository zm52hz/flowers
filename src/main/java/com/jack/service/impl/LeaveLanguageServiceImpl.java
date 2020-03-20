package com.jack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jack.dao.LeaveLanguageDao;
import com.jack.entity.LeaveLanguage;
import com.jack.service.LeaveLanguageService;
import com.util.service.impl.BaseServiceImpl;

@Service
public class LeaveLanguageServiceImpl extends BaseServiceImpl<String, LeaveLanguage> implements LeaveLanguageService {

	@Autowired
	private LeaveLanguageDao leaveLanguageDao;
	
	@Override
	public List<LeaveLanguage> findLeaveLanguages(LeaveLanguage language) {
		// TODO Auto-generated method stub
		return leaveLanguageDao.findLeaveLanguages(language);
	}

}
