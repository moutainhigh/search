package com.wang.search.service;

import com.wang.search.component.DocumentReaderStrategy;
import com.wang.search.core.DocumentEntity;
import jdk.internal.util.xml.impl.Input;

import java.io.InputStream;

/**
 * 文档读取类
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/6 11:56
 * @since JDK 1.8
 */
public interface DocumentReaderService {

    /**
     * 文档阅读
     *
     * @param documentReaderStrategy
     * @return com.wang.search.core.DocumentEntity
     * @throws
     * @Date 2020/6/7 20:05
     * @Author wangjunhao
     **/
    DocumentEntity readDocument(DocumentReaderStrategy documentReaderStrategy);

}
