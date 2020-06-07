package com.wang.search.controller;

import com.wang.search.controller.entity.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller父类
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/6 9:48
 * @since JDK 1.8
 */
@RestController
public class BaseContruller {

    @ExceptionHandler(value = Throwable.class)
    public Response handException() {
        return null;
    }
}
