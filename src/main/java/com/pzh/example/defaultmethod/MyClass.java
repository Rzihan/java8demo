package com.pzh.example.defaultmethod;

/**
 * @author Pan梓涵
 * @date 2019/2/28 21:53
 */
public class MyClass extends MyInterface1Impl implements MyInterface2 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}
