package com.wang.search.exception;

import com.wang.search.constant.ReturnCode;

/**
 * 文件操作异常类
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/6 12:39
 * @since JDK 1.8
 */
public class DocException extends CommonRunTimeException {
    public DocException(ReturnCode returnCode) {
        super(returnCode);
    }
}
