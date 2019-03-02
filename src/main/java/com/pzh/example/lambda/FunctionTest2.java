package com.pzh.example.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Pan梓涵
 * @date 2019/2/26 21:37
 */
public class FunctionTest2 {

    public static void main(String[] args) {
        FunctionTest2 functionTest2 = new FunctionTest2();

//        System.out.println(functionTest2.compute(2, value -> value * 3, value -> value * value));
//        System.out.println(functionTest2.compute2(2, value -> value * 3, value -> value * value));

//        System.out.println(functionTest2.compute3(1, 2, (value1, value2) -> value1 + value2));
//        System.out.println(functionTest2.compute3(1, 2, (value1, value2) -> value1 - value2));
//        System.out.println(functionTest2.compute3(1, 2, (value1, value2) -> value1 * value2));
//        System.out.println(functionTest2.compute3(1, 2, (value1, value2) -> value1 / value2));

        System.out.println(functionTest2.compute4(2, 3,
                (value1, value2) -> value1 * value2,
                value  -> value * value
        ));


    }

    public int compute(int value, Function<Integer, Integer> function1,
                       Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(value);
    }

    public int compute2(int value, Function<Integer, Integer> function1,
                        Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(value);
    }

    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction,
                        Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
