package com.haan.bridgepattern;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operate() {
        System.out.println("RefinedAbstraction...");
        super.operate();
    }
}
