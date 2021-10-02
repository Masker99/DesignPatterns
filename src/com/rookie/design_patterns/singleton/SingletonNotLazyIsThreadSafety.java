package com.rookie.design_patterns.singleton;

/**
 * 饿汉式，线程安全
 * 饿汉式的理解，需要时已经提前准备好
 * 优点->没有加锁，所以执行效率会比较高
 * 缺点->类加载时就初始化，会浪费内存
 * @author Masker
 */
public class SingletonNotLazyIsThreadSafety {
    private static SingletonNotLazyIsThreadSafety instance = new SingletonNotLazyIsThreadSafety();

    private SingletonNotLazyIsThreadSafety(){}

    public static SingletonNotLazyIsThreadSafety getInstance(){
        return instance;
    }
}
