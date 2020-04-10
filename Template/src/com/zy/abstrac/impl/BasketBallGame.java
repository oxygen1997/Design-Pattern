package com.zy.abstrac.impl;

import com.zy.abstrac.Game;

public class BasketBallGame extends Game {

    @Override
    protected void initialize() {
        System.out.println("basketball game initialize...");
    }

    @Override
    protected void start() {
        System.out.println("basketball game start...");
    }

    @Override
    protected void end() {
        System.out.println("basketball game end...");
    }

    ;
}
