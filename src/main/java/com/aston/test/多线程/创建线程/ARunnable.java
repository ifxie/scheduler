package com.aston.test.多线程.创建线程;

public class ARunnable implements Runnable{
    @Override
    public void run() {
        // todo something
    }

    public static void main(String[] args) {
        Runnable task=new ARunnable();
        Thread t=new Thread(task);
        t.start();
    }
}
