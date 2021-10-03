package com.rookie.design_patterns.factory_method;

/**
 * 定义一个工厂抽象类，提供构建具体对象的抽象方法
 * @author Masker
 */
public interface Factory {
    /**
     * 构造具体对象的方法
     * @return
     */
    public abstract Person createPerson();
}
