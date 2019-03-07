package com.pzh.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Pan梓涵
 * @date 2019/3/2 16:56
 */
public class StreamTest12 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi", "Hello", "你好");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
//        list2.stream()
//            .map(s -> s + (list1.get(new Random().nextInt(3))))
//            .forEach(System.out::println);
        List<String> collect = list1.stream()
                .flatMap(item -> list2.stream().map(item2 -> item + " " + item2))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

    }
}
