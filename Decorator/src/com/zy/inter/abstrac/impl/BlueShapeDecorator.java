package com.zy.inter.abstrac.impl;

import com.zy.inter.Shape;
import com.zy.inter.abstrac.ShapeDecorator;

public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    private void setShapeBorder(){
        System.out.println("Border color : blue");
    }

    @Override
    public void draw(){
        shapeDecorator.draw();
        setShapeBorder();
    }
}
