package com.pzh.example.lambda;

import java.util.function.Supplier;

/**
 * @author Pan梓涵
 * @date 2019/2/27 21:17
 */
public class StudentTest {

    public static void main(String[] args) {
        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get().getName());
        System.out.println("-------------");

        Supplier<Student> supplier2 = Student::new;
        System.out.println(supplier2.get().getName());

    }
}
