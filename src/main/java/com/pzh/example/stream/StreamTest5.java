package com.pzh.example.stream;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Pan梓涵
 * @date 2019/3/1 16:03
 */
public class StreamTest5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world", "test");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("----------------");

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        list1.stream().map(item -> item * item).forEach(System.out::println);
        System.out.println("---------------");

        Stream<List<Integer>> stream = Stream.of(Collections.singletonList(1),
                Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        stream.flatMap(Collection::stream).map(item -> item * item).forEach(System.out::println);
        
    }
}
