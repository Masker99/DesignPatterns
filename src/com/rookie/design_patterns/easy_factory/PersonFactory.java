package com.rookie.design_patterns.easy_factory;

/**
 * 定义一个简单工厂类
 * @author Masker
 */
public class PersonFactory {
    public Person createPerson(String personType){
        if (personType == null || personType.equals("")){
            return null;
        }

        if(personType.equalsIgnoreCase("student")){
            return new Student();
        }else if (personType.equalsIgnoreCase("teacher")){
            return new Teacher();
        }

        return null;
    }
}
