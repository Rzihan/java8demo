package com.pzh.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

/**
 * @author Pan梓涵
 * @date 2019/3/2 16:29
 */
public class StreamTest10 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.stream()
//            .filter(s -> s.length() == 5)
//            .limit(1)
//            .forEach(s -> System.out.println(s.length()));
//        list.stream()
//            .mapToInt(String::length)
//            .filter(length -> length == 5)
//            .findFirst()
//            .ifPresent(System.out::println);
        TreeSet<String> collect = list.stream().collect(Collectors.toCollection(TreeSet::new));
    }
}
