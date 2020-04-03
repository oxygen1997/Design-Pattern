package com.zy.inter.abstrac.impl;

import com.zy.inter.Shape;
import com.zy.inter.abstrac.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

    //传递shape
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setShapeBorder(){
        System.out.println("Border color : red ");
    }

    //覆盖被装饰的功能方法
    @Override
    public void draw(){
        shapeDecorator.draw();
        //装饰功能，将shape的border装饰为red
        setShapeBorder();
    }

}
