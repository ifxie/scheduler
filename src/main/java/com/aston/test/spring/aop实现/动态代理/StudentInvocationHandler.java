package com.aston.test.spring.aop实现.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudentInvocationHandler<T> implements InvocationHandler {
    T target;
    public StudentInvocationHandler(T target){
        this.target=target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行"+method.getName());
        Object result=method.invoke(target,args);
        return result;
    }
}
