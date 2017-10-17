package com.shearf.cloud.apps.commons.foundation.mybatis;

import java.io.Serializable;
import java.util.List;

public interface IGenericMapper<E, K extends Serializable> {

    int insert(E object);

    int insertBatch(List<E> items);

    int insertSelective(E object);

    int insertSelectiveBatch(List<E> items);

    int delete(K id);

    int deleteBatch(List<K> ids);

    int update(E object);

    int updateBatch(List<E> items);

    int updateSelective(E object);

    int updateSelectiveBatch(List<E> items);

    E get(K id);

    long count(Object condition);

    List<E> queryAll();
}
