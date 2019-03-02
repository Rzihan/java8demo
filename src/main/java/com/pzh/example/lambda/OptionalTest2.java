package com.pzh.example.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author Pan梓涵
 * @date 2019/2/27 22:16
 */
public class OptionalTest2 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");
        Employee employee2 = new Employee();
        employee.setName("lisi");

        Company company = new Company();
        company.setName("conpany1");

        List<Employee> employees = Arrays.asList(employee, employee2);
//        company.setEmployees(employees);

        Optional<Company> optionalCompany = Optional.ofNullable(company);
        System.out.println(optionalCompany.map(theCompany -> theCompany.getEmployees())
                .orElse(Collections.emptyList()));
    }
}
