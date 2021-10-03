package com.rookie.design_patterns.factory_method;

/**
 * @author Masker
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Factory factory1 = new StudentFactory();
        Person person1 = factory1.createPerson();
        person1.say();

        Factory factory2 = new TeacherFactory();
        Person person2 = factory2.createPerson();
        person2.say();
    }
}
