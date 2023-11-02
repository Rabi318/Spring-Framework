package com.coder.xml;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");  //AbstractApplicationContext for destroy method
        context.registerShutdownHook();   //enabled for destroy method
        Student student = context.getBean("st",Student.class);
        System.out.println(student);
    }
}
