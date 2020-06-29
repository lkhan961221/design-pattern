package com.haan.bridgepattern;

public abstract class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    public void operate(){
        implementor.operate();
    }
}
