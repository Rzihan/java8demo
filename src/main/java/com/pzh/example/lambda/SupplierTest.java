package com.pzh.example.lambda;

import java.util.function.Supplier;

/**
 * @author Pan梓涵
 * @date 2019/2/27 21:15
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());
    }
}
