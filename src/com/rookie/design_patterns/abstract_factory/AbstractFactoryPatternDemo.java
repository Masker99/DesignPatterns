package com.rookie.design_patterns.abstract_factory;

/**
 * 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。
 * @author Masker
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("animal");
        Animal animal = abstractFactory.getAnimal("cat");
        animal.multiply();

        AbstractFactory abstractFactory1 = FactoryProducer.getFactory("place");
        Place place = abstractFactory1.getPlace("farm");
        place.live();
    }
}
