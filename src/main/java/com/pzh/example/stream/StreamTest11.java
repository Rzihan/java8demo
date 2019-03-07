package com.pzh.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Pan梓涵
 * @date 2019/3/2 16:41
 */
public class StreamTest11 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello welcome", "world hello",
                "hello world hello", "hello welcome");
        Stream<String> distinct = list.stream()
                .map(s -> s.split(" "))
            .flatMap(Stream::of)
                .distinct();

    }
}
