package com.rookie.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;
/**
 * 抽象主题（Subject）角色：也叫抽象目标类，
 * 它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，
 * 以及通知所有观察者的抽象方法。
 * @author Masker
 */
abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知观察者的方法
     */
    public abstract void notifyObserver();
}
