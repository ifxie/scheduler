package com.analysisplatform.test.设计模式.代理模式;


// proxy
public class BelligerentState implements Country{
    private Country country;
    @Override
    public void enterAWar() {
        if (country==null){
            country=new ControllerState();
        }
        country.enterAWar();
    }
}
