package com.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("sterotype.xml");
        Employee employee = context.getBean("emp", Employee.class);
        System.out.println(employee);
    }
}
