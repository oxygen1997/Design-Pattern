package com.zy.factory;

import com.zy.factory.abstrac.AbstractFactory;
import com.zy.inter.Color;
import com.zy.inter.Shape;
import com.zy.inter.impl.color.Blue;
import com.zy.inter.impl.color.Green;
import com.zy.inter.impl.color.Red;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if ("blue".equalsIgnoreCase(color)){
            return new Blue();
        }else if ("green".equalsIgnoreCase(color)){
            return new Green();
        }else if ("red".equalsIgnoreCase(color)){
            return new Red();
        }else {
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
