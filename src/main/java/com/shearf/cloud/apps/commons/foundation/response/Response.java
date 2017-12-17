package com.shearf.cloud.apps.commons.foundation.response;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.Map;

/**
 * @author xiahaihu
 */
@Data
public class Response<T> implements Serializable{

    private static final long serialVersionUID = -3459719094846341206L;

    private int code = Status.SUCCESS.getCode();

    private String message = Status.SUCCESS.getMessage();

    private T data = null;

    public Response() {

    }

    public Response(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Response<T> success() {
        return Response.result(Status.SUCCESS);
    }

    public static <T> Response<T> success(T data) {
        return Response.result(Status.SUCCESS, data);
    }

    public static <T> Response<T> fail() {
        return Response.result(Status.FAILURE);
    }

    public static <T> Response<T> fail(String message) {
        return Response.result(Status.FAILURE.getCode(), message, null);
    }

    public static <T> Response<T> fail(T data) {
        return Response.result(Status.FAILURE, data);
    }

    public static <T> Response<T> result(Status status) {
        return Response.result(status.getCode(), status.getMessage(), null);
    }

    public static <T> Response<T> result(Status status, T data) {
        return Response.result(status.getCode(), status.getMessage(), data);
    }

    public static <T> Response<T> result(int code, String message, T data) {
        return new Response<>(code, message, data);
    }


    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum Status {

        FAILURE(-1, "请求失败"),
        SUCCESS(0, "请求成功"),
        ;

        @Getter
        private int code;
        @Getter
        private String message;

        private static Map<Integer, Status> map;

        static {
            map = Maps.newHashMap();
            for (Status status : Status.values()) {
                if (!map.containsKey(status.code)) {
                    map.put(status.code, status);
                }
            }
        }

        public static Status getStatus(int code) {
            Preconditions.checkArgument(Status.map.containsKey(code), "不存在相应Code的状态");
            return Status.map.get(code);
        }

        public static String getStatusMessage(int code) {
            Preconditions.checkArgument(Status.map.containsKey(code), "不存在相应Code的状态");
            return Status.map.get(code).getMessage();
        }
    }
}
