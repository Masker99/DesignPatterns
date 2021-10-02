package com.rookie.design_patterns.singleton;

/**
 * 懒汉式，线程安全，双重锁校验
 * 线程安全，且在多线程情况下保持高性能
 * @author Masker
 */
public class SingletonDoubleCheckedLocking {
    private static SingletonDoubleCheckedLocking instance ;

    private SingletonDoubleCheckedLocking(){}

    public static SingletonDoubleCheckedLocking getInstance(){
        if(instance == null ){
            synchronized (SingletonDoubleCheckedLocking.class){
                if(instance == null){
                    instance = new SingletonDoubleCheckedLocking();
                }
            }
        }

        return instance;
    }
}
