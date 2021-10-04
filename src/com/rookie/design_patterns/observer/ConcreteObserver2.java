package com.rookie.design_patterns.observer;

/**
 * 具体观察者二号
 * @author Masker
 */
public class ConcreteObserver2 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
