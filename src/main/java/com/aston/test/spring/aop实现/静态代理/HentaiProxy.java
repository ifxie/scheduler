package com.aston.test.spring.aop实现.静态代理;

public class HentaiProxy implements Person{
    Hentai hentai;
    @Override
    public void sayHello() {
        System.out.println("在变态说话之前,可以做些什么");
        if (hentai==null)hentai=new Hentai();
        System.out.println("在变态说话之后,可以做些什么");
        hentai.sayHello();
    }

    /**
     * 静态代理其实就是代理设计模式的应用
     * @param args
     */
    public static void main(String[] args) {
        Person person=new HentaiProxy();
        person.sayHello();
    }
}
