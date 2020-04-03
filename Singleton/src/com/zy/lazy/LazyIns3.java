package com.zy.lazy;

/**
 * 内部类不会随着外部类加载而加载，只会在使用时加载本身，静态内部类为线程共享资源，只有一份。
 */
public class LazyIns3 {

    private LazyIns3(){}

    public static class Inner{
        private static LazyIns3 INSTANCE = new LazyIns3();
    }

    public static LazyIns3 getInstance(){
        return Inner.INSTANCE;
    }
}
