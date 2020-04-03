package com.zy.test;

import com.zy.factory.ColorFactory;
import com.zy.factory.ShapeFactory;
import com.zy.inter.Color;
import com.zy.inter.Shape;

public class TestFactory {

    /*
        抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
        这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
        在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
    */

    public static void main(String[] args) {
        /*
            意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
            主要解决：主要解决接口选择的问题。
            何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
            如何解决：在一个产品族里面，定义多个产品。
            关键代码：在一个工厂里聚合多个同类产品。
        */
        //shape工厂
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        //color工厂
        ColorFactory colorFactory = new ColorFactory();

        Color blue = colorFactory.getColor("blue");
        blue.fill();

        Color red = colorFactory.getColor("red");
        red.fill();

        Color green = colorFactory.getColor("green");
        green.fill();

    }
}
