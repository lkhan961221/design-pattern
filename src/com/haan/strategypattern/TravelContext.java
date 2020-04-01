package com.haan.strategypattern;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/3/31
 */
public class TravelContext {
    private Strategy strategy;

    public TravelContext(Strategy strategy){
        this.strategy = strategy;
    }

    public void travel(){
        this.strategy.travel();
    }
}
