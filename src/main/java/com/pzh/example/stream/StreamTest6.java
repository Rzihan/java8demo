package com.pzh.example.stream;

import java.util.UUID;
import java.util.stream.Stream;

/**
 * @author Pan梓涵
 * @date 2019/3/2 14:54
 */
public class StreamTest6 {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.generate(UUID.randomUUID()::toString);
//        System.out.println(stringStream.findFirst().get());
//        stringStream.findFirst().ifPresent(System.out::println);
//        System.out.println("-----------------");
//        Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);
//        System.out.println("-----------------");
//        int sum = Stream.iterate(1, item -> item + 2).limit(6)
//                .filter(integer -> integer > 2)
//                .mapToInt(integer -> integer * 2)
//                .skip(2)
//                .limit(2)
//                .sum();
//        System.out.println(sum);
        Stream.iterate(0, item -> item + 2).forEach(System.out::println);
    }
}
