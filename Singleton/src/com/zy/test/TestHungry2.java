package com.zy.test;

import com.zy.hungry.HungryIns2;

public class TestHungry2 {
    public static void main(String[] args) {
        HungryIns2 instance1 = HungryIns2.INSTANCE;
        HungryIns2 instance2 = HungryIns2.INSTANCE;
        System.out.println(instance1==instance2);
    }
}
