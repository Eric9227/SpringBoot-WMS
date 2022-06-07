package com.Warehouse.controller;

import com.Warehouse.exception.BusinessException;
import com.Warehouse.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/2
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
     return new Result(null,ex.getCode(),ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(null,ex.getCode(),ex.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){

       return new Result(ex,Code.SYSTEM_UNKNOWN_ERROR,"系统繁忙，请稍后访问！");
    }
}
