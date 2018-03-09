package com.shearf.cloud.apps.commons.foundation.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author xiahaihu2009@gmail.com
 * @date 2018/3/9
 */
@Data
public class Pagination<E> implements Serializable {

    private Number total;

    private List<E> rows;

    private Pagination(Number total, List<E> rows) {
        this.total = total;
        this.rows = rows;
    }

    public static <E> Pagination<E> build(Number total, List<E> rows) {
        return new Pagination<>(total, rows);
    }

}

