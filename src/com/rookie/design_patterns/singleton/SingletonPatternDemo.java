package com.rookie.design_patterns.singleton;

/**
 * @author Masker
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object1 = SingleObject.getSingleObject();
        System.out.println(object1.toString());
        SingleObject object2 = SingleObject.getSingleObject();
        System.out.println(object2.toString());
        /**
         * 运行结果：
         * com.rookie.design_patterns.singleton.SingleObject@1b6d3586
         * com.rookie.design_patterns.singleton.SingleObject@1b6d3586
         */
    }
}
