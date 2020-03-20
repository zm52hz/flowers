package com.jack.dao.impl;


import org.springframework.stereotype.Repository;

import com.jack.dao.SortDao;
import com.jack.entity.Sort;
import com.util.dao.impl.BaseDaoImpl;

@Repository
public class SortDaoImpl extends BaseDaoImpl<String, Sort> implements SortDao {

}
