package com.haan.simplefactory;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/3/31
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        Operator operator = OperatorFactory.getOperator("+");
        assert operator != null;
        Double result = operator.operate(1.0, 4.0);
        System.out.println(result);
    }
}
