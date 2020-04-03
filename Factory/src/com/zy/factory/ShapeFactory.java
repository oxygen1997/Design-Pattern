package com.zy.factory;

import com.zy.inter.Shape;
import com.zy.inter.impl.Circle;
import com.zy.inter.impl.Rectangle;
import com.zy.inter.impl.Square;

public class ShapeFactory {

    public  Shape getShape(String shape){
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
