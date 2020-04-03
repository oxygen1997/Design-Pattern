package com.zy.test;

import com.zy.inter.Shape;
import com.zy.inter.abstrac.impl.BlueShapeDecorator;
import com.zy.inter.abstrac.impl.GreenShapeDecorator;
import com.zy.inter.abstrac.impl.RedShapeDecorator;
import com.zy.inter.impl.Circle;
import com.zy.inter.impl.Rectangle;
import com.zy.inter.impl.Square;

public class TestDecorator {
    /*
        装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
        这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
        我们通过下面的实例来演示装饰器模式的用法。其中，我们将把一个形状装饰上不同的颜色，同时又不改变形状类。
     */

    /*
        意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
        主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
        何时使用：在不想增加很多子类的情况下扩展类。
        如何解决：将具体功能职责划分，同时继承装饰者模式。
        关键代码： 1、Component 类充当抽象角色，不应该具体实现。 2、修饰类引用和继承 Component 类，具体扩展类重写父类方法。
     */
    public static void main(String[] args) {

        //被装饰的draw功能  红边正方形
        System.out.println("红边正方形");
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(new Square());
        redShapeDecorator.draw();
        System.out.println();

        //未被装饰draw功能  普通正方形
        System.out.println("普通正方形");
        Shape square = new Square();
        square.draw();
        System.out.println();

        //被装饰的draw功能 蓝边圆形
        System.out.println("蓝边圆形");
        BlueShapeDecorator blueShapeDecorator = new BlueShapeDecorator(new Circle());
        blueShapeDecorator.draw();
        System.out.println();

        //未被装饰draw功能  普通圆形
        System.out.println("普通圆形");
        Shape circle = new Circle();
        circle.draw();
        System.out.println();

        //被装饰的draw功能  绿边长方形
        System.out.println("绿边长方形");
        GreenShapeDecorator greenShapeDecorator = new GreenShapeDecorator(new Rectangle());
        greenShapeDecorator.draw();
        System.out.println();

        //未被装饰draw功能  普通长方形
        System.out.println("普通长方形");
        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}
