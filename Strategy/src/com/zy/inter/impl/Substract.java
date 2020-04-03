package com.zy.inter.impl;

import com.zy.inter.Strategy;

public class Substract implements Strategy {

    @Override
    public int doOperator(int num1, int num2) {
        return num1-num2;
    }
}
