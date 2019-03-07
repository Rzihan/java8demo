package com.pzh.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Pan梓涵
 * @date 2019/3/2 17:06
 */
public class StreamTest13 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 20);
        Student student3 = new Student("wangwu", 90, 30);
        Student student4 = new Student("zhangsan", 80, 30);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);
        List<Integer> integers = Arrays.asList(1,1,1,1,2,2,2,2);
        Map<Integer, List<Integer>> collect2 = integers.stream().distinct().collect(Collectors.groupingBy(item ->
                item));
        List<int[]> ints = Arrays.asList(new int[]{1, 2}, new int[]{2, 4}, new int[]{6, 6});

//        students.stream().reduce()

        System.out.println(collect2);
//        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy());
//        System.out.println(map);
//        Map<Integer, List<Student>> map1 = students.stream().collect(Collectors.groupingBy(Student::getScore));
//        System.out.println(map1);
//        Map<String, Long> collect = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
//        System.out.println(collect);
//        Map<String, Double> collect1 = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors
//                .averagingDouble(Student::getScore)));
//        System.out.println(collect1);


//        Map<Boolean, List<Student>> collect = students.stream()
//                .collect(Collectors.partitioningBy(item -> item.getScore() >= 90));
//        List<Student> studentList = collect.get(true);
//        studentList.forEach(student -> System.out.println(student.getScore()));
//        System.out.println(collect);
    }
}
