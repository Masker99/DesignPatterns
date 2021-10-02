package com.rookie.design_patterns.singleton;

/**
 * 懒汉式，但线程不安全,严格意义上不算的是单例模式
 * 懒汉的理解，等需要才动手
 * @author Masker
 */
public class SingletonIsLazyNotThreadInsecurity {
    private static SingletonIsLazyNotThreadInsecurity instance;

    private SingletonIsLazyNotThreadInsecurity(){}

    public static SingletonIsLazyNotThreadInsecurity getInstance(){
        if(instance == null ){
            instance = new SingletonIsLazyNotThreadInsecurity();
        }

        return instance;
    }
}
