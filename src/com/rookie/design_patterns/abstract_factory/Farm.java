package com.rookie.design_patterns.abstract_factory;

/**
 * @author Masker
 */
public class Farm implements Place{
    @Override
    public void live() {
        System.out.println("The animal will multiply in the farm.");
    }
}
