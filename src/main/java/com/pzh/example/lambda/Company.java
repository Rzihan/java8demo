package com.pzh.example.lambda;

import java.util.List;

/**
 * @author Pan梓涵
 * @date 2019/2/27 22:15
 */
public class Company {

    private String name;

    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
