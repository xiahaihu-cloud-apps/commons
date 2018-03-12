package com.shearf.cloud.apps.commons.foundation.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xiahaihu2009@gmail.com
 * @date 2018/3/9
 */
@Data
public abstract class PaginationParam implements Serializable {

    public static final int PAGE_SIZE = 10;

    private String order;

    private Integer limit;

    private Long offset;

    public int getPageSize() {
        return limit == null ? PAGE_SIZE : limit;
    }

    public int getPageNumber() {
        double pageNumber = 1;
        if (offset != null && limit != null && limit > 0) {
            pageNumber = Math.floor(offset / limit) + 1;
        }
        return (int) pageNumber;
    }

}
