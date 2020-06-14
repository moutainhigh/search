package com.wang.search.service.impl;

import com.wang.search.component.DocumentReaderStrategy;
import com.wang.search.core.DocumentEntity;
import com.wang.search.service.DocumentReaderService;
import org.springframework.stereotype.Service;


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
    public DocumentEntity readDocument(DocumentReaderStrategy documentReaderStrategy) {
        return null;
    }
}
