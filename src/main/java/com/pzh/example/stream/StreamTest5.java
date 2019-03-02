package com.pzh.example.stream;

import java.io.*;
import java.util.Arrays;
import java.util.List;

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
        
    }
}
