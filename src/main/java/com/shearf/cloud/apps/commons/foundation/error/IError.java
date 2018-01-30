package com.shearf.cloud.apps.commons.foundation.error;

import java.io.Serializable;

/**
 * @author xiahaihu2009@gmail.com
 * @date 2018/1/30
 */
public interface IError extends Serializable {
    /**
     * 获得错误代码
     * @return
     */
    int getCode();

    /**
     * 获得错误信息
     * @return
     */
    String getMessage();
}
