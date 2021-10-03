package com.rookie.design_patterns.easy_factory;

/**
 * Person接口的一种实现类
 * @author Masker
 */
public class Teacher implements Person{
    @Override
    public void say(){
        System.out.println("i'm a teacher.");
    }
}
