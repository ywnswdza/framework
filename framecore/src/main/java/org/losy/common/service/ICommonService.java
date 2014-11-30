package org.losy.common.service;

import org.losy.common.mybatis.support.Pager;

import java.io.Serializable;
import java.util.List;


public abstract interface ICommonService<T> {

	public abstract T insert(T entity);
	/**
	 * 根据实现集合，插入
	 * @param list
	 * @return
	 */
	public abstract Serializable insertBatch(List<T> list);
	public abstract T update(T entity);
	/**
	 * @param key
	 */
	public abstract void removeByKey(Serializable key);
	/**
	 * 根据 key 的集合删除
	 * @param keys
	 */
	public abstract void removeByKeys(List<Serializable> keys);
	public abstract T findEntityByKey(Serializable key);
	public abstract List<T> findEntityList(T entity);
	public abstract List<T> findEntityListLimit(T entity,int offset, int limit);
	public abstract Pager<T> findEntityPager(T entity,int offset, int limit);

}