package com.pzh.example.defaultmethod;

/**
 * @author Pan梓涵
 * @date 2019/2/28 21:54
 */
public interface MyInterface2 {

    default void myMethod() {
        System.out.println("my interface2");
    }
}
