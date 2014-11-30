package org.losy.common.dao;

import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.util.List;


public abstract interface ICommonMapper<T> {

	public abstract void insert(T entity);
	/**
	 * 根据实现集合，插入
	 * @param list
	 * @return
	 */
	public abstract Integer insertBatch(List<T> list);
	public abstract Integer update(T entity);
	/**
	 * @param key
	 */
	public abstract Integer removeByKey(Serializable key);
	/**
	 * 根据 key 的集合删除
	 * @param keys
	 */
	public abstract Integer removeByKeys(List<Serializable> keys);
	public abstract T findEntityByKey(Serializable key);
	public abstract List<T> findEntityList(T entity);

	public abstract List<T> findEntityListLimit(T entity,RowBounds rb);
	Long findEntityListLimitAutoCount(T entity);
}