package com.pzh.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @author Pan梓涵
 * @date 2019/2/26 22:14
 */
public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);
        List<Person> personList = Arrays.asList(person1, person2, person3);
        PersonTest personTest = new PersonTest();
//        List<Person> result = personTest.getPersonsByUsername("zhangsan", personList);
//        result.forEach(person -> System.out.println(person.getUsername()));
//        List<Person> personsByAge = personTest.getPersonsByAge(20, personList);
//        personsByAge.forEach(person -> System.out.println(person.getAge()));
        List<Person> personResult = personTest.getPersonsByAge2(20, personList, (age, persons) -> {
           return persons.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
        });
        personResult.forEach(person -> System.out.println(person.getAge()));
    }

    public List<Person> getPersonsByUsername(String username, List<Person> personList) {
        return personList.stream().filter(person -> person.getUsername().equals(username))
                .collect(Collectors.toList());
    }

    public List<Person> getPersonsByAge(int age, List<Person> persons) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personList) ->
                personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());
        return biFunction.apply(age, persons);
    }

    public List<Person> getPersonsByAge2(int age, List<Person> persons,
                                         BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, persons);
    }
}

