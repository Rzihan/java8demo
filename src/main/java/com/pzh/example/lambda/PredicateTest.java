package com.pzh.example.lambda;

import java.util.function.Predicate;

/**
 * @author Pan梓涵
 * @date 2019/2/27 20:26
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;
        System.out.println(predicate.test("hello"));
    }
}
