package com.wang.search.controller;

import com.wang.search.controller.entity.Response;
import com.wang.search.exception.CommonRunTimeException;
import com.wang.search.exception.DocException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * controller父类
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/6 9:48
 * @since JDK 1.8
 */
@RestController
@Slf4j
public class BaseContruller {

    @ExceptionHandler(value = Throwable.class)
    public Response handException(Throwable throwable) {
        if (throwable instanceof DataAccessException) {
            log.error("DATABASE_ERROR:{}", throwable.getStackTrace().toString());
            return new Response().setReturnCode(1002).setDescription("数据库错误").setData(null);
        }
        if (throwable instanceof CommonRunTimeException) {
            log.warn("BUSSINESS_ERROR:{}", throwable.getStackTrace().toString());
            return new Response().setReturnCode(((CommonRunTimeException) throwable).getCode()).setDescription(((CommonRunTimeException) throwable).getDescription());
        }
        return new Response().setReturnCode(1001).setDescription("系统未知错误");
    }

}
