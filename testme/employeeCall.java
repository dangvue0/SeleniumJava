package com.dangvue0.testme;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class employeeCall {

    public static void main(String[] args) {
        employee empl = new employee("dang","vue", 1,20, 1986);
        employee empl2 = new employee("rand", "paul", 2, 23, 1954);
        System.out.println(empl);
        List<employee>emp = Arrays.asList(new employee("dang","vue", 1,20, 1986),
                new employee("rand", "paul", 2, 23, 1954));
        List<String>empname = emp.stream().map(u ->u.getFirstName()).collect(Collectors.toList());
        System.out.println(empname);
    }

    public void addNewEmployee(){

    }
}
