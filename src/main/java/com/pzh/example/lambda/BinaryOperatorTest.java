package com.pzh.example.lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author Pan梓涵
 * @date 2019/2/27 21:32
 */
public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperatorTest test = new BinaryOperatorTest();
        System.out.println(test.operator(1, 1, (value1, value2) -> value1 * value2));
        System.out.println(test.operator(1, 1, (value1, value2) -> value1 - value2));
        System.out.println(test.operator(1, 1, (value1, value2) -> value1 + value2));
        System.out.println(test.operator(1, 1, (value1, value2) -> value1 / value2));

        System.out.println("-----------------");
        System.out.println(test.operator("hello123", "world", (a, b) -> a.length() - b.length()));
        System.out.println(test.operator("hello123", "world", (a, b) -> a.charAt(0) - b.charAt(0)));
    }

    public int operator(int value1, int value2, BinaryOperator<Integer> operator) {
        return operator.apply(value1, value2);
    }

    public String operator(String s0, String s1, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(s0, s1);
    }
}
