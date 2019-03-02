package com.pzh.example.lambda;

import java.util.Optional;

/**
 * @author Pan梓涵
 * @date 2019/2/27 22:03
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optionalS = Optional.empty();
//        if (optionalS.isPresent()) {
//            System.out.println(optionalS.get());
//        }
        // 推荐的Optional使用方式
        optionalS.ifPresent(item -> System.out.println(item));
        System.out.println("---------------");
        System.out.println(optionalS.orElse("world"));
        System.out.println("---------------");
        System.out.println(optionalS.orElseGet(() -> "ni hao"));
    }
}
