package com.pzh.example.stream2;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @author Pan梓涵
 * @date 2019/3/3 16:47
 */
public class StreamTest1 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 100);
        Student student4 = new Student("zhaoliu", 90);
        Student student5 = new Student("zhaoliu", 90);
        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);

        List<Student> students1 = students.stream().collect(toList());
        students1.forEach(System.out::println);

        System.out.println("count: " + students.stream().collect(counting()));
        System.out.println("count: " + students.stream().count());

        students.stream().collect(minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        students.stream().collect(maxBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        System.out.println(students.stream().collect(averagingInt(Student::getScore)));
        System.out.println(students.stream().collect(summingInt(Student::getScore)));
        IntSummaryStatistics summaryStatistics = students.stream().collect(Collectors.summarizingInt(Student::getScore));
        System.out.println(summaryStatistics);
        System.out.println("------------------------");

        System.out.println(students.stream().map(Student::getName).collect(joining()));
        System.out.println(students.stream().map(Student::getName).collect(joining(",")));
        System.out.println(students.stream().map(Student::getName).collect(joining(",", "<begin>", "<end>")));
        System.out.println("------------------------");

        Map<Integer, Map<String, List<Student>>> mapMap = students.stream()
                .collect(groupingBy(Student::getScore, groupingBy(Student::getName)));
        System.out.println(mapMap);
        System.out.println("------------------------");

        Map<Boolean, List<Student>> scores = students.stream()
                .collect(partitioningBy(student -> student.getScore() > 80));
        System.out.println(scores);
        System.out.println("------------------------");

        Map<Boolean, Map<Boolean, List<Student>>> booleanMapMap = students.stream()
                .collect(partitioningBy(student -> student.getScore() > 80,
                        partitioningBy(student -> student.getScore() > 90)));
        System.out.println(booleanMapMap);
        System.out.println("------------------------");

        Map<Boolean, Long> booleanLongMap = students.stream()
                .collect(partitioningBy(student -> student.getScore() > 80, counting()));
        System.out.println(booleanLongMap);
        System.out.println("------------------------");

        Map<String, Student> stringStudentMap = students.stream()
                .collect(groupingBy(Student::getName,
                        collectingAndThen(minBy(Comparator.comparingInt(Student::getScore)), Optional::get)));
        System.out.println(stringStudentMap);
    }
}
