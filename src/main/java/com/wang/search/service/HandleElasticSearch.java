package com.wang.search.service;

import com.wang.search.core.DocumentEntity;

import java.util.List;

/**
 * 操作es
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/24 14:56
 * @since JDK 1.8
 */
public interface HandleElasticSearch {

    void addIndex(DocumentEntity documentEntity);

    void delIndex(DocumentEntity documentEntity);

    List<DocumentEntity> searchIndex(DocumentEntity documentEntity);
}
