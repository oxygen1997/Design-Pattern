package com.zy.inter.impl;

import com.zy.inter.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("shape : circle");
    }
}
