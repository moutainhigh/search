package com.wang.search.service.impl;

import com.wang.search.core.DocumentEntity;
import com.wang.search.service.HandleElasticSearch;
import org.elasticsearch.client.Client;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 操作es,实现类
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/24 15:01
 * @since JDK 1.8
 */
public class HandleElasticSearchImpl implements HandleElasticSearch {
    @Resource
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Override
    public void addIndex(DocumentEntity documentEntity) {
    }

    @Override
    public void delIndex(DocumentEntity documentEntity) {

    }

    @Override
    public List<DocumentEntity> searchIndex(DocumentEntity documentEntity) {
        return null;
    }
}
