package com.Warehouse.controller;


import lombok.Data;

/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/2
 */
@Data
public class Result {
    private Object data;
    private Integer code;
    private String msg;

    public Result(Object data, Integer code) {
        this.data = data;
        this.code = code;
    }

    public Result(Object data, Integer code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
}
