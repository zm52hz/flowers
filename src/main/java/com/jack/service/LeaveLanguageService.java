package com.jack.service;

import java.util.List;

import com.jack.entity.LeaveLanguage;
import com.util.service.BaseService;

public interface LeaveLanguageService extends BaseService<String, LeaveLanguage> {

	List<LeaveLanguage> findLeaveLanguages(LeaveLanguage language);
}
