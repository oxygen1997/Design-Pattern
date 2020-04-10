package com.zy.abstrac.impl;

import com.zy.abstrac.Game;

public class FootBallGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("footBall game initialize...");
    }

    @Override
    protected void start() {
        System.out.println("footBall game start...");
    }

    @Override
    protected void end() {
        System.out.println("footBall game end...");
    }
}
