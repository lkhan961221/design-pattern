package com.haan.simplefactory;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/3/31
 */

//加法计算类
public class AddOperator extends Operator {

    @Override
    public Double operate(Double num1, Double num2) {
        return num1+num2;
    }
}
