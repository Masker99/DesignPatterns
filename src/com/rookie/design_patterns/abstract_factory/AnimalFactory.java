package com.rookie.design_patterns.abstract_factory;

/**
 * 继承抽象工厂类，定义定义动物的简单工厂类
 * @@author Masker
 */
public class AnimalFactory extends AbstractFactory {
    @Override
    public Animal getAnimal(String specie) {
        if (specie==null||specie.equals("")){
            return null;
        }

        if (specie.equalsIgnoreCase("dog")){
            return new Dog();
        }else if(specie.equalsIgnoreCase("cat")){
            return new Cat();
        }

        return null;
    }

    @Override
    public Place getPlace(String place) {
        return null;
    }
}
