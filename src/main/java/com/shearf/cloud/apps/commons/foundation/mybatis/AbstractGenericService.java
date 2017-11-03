package com.shearf.cloud.apps.commons.foundation.mybatis;

import java.io.Serializable;
import java.util.List;

/**
 * 通用Service实现
 *
 * @param <E> 实体类型
 * @param <K> 主键类型
 * @param <M> Mapper接口
 */
public abstract class AbstractGenericService<E, K extends Serializable, M extends IGenericMapper<E, K>> implements IGenericService<E, K> {

    protected abstract M getMapper();

    @Override
    public int insert(E object) {
        return getMapper().insert(object);
    }

    @Override
    public int insert(List<E> items) {
        return getMapper().insertBatch(items);
    }

    @Override
    public int insertSelective(E object) {
        return getMapper().insertSelective(object);
    }

    @Override
    public int insertSelective(List<E> items) {
        return getMapper().insertSelectiveBatch(items);
    }

    @Override
    public int delete(K id) {
        return getMapper().delete(id);
    }

    @Override
    public int delete(List<K> ids) {
        return getMapper().deleteBatch(ids);
    }

    @Override
    public int update(E object) {
        return getMapper().update(object);
    }

    @Override
    public int update(List<E> items) {
        return getMapper().updateBatch(items);
    }

    @Override
    public int updateSelective(E object) {
        return getMapper().updateSelective(object);
    }

    @Override
    public int updateSelective(List<E> items) {
        return getMapper().updateSelectiveBatch(items);
    }

    @Override
    public E get(K id) {
        return getMapper().get(id);
    }

    @Override
    public long count(Object param) {
        return getMapper().count(param);
    }

    @Override
    public List<E> queryAll() {
        return getMapper().queryAll();
    }

    @Override
    public List<E> queryByParam(Object param) { return getMapper().queryByParam(param); }

}

