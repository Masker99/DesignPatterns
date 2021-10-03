package com.rookie.design_patterns.factory_method;

/**
 * @author Masker
 */
public class TeacherFactory implements Factory{

    @Override
    public Person createPerson() {
        return new Teacher();
    }
}
