package org.losy.common.service;

import org.apache.ibatis.session.RowBounds;
import org.losy.common.dao.ICommonMapper;
import org.losy.common.mybatis.support.Pager;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2014/11/30.
 */
public abstract class CommonServiceImpl<Mapper extends ICommonMapper<T>,T> implements ICommonService<T>{

    @Autowired
    protected Mapper mapper;

    @Override
    public T insert(T entity) {
         mapper.insert(entity);
        return entity;
    }

    @Override
    public Integer insertBatch(List<T> list) {
        return mapper.insertBatch(list);
    }

    @Override
    public T update(T entity) {
         mapper.update(entity);
        return entity;
    }

    @Override
    public void removeByKey(Serializable key) {
        mapper.removeByKey(key);
    }

    @Override
    public void removeByKeys(List<Serializable> keys) {
        mapper.removeByKeys(keys);
    }

    @Override
    public T findEntityByKey(Serializable key) {
        return mapper.findEntityByKey(key);
    }

    @Override
    public List<T> findEntityList(T entity) {
        return mapper.findEntityList(entity);
    }



    @Override
    public Pager<T> findEntityPager(T entity, int offset, int limit) {
        RowBounds rb = new RowBounds(offset,limit);
        List<T> list = mapper.findEntityListLimit(entity,rb);
        Long allRow = mapper.findEntityListLimitAutoCount(entity);
        return new Pager<>(list,allRow.intValue(),offset / limit + 1,limit);
    }

    @Override
    public List<T> findEntityListLimit(T entity, int offset, int limit) {
        return mapper.findEntityListLimit(entity,new RowBounds(offset,limit));
    }
}
