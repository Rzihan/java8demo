package com.pzh.example.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Pan梓涵
 * @date 2019/3/4 19:57
 */
public class Test {

    public static void main(String[] args) {
        List<int[]> ints0 = Arrays.asList(new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6});
        List<int[]> ints1 = Arrays.asList(new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6});
        List<int[]> ints2 = Arrays.asList(new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6});
        List<int[]> ints3 = Arrays.asList(new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6});
        List<List<int[]>> lists = Arrays.asList(ints0, ints1, ints2, ints3);
        lists.stream().flatMap((Function<List<int[]>, Stream<int[]>>) Collection::stream).flatMapToInt(IntStream::of)
                .forEach(System.out::println);


        Stream<Object> objectStream = lists.stream().flatMap((Function<List<int[]>, Stream<?>>) Stream::of);

        System.out.println("--------------------");
        int[] ints6 = new int[]{1,2,3,4,5};
        Arrays.asList(ints6).forEach(System.out::println);
        List<Integer> result = new ArrayList<>(ints6.length);
        result.forEach(System.out::println);

        String test = "0";
        switch (test) {
            case "0":
                System.out.println(test);
                break;
            default:
        }

        Byte one = 1;
        switch (one) {
            case 1:
                System.out.println();
        }
    }
}
