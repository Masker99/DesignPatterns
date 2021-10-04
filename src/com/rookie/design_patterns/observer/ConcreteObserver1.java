package com.rookie.design_patterns.observer;

/**
 * 具体观察者一号
 * 具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，
 * 以便在得到目标的更改通知时更新自身的状态
 * @author Masker
 */
public class ConcreteObserver1 implements Observer{

    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
