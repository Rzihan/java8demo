package com.pzh.example.lambda;

import java.util.function.Function;

/**
 * @author Pan梓涵
 * @date 2019/2/26 21:09
 */
public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute(1, value -> {
            return 2 * value;
        }));
        System.out.println(functionTest.compute(2, value -> 5 + value));
        System.out.println(functionTest.compute(3, value -> value * value));

        System.out.println(functionTest.convert(5, value -> String.valueOf(value + "helloWorld")));


    }

    public int compute(int value, Function<Integer, Integer> function) {
        return function.apply(value);
    }

    public String convert(int value, Function<Integer, String> function) {
        return function.apply(value);
    }
}
