package com.rookie.design_patterns.adapter;

/**
 * @author Masker
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        new FlyingTiger(new Tiger()).fly();
    }
}
