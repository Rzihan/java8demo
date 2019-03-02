package com.pzh.example.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Pan梓涵
 * @date 2019/2/28 22:30
 */
public class StreamTest3 {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(integers.stream().map(item -> item * 2).reduce(0, Integer::sum));
    }
}
