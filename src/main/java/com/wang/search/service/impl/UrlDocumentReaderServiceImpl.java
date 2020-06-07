package com.wang.search.service.impl;

import com.wang.search.core.DocumentEntity;
import com.wang.search.service.DocumentReaderService;
import org.springframework.stereotype.Service;

import java.io.InputStream;

/**
 * 网络文件读取实现类
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/6 12:11
 * @since JDK 1.8
 */
@Service(value = "urlDocumentReader")
public class UrlDocumentReaderServiceImpl implements DocumentReaderService {

    @Override
    public DocumentEntity docReader(InputStream inputStream) {
        return null;
    }

    @Override
    public DocumentEntity pdfReader(InputStream inputStream) {
        return null;
    }

    @Override
    public DocumentEntity txtReader(InputStream inputStream) {
        return null;
    }

    @Override
    public DocumentEntity excelReader(InputStream inputStream) {
        return null;
    }
}
