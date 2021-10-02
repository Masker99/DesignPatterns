package com.rookie.design_patterns.singleton;

/**
 * 饿汉式，线程安全，枚举式
 * 这种方式是实现单例模式的最佳方法，更简洁，自动支持序列化机制，绝对防止多次实例化
 * @author Masker
 */
public enum SingletonEnumerationType {
    INSTANCE;

    public void whateverMethod(){}
}
