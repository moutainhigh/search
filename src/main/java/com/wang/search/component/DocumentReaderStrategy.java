package com.wang.search.component;

import com.wang.search.core.DocumentEntity;

import java.io.File;

/**
 * 文件读取策略接口
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/6 12:23
 * @since JDK 1.8
 */
public interface DocumentReaderStrategy {
    /**
     * 文件读取策略
     *
     * @param file
     * @return com.wang.search.core.DocumentEntity
     * @throws
     * @Date 2020/6/6 13:36
     * @Author wangjunhao
     **/
    DocumentEntity read(byte[] file,String fileName);
}
