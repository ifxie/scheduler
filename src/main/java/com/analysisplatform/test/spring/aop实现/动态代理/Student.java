package com.analysisplatform.test.spring.aop实现.动态代理;

public class Student implements Person{
    String name;
    public Student(String name){
        this.name=name;
    }
    @Override
    public void sayHello() {
        System.out.println(this.name+" say hello");
    }
}
