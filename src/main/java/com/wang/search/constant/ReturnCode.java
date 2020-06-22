package com.wang.search.constant;

/**
 * 错误码常量
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/6 12:33
 * @since JDK 1.8
 */
public enum ReturnCode {

    /**
     * 返回成功
     */
    SUCCESS(200, "请求成功"),
    DOCUMENT_FORMAT_ERROR(1001, "文件类型错误"),
    DOCUMENT_NOT_FOUND(1002,"未找到对应文件"),
    ;

    private ReturnCode(int code, String description) {
    }

    private int code;
    private String description;

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}
