package com.rookie.design_patterns.factory_method;

/**
 * @author Masker
 */
public class StudentFactory implements Factory{

    @Override
    public Person createPerson() {
        return new Student();
    }
}
