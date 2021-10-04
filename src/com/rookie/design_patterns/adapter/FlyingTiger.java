package com.rookie.design_patterns.adapter;

/**
 * 该类就是适配器类
 * @author Masker
 */
public class FlyingTiger implements Bird{
    Animal animal;

    public FlyingTiger(Animal animal){
        this.animal = animal;
    }

    @Override
    public void fly() {
        animal.run();
    }
}
