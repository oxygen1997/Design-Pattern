package com.zy.factory;

import com.zy.factory.abstrac.AbstractFactory;
import com.zy.inter.Color;
import com.zy.inter.Shape;
import com.zy.inter.impl.shape.Circle;
import com.zy.inter.impl.shape.Rectangle;
import com.zy.inter.impl.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if ("square".equalsIgnoreCase(shape)){
            return new Square();
        }else if ("circle".equalsIgnoreCase(shape)){
            return new Circle();
        }else if ("rectangle".equalsIgnoreCase(shape)){
            return new Rectangle();
        }else {
            return null;
        }
    }
}
