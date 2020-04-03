package com.zy.test;

import com.zy.lazy.LazyIns2;

import java.util.concurrent.*;

public class TestLazy2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable call = new Callable<LazyIns2>() {
            @Override
            public LazyIns2 call() throws Exception {
                return LazyIns2.getInstance();
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit(call);
        Future f2 = es.submit(call);

        Object obj1 = f1.get();
        Object obj2 = f2.get();

        es.shutdown();

        System.out.println(obj1==obj2);

    }
}

/*
class CallImpl implements Callable{
    @Override
    public LazyIns2 call() throws Exception {
        return LazyIns2.getInstance();
    }
}
*/
