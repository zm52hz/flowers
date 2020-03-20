package com.jack.dao;

import java.util.List;

import com.jack.entity.LeaveLanguage;
import com.util.dao.BaseDao;

public interface LeaveLanguageDao extends BaseDao<String, LeaveLanguage>{

	List<LeaveLanguage> findLeaveLanguages(LeaveLanguage language);
}
