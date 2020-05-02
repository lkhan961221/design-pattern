package com.haan.simplefactory;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/3/31
 */

//减法计算类
public class SubOperator extends Operator {

    @Override
    public Double operate(Double num1, Double num2) {
        return num1-num2;
    }
}
