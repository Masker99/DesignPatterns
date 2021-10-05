package com.rookie.design_patterns.proxy;

/**
 * 代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
 * @author Masker
 */
public class Proxy implements Subject{
    private RealSubject subject;

    @Override
    public void Request() {
        if (subject == null){
            subject = new RealSubject();
        }

        subject.Request();
    }
}
