package com.shearf.cloud.apps.commons.foundation.mybatis;

import java.io.Serializable;
import java.util.List;

/**
 * @author xiahaihu2009@gmail.com
 */
public interface IGenericMapper<E, K extends Serializable> {

    /**
     * 插入一条数据
     *
     * @param object
     * @return
     */
    int insert(E object);

    /**
     * 批量插入数据
     *
     * @param items
     * @return
     */
    int insertBatch(List<E> items);

    /**
     * 插入特定列的单条数据
     *
     * @param object
     * @return
     */
    int insertSelective(E object);

    /**
     * 批量插入特定列的单条数据
     *
     * @param items
     * @return
     */
    int insertSelectiveBatch(List<E> items);

    /**
     * 根据ID删除数据
     *
     * @param id
     * @return
     */
    int delete(K id);

    /**
     * 根据ID列表批量删除数据
     *
     * @param ids
     * @return
     */
    int deleteBatch(List<K> ids);

    /**
     * 更新单条数据
     *
     * @param object
     * @return
     */
    int update(E object);

    /**
     * 批量更新数据
     *
     * @param items
     * @return
     */
    int updateBatch(List<E> items);

    /**
     * 更新特定列数据
     *
     * @param object
     * @return
     */
    int updateSelective(E object);

    /**
     * 批量更新特定列数据
     *
     * @param items
     * @return
     */
    int updateSelectiveBatch(List<E> items);

    /**
     * 根据ID获得单条数据
     *
     * @param id
     * @return
     */
    E get(K id);

    /**
     * 根据条件统计数据
     *
     * @param param
     * @return
     */
    long count(Object param);

    /**
     * 查询全部数据
     *
     * @return
     */
    List<E> queryAll();

    /**
     * 根据条件查询数据
     *
     * @param param
     * @return
     */
    List<E> queryByParam(Object param);
}
