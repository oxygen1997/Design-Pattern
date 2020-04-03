package com.zy.inter.abstrac.impl;

import com.zy.inter.Shape;
import com.zy.inter.abstrac.ShapeDecorator;

public class GreenShapeDecorator extends ShapeDecorator {

    public GreenShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    private void setShapeBorder(){
        System.out.println("Border color : green");
    }

    @Override
    public void draw(){
        shapeDecorator.draw();
        setShapeBorder();
    }
}
