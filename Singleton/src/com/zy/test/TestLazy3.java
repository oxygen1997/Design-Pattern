package com.zy.test;

import com.zy.lazy.LazyIns3;

public class TestLazy3 {
    public static void main(String[] args) {
        LazyIns3 instance1 = LazyIns3.getInstance();
        LazyIns3 instance2 = LazyIns3.getInstance();

        System.out.println(instance1==instance2);
    }
}
