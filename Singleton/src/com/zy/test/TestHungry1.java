package com.zy.test;

import com.zy.hungry.HungryIns1;

public class TestHungry1 {
    public static void main(String[] args) {
        HungryIns1 instance1 = HungryIns1.INSTANCE;
        HungryIns1 instance2 = HungryIns1.INSTANCE;
        System.out.println(instance1==instance2);
    }
}
