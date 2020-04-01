package com.haan.strategypattern;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/3/31
 */
public class StrategyPatternMain {
    public static void main(String[] args) {
        TravelContext context = new TravelContext(new BusStrategy());
        context.travel();
    }
}
