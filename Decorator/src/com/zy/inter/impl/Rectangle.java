package com.zy.inter.impl;

import com.zy.inter.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("shape : rectangle");
    }
}
