package com.analysisplatform.test.设计模式.代理模式;

public class Test {
    public static void main(String[] args) {
        Country con=new BelligerentState();
        con.enterAWar();
    }
}
