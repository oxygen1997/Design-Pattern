package com.zy.lazy;

/**
 * 单线程：线程不安全
 */
public class LazyIns1 {

    private static LazyIns1 INSTANCE;

    public static LazyIns1 getInstance(){
        if (INSTANCE==null){
            INSTANCE=new LazyIns1();
        }
        return INSTANCE;
    }

   private LazyIns1(){}
}
