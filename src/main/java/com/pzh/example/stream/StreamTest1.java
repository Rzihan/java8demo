package com.pzh.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Pan梓涵
 * @date 2019/2/28 22:22
 */
public class StreamTest1 {

    public static void main(String[] args) {
        Stream stream1 = Stream.of("hello", "world", "hello world");

        String[] strings = new String[]{"hello", "world", "hello world"};
        Stream stream2 = Stream.of(strings);
        Stream stream3 = Arrays.stream(strings);

        List<String> list = Arrays.asList(strings);
        Stream<String> stream4 = list.stream();
    }
}
