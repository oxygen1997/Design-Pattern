package com.zy.factory.abstrac;

import com.zy.inter.Color;
import com.zy.inter.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
