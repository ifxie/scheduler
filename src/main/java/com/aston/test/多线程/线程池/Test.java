package com.aston.test.多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService service= Executors.newCachedThreadPool();
        service.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
    }
}
