package com.rookie.design_patterns.easy_factory;

/**
 * @author Masker
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();

        Person person = personFactory.createPerson("student");
        person.say();

        Person person1 = personFactory.createPerson("teacher");
        person1.say();

    }
}
