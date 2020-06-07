package com.wang.search.service;

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
     * office的Word读取
     *
     * @param inputStream
     * @return com.wang.search.core.DocumentEntity
     * @throws
     * @Date 2020/6/6 12:07
     * @Author wangjunhao
     **/
    DocumentEntity docReader(InputStream inputStream);

    /**
     * pdf读取
     *
     * @param inputStream
     * @return com.wang.search.core.DocumentEntity
     * @throws
     * @Date 2020/6/6 12:09
     * @Author wangjunhao
     **/
    DocumentEntity pdfReader(InputStream inputStream);

    /**
     * TXT文件读取
     *
     * @param inputStream
     * @return com.wang.search.core.DocumentEntity
     * @throws
     * @Date 2020/6/6 12:09
     * @Author wangjunhao
     **/
    DocumentEntity txtReader(InputStream inputStream);

    /**
     * Excel读取
     *
     * @param inputStream
     * @return com.wang.search.core.DocumentEntity
     * @throws
     * @Date 2020/6/6 12:09
     * @Author wangjunhao
     **/
    DocumentEntity excelReader(InputStream inputStream);

}
