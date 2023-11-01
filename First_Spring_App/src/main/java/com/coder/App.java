package com.coder;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Ram ram = context.getBean("ram",Ram.class);
        ram.eat();
        Shyam shyam = context.getBean("shyam",Shyam.class);
        shyam.sleep();

    }
}
