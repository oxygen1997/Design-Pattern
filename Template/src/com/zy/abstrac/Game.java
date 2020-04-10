package com.zy.abstrac;

public abstract class Game {

    protected abstract void initialize();
    protected abstract void start();
    protected abstract void end();

    public final void play(){
        initialize();
        start();
        end();
    }
}
