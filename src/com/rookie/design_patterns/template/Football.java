package com.rookie.design_patterns.template;

/**
 * 继承抽象类，实现可变部分
 * @author Masker
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
