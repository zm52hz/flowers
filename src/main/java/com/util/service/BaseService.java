package com.util.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.Criterion;

import com.util.entity.Pagination;

public interface BaseService <K extends Serializable,T extends Serializable>{
	
	public T load(K id);  
     
	public T get(K id);  
	
	public List<T> findAll();  
	  
	public void persist(T entity);  
	      
	public K save(T entity);  
	   
	public void saveOrUpdate(T entity);  
	      
	public void delete(K id);  
	      
	public void flush();  
	
	public List<T> find(final String hql,final Object...valus); 
	
	public List<T> find(final String hql,Map<String, ?> values);
	
	public List<T> find(final Criterion... criterions);
	
	public List<T> findByProperty(final String propertyName, final Object value);
	
	public T findUniqueByProperty(final String propertyName, final Object value);
	
	public Pagination<T> findPage(String whereSql,Pagination pagination,Object... args);
}
