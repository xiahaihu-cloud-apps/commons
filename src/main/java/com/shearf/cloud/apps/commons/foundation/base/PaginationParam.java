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

    private Integer pageSize = PAGE_SIZE;

    private Integer pageNum;
}
