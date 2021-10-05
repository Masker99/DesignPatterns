package com.rookie.design_patterns.proxy;

/**
 * 抽象主题（Subject）类：通过接口或抽象类声明真实主题和代理对象实现的业务方法
 * @author Masker
 */
public interface Subject {
    /**
     * 业务方法
     */
    void Request();
}
