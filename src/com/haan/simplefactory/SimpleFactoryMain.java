package com.haan.simplefactory;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/3/31
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        Product product = ProductFactory.getProduct("A");
        assert product != null;
        product.showName();
    }
}
