package com.aston.test.设计模式.单例模式;

public class Singleton {
    private static Singleton instance;
    private Singleton(){};
    public static Singleton getInstance_1(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance_DCL(){
      if (instance==null){
          synchronized (Singleton.class){
              if (instance==null){
                  instance=new Singleton();
              }
          }
      }
      return instance;
    }
}
