package com.pzh.example.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Pan梓涵
 * @date 2019/2/28 22:43
 */
public class StreamTest4 {

    public static void main(String[] args) {
//        Stream<String> stringStream = Stream.of("hello", "world", "hello world");
//        String[] arrays = stringStream.toArray(length -> new String[length]);
//        String[] arrays = stringStream.toArray(String[]::new);
//        Arrays.asList(arrays).forEach(System.out::println);

        Stream<String> stream = Stream.of("hello", "world", "hello world");
//        List<String> strings = stream.collect(Collectors.toList());
//        strings.forEach(System.out::println);
//        List<Object> collect = stream.collect(
//                () -> new ArrayList<>(),
//                (theList, item) -> theList.add(item),
//                (theList1, theList2) -> theList1.addAll(theList2)
//        );
//        LinkedList<Object> collect1 = stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
//        collect.forEach(System.out::println);

//        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
//        list.forEach(System.out::println);

//        Set<String> strings = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(strings.getClass());
//        strings.forEach(System.out::println);

//        String s = stream.collect(Collectors.joining());
//        System.out.println(s);


    }
}
