package com.pzh.example.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * @author Pan梓涵
 * @date 2019/2/27 22:29
 */
public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.forEach(item -> System.out.println(item));
        list.forEach(System.out::println);
    }

}
