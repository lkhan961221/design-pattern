package com.haan.bridgepattern;

public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction(new ImplementorB());
        abstraction.operate();
    }
}
