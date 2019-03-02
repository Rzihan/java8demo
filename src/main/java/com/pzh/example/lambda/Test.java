package com.pzh.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Pan梓涵
 * @date 2019/2/24 10:20
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("--------------");
        list.forEach(integer -> System.out.println(integer));
        // method reference
        list.forEach(System.out::println);
        System.out.println("-------------");

    }
}
