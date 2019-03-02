package com.pzh.example.defaultmethod;

/**
 * @author Pan梓涵
 * @date 2019/2/28 21:52
 */
public interface MyInterface1 {

    default void myMethod() {
        System.out.println("my interface");
    }
}
