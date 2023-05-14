package com.aston.test.spring.aop实现.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        // 创建一个被代理类的实例
        Person momo=new Student("caishudan");
        // 创建一个与代理对象相关的InvocationHandler
        InvocationHandler handler=new StudentInvocationHandler<>(momo);
        //创建一个代理对象stuProxy来代理linqian，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person stuPoxy=(Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, handler);
        // 代理执行说hello的方法
        stuPoxy.sayHello();;
//        HashMap
    }
}
