package com.rookie.design_patterns.abstract_factory;

/**
 * 获取工厂的抽象类
 * @author Masker
 */
public abstract class AbstractFactory {
    /**
     * 获取动物
     * @param specie
     * @return
     */
    public abstract Animal getAnimal(String specie);

    /**
     * 获取繁衍地点
     * @param place
     * @return
     */
    public abstract Place getPlace(String place);
}
