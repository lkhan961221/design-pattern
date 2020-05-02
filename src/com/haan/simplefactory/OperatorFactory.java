package com.haan.simplefactory;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/3/31
 */
public class OperatorFactory {
    public static Operator getOperator(String type){
        switch (type){
            case "+":
                return new AddOperator();   //加法运算类
            case "-":
                return new SubOperator();   //减法运算类
            case "*":
                return new MulOperator();   //乘法运算类
            case "/":
                return new DivOperator();   //除法运算类
            default:
                return null;
        }
    }
}
