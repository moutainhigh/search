package com.wang.search.exception;

import com.wang.search.constant.ReturnCode;
import lombok.Data;

/**
 * 公共异常类
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/6 12:30
 * @since JDK 1.8
 */
@Data
public class BusinessException extends RuntimeException {
    /**
     * 异常错误码
     */
    private int code;
    /**
     * 异常描述
     */
    private String description;

    public BusinessException(ReturnCode returnCode) {
        super(returnCode.getDescription());
        this.code = returnCode.getCode();
        this.description = returnCode.getDescription();
    }


}
