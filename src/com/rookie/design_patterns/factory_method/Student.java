package com.rookie.design_patterns.factory_method;

/**
 * Person接口的一种实现类
 * @author Masker
 */
public class Student implements Person {
    @Override
    public void say(){
        System.out.println("i'm a student.");
    }
}
