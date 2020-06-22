package com.wang.search.component;

import com.wang.search.core.DocumentEntity;
import org.springframework.stereotype.Component;

/**
 * PDF读取
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/7 14:47
 * @since JDK 1.8
 */
@Component(value = "pdfReader")
public class PdfReaderStrategy implements DocumentReaderStrategy{
    @Override
    public DocumentEntity read(byte[] file, String fileName) {
        return null;
    }
}
