package com.coder.annot;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("annot.xml");
        context.registerShutdownHook();
        Employee employee = context.getBean("emp",Employee.class);
        System.out.println(employee);
    }
}
