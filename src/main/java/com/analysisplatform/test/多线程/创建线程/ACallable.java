package com.analysisplatform.test.多线程.创建线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ACallable implements Callable<Integer> {
    @Override
    // 线程执行的操作都在call方法中
    public Integer call() throws Exception {
        return 1;
    }

    public static void main(String[] args) {
        Callable<Integer> callable=new ACallable();
        // Callable实现类的实例作作为参数传递到FutureTask构造器，构建实例。
        FutureTask<Integer> futureTask=new FutureTask<>(callable);
        // FutureTask实例作为Thread对象构造的参数。
        new Thread(futureTask,"Thread A").start();

        while (!futureTask.isDone()){
            System.out.println("wait....");
        }
        try{
            // 获取执行结果
            System.out.println(futureTask.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        // 结束
    }
}
