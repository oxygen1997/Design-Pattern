package com.zy.test;

import com.zy.lazy.LazyIns1;

public class TestLazy1 {
    public static void main(String[] args) {
        LazyIns1 instance1 = LazyIns1.getInstance();
        LazyIns1 instance2 = LazyIns1.getInstance();
        System.out.println(instance1==instance2);
    }
}
