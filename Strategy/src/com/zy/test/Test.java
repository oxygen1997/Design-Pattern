package com.zy.test;

import com.zy.execute.Context;
import com.zy.inter.impl.Add;
import com.zy.inter.impl.Division;
import com.zy.inter.impl.Multiply;
import com.zy.inter.impl.Substract;

public class Test {

    /*
        在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。
        这种类型的设计模式属于行为型模式。
        在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。
        策略对象改变 context 对象的执行算法。
     */

    /*
        意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
        主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
        何时使用：一个系统有许多许多类，而区分它们的只是他们直接的行为。
        如何解决：将这些算法封装成一个一个的类，任意地替换。
        关键代码：实现同一个接口。
     */

    public static void main(String[] args) {

        //加法
        Context contextAdd = new Context(new Add());
        System.out.println( "10+5 = "+contextAdd.execute(10,5)+"\n");

        //减法
        Context contextSubstract = new Context(new Substract());
        System.out.println( "10-5 = "+contextSubstract.execute(10,5)+"\n");

        //乘法
        Context contextMultiply = new Context(new Multiply());
        System.out.println( "10*5 = "+contextMultiply.execute(10,5)+"\n");

        //除法
        Context contextDivision = new Context(new Division());
        System.out.println( "10/5 = "+contextDivision.execute(10,5)+"\n");

    }

}
