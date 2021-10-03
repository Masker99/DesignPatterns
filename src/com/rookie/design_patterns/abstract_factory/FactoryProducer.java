package com.rookie.design_patterns.abstract_factory;

/**
 * 工厂生成器类/创造器类，通过参数获取需要的工厂
 * @author Masker
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if (factory.equalsIgnoreCase("animal")){
            return new AnimalFactory();
        }else if (factory.equalsIgnoreCase("place")){
            return new PlaceFactory();
        }

        return null;
    }
}
