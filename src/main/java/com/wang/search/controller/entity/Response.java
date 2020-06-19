package com.wang.search.controller.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 基础response
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/6 11:36
 * @since JDK 1.8
 */
@Data
@Accessors(chain = true)
public class Response {
    /**
     * 返回码
     */
    private int returnCode;
    /**
     * 返回描述
     */
    private String description;
}
