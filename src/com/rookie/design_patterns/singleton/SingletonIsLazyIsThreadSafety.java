package com.rookie.design_patterns.singleton;

/**
 * 懒汉式，线程安全
 * 该实现方式效率低下
 * @author Masker
 */
public class SingletonIsLazyIsThreadSafety {
    private static SingletonIsLazyIsThreadSafety instance ;

    private SingletonIsLazyIsThreadSafety(){}

    public static synchronized SingletonIsLazyIsThreadSafety getInstance(){
        if (instance == null){
            instance = new SingletonIsLazyIsThreadSafety();
        }

        return instance;
    }

}
