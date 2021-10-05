package com.rookie.design_patterns.template;

/**
 * 抽象模板类，负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成
 * @author Masker
 */
public abstract class Game {
    /**
     * 可变部分，初始化游戏
     */
    abstract void initialize();

    /**
     * 可变部分，开始游戏
     */
    abstract void startPlay();

    /**
     * 可变部分，结束游戏
     */
    abstract void endPlay();

    /**
     * 不可变部分，模板方法
     * 模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法。
     */
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
