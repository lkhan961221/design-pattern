package com.haan.bridgepattern;

public class ImplementorA implements Implementor {
    @Override
    public void operate() {
        System.out.println("执行实现A...");
    }
}
