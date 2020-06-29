package com.haan.bridgepattern;

public class ImplementorB implements Implementor {
    @Override
    public void operate() {
        System.out.println("执行实现B...");
    }
}
