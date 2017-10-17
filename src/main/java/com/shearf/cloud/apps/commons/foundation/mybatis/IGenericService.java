package com.shearf.cloud.apps.commons.foundation.mybatis;

import java.io.Serializable;
import java.util.List;

public interface IGenericService<E, K extends Serializable> {

    int insert(E object);

    int insert(List<E> items);

    int insertSelective(E object);

    int insertSelective(List<E> items);

    int delete(K id);

    int delete(List<K> ids);

    int update(E object);

    int update(List<E> items);

    int updateSelective(E object);

    int updateSelective(List<E> items);

    E get(K id);

    long count(Object condition);

    List<E> queryAll();

}
