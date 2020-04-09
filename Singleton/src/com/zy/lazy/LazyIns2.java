package com.zy.lazy;

/**
 * 多线程：线程安全
 */
public class LazyIns2 {

    private volatile static  LazyIns2 INSTANCE;

    public static LazyIns2 getInstance(){
        if (INSTANCE==null){
            synchronized(LazyIns2.class){
                if (INSTANCE==null){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    INSTANCE=new LazyIns2();
                }
            }
        }
        return INSTANCE;
    }

    private LazyIns2(){}

}
