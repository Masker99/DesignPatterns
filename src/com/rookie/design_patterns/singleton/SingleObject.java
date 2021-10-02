package com.rookie.design_patterns.singleton;

/**
 *
 * @author Masker
 */
public class SingleObject {
    //利用静态变量存储构造的实例
    private static SingleObject singleObject = new SingleObject();

    /**
     * 构造方法设为private，确保不会被调用，从而构造多个实例
     */
    private SingleObject(){}

    /**
     * 访问该实例的全局节点
     * @return 缓存的实例对象
     */
    public static SingleObject getSingleObject(){
        return singleObject;
    }
}
