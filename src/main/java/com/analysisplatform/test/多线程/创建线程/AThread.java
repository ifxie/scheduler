package com.analysisplatform.test.多线程.创建线程;

public class AThread extends Thread{
    @Override
    public void run() {
        // todo something
    }

    public static void main(String[] args) {
        Thread t=new AThread();
        t.start();
    }
}

