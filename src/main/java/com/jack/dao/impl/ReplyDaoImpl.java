package com.jack.dao.impl;

import org.springframework.stereotype.Repository;

import com.jack.dao.ReplyDao;
import com.jack.entity.Reply;
import com.util.dao.impl.BaseDaoImpl;

@Repository
public class ReplyDaoImpl extends BaseDaoImpl<String, Reply> implements ReplyDao{

}
