package com.zy.inter.abstrac;

import com.zy.inter.Shape;

public abstract class ShapeDecorator implements Shape {

    protected Shape shapeDecorator;

    public ShapeDecorator(Shape decoratorShape){
        this.shapeDecorator = decoratorShape;
    }

    @Override
    public void draw(){
        shapeDecorator.draw();
    }
}
