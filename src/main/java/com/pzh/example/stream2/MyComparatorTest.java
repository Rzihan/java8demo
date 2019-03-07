package com.pzh.example.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Pan梓涵
 * @date 2019/3/7 20:17
 */
public class MyComparatorTest {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("nihao", "hello", "world", "welcome");

//        System.out.println("按字符串长度进行排序:");
//        strings.sort(Comparator.comparingInt(String::length));
//        strings.sort((o1, o2) -> o2.length() - o1.length());

//        strings.sort(Comparator.comparingInt(String::length).reversed());
//        strings.sort(Comparator.comparingInt((String item) -> item.length()).reversed());
//        strings.sort(Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
//        strings.sort(Comparator.comparingInt(String::length).thenComparing((item1, item2) ->
//                        item1.toLowerCase().compareTo(item2.toUpperCase())));
//        strings.sort(Comparator.comparingInt(String::length)
//                .thenComparing(String::toLowerCase, Comparator.reverseOrder()));
//        strings.sort(Comparator.comparingInt(String::length).reversed()
//                .thenComparing(String::toLowerCase, Comparator.reverseOrder()));
        strings.sort(Comparator.comparingInt(String::length).reversed()
                .thenComparing(String::toLowerCase, Comparator.reverseOrder())
                .thenComparing(Comparator.reverseOrder()));
        System.out.println(strings);
    }
}
