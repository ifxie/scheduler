package com.aston.test.设计模式.工厂模式;

public class PhoneFactory {
    public MobilePhone getMobilePhone(String productName){
        MobilePhone phone=null;
        if (productName=="apple")phone=new Apple();
        else if (productName=="xiaomi")phone=new Xiaomi();
        else if (productName=="huawei")phone=new Huawei();
        return phone;
    }
}
