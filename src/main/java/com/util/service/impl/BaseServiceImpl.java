package com.util.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.util.dao.BaseDao;
import com.util.entity.Pagination;
import com.util.service.BaseService;

@Transactional
public class BaseServiceImpl <K extends Serializable, T extends Serializable> implements BaseService<K, T> {

	@Autowired
	private BaseDao<K,T> baseDao;
	
	@Override
	public T load(K id) {
		// TODO Auto-generated method stub
		return baseDao.load(id);
	}

	@Override
	public T get(K id) {
		// TODO Auto-generated method stub
		return baseDao.get(id);
	}

	@Override
	public void persist(T entity) {
		// TODO Auto-generated method stub
		baseDao.persist(entity);
	}

	@Override
	public K save(T entity) {
		// TODO Auto-generated method stub
		return baseDao.save(entity);
	}

	@Override
	public void saveOrUpdate(T entity) {
		// TODO Auto-generated method stub
		baseDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(K id) {
		// TODO Auto-generated method stub
		baseDao.delete(id);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		baseDao.flush();
	}


	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return baseDao.findAll();
	}

	@Override
	public List<T> find(String whereSql, Object... args) {
		// TODO Auto-generated method stub
		return baseDao.find(whereSql, args);
	}

	@Override
	public List<T> find(String hql, Map<String, ?> values) {
		// TODO Auto-generated method stub
		return baseDao.find(hql, values);
	}

	@Override
	public Pagination<T> findPage(String whereSql, Pagination pagination,
			Object... args) {
		// TODO Auto-generated method stub
		return baseDao.findPage(whereSql, pagination, args);
	}

	@Override
	public List<T> find(Criterion... criterions) {
		// TODO Auto-generated method stub
		return baseDao.find(criterions);
	}

	@Override
	public List<T> findByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return baseDao.findByProperty(propertyName, value);
	}

	@Override
	public T findUniqueByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return baseDao.findUniqueByProperty(propertyName, value);
	}

}
