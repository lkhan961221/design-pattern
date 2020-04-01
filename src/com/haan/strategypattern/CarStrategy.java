package com.haan.strategypattern;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/3/31
 */
public class CarStrategy extends Strategy {
    @Override
    public void travel() {
        System.out.println("travel by car!");
    }
}
