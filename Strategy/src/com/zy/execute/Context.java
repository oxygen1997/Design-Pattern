package com.zy.execute;

import com.zy.inter.Strategy;

public class Context{

    //策略选择执行器

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int execute(int num1,int num2){
        return strategy.doOperator(num1,num2);
    }

}
