package com.wang.search.service;

/**
 * 自定义类加载
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/10 0:29
 * @since JDK 1.8
 */
public class UriClassLoader extends ClassLoader{
    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return super.loadClass(name, resolve);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
