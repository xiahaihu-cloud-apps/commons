package com.shearf.cloud.apps.commons.foundation.error;

import lombok.AllArgsConstructor;

/**
 * @author xiahaihu2009@gmail.com
 * @date 2018/1/30
 */
@AllArgsConstructor
public enum BaseError implements IError {

    /**
     * 操作失败
     */
    FAIL(-1, "操作失败"),

    /**
     * 操作成功
     */
    SUCCESS(0, "操作成功")
    ;

    private int code;

    private String message;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
