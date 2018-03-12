package com.shearf.cloud.apps.commons.foundation.response;

import com.shearf.cloud.apps.commons.foundation.error.BaseError;
import lombok.Data;

import java.io.Serializable;

/**
 * @author xiahaihu
 */
@Data
public class Response<T> implements Serializable{

    private static final long serialVersionUID = -3459719094846341206L;

    private int code = BaseError.FAIL.getCode();

    private String message = BaseError.SUCCESS.getMessage();

    private T data = null;

    public Response() {

    }

    public Response(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Response<T> success() {
        return Response.result(BaseError.SUCCESS);
    }

    public static <T> Response<T> success(T data) {
        return Response.result(BaseError.SUCCESS, data);
    }

    public static <T> Response<T> fail() {
        return Response.result(BaseError.FAIL);
    }

    public static <T> Response<T> fail(String message) {
        return Response.result(BaseError.FAIL.getCode(), message, null);
    }

    public static <T> Response<T> fail(T data) {
        return Response.result(BaseError.FAIL, data);
    }

    public static <T> Response<T> result(BaseError error) {
        return Response.result(error.getCode(), error.getMessage(), null);
    }

    public static <T> Response<T> result(BaseError error, T data) {
        return Response.result(error.getCode(), error.getMessage(), data);
    }

    public static <T> Response<T> result(int code, String message, T data) {
        return new Response<>(code, message, data);
    }
}
