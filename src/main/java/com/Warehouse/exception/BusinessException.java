package com.Warehouse.exception;

/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/2
 */
public class BusinessException extends RuntimeException{
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private Integer code;

    public BusinessException(Integer code , String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Throwable cause, Integer code , String message) {
        super(message, cause);
        this.code = code;
    }
}
