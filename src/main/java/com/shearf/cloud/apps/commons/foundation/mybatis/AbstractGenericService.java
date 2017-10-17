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

    public int insert(E object) {
        return getMapper().insert(object);
    }

    public int insert(List<E> items) {
        return getMapper().insertBatch(items);
    }

    public int insertSelective(E object) {
        return getMapper().insertSelective(object);
    }

    public int insertSelective(List<E> items) {
        return getMapper().insertSelectiveBatch(items);
    }

    public int delete(K id) {
        return getMapper().delete(id);
    }

    public int delete(List<K> ids) {
        return getMapper().deleteBatch(ids);
    }

    public int update(E object) {
        return getMapper().update(object);
    }

    public int update(List<E> items) {
        return getMapper().updateBatch(items);
    }

    public int updateSelective(E object) {
        return getMapper().updateSelective(object);
    }

    public int updateSelective(List<E> items) {
        return getMapper().updateSelectiveBatch(items);
    }

    public E get(K id) {
        return getMapper().get(id);
    }

    public long count(Object condtion) {
        return getMapper().count(condtion);
    }

    public List<E> queryAll() {
        return getMapper().queryAll();
    }

}

