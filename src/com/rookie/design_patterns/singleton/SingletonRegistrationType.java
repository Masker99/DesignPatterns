package com.rookie.design_patterns.singleton;

/**
 * 懒汉式，线程安全，登记式/静态内部类式
 * 这种方式适合静态域的情况
 * 只有通过显示调用getInstance方法时，才会显式装载静态内部类，从而实例化instance
 * @author Masker
 */
public class SingletonRegistrationType {
    private static class SingletonRegistrationTypeHolder{
        private static final SingletonRegistrationType INSTANCE = new SingletonRegistrationType();
    }

    private SingletonRegistrationType(){}

    public SingletonRegistrationType getInstance(){
        return SingletonRegistrationTypeHolder.INSTANCE;
    }
}
