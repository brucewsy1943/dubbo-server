package com.gpedu.dubbo;

public class IGpHelloImpl implements  IGpHello{


    @Override
    public String sayHello(String msg) {
        return msg;
    }
}