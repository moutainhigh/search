package com.wang.search.component;

import com.wang.search.constant.DocFormatConstant;
import com.wang.search.core.DocumentEntity;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


/**
 * 文件读取代理类
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/7 14:38
 * @since JDK 1.8
 */
@Component(value = "docReaderAdapter")
public class DocumentReaderAdapter implements DocumentReaderStrategy {
    private static final String DOC_SERVICE = "docReader";
    private static final String EXCEL_SERVICE = "excelReader";
    private static final String TXT_SERVICE = "txtReader";
    private static final String PDF_SERVICE = "pdfReader";
    @Resource
    private Map<String, DocumentReaderStrategy> documentReaderStrategyMap;

    private Map<String, DocumentReaderStrategy> strategyMap;

    @PostConstruct
    public void init() {
        Map<String, DocumentReaderStrategy> map = new HashMap<>(8);
        map.put(DocFormatConstant.PDF, documentReaderStrategyMap.get(PDF_SERVICE));
        map.put(DocFormatConstant.TXT, documentReaderStrategyMap.get(TXT_SERVICE));
        map.put(DocFormatConstant.WORD_2003_SUFFIX, documentReaderStrategyMap.get(DOC_SERVICE));
        map.put(DocFormatConstant.WORD_2007_SUFFIX, documentReaderStrategyMap.get(DOC_SERVICE));
        map.put(DocFormatConstant.EXCEL_2003, documentReaderStrategyMap.get(EXCEL_SERVICE));
        map.put(DocFormatConstant.EXCEL_2007, documentReaderStrategyMap.get(EXCEL_SERVICE));
        this.strategyMap = map;
    }


    @Override
    public DocumentEntity read(byte[] file, String fileName) {
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
        return strategyMap.get(suffix).read(file, fileName);
    }
}
