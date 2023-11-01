package com.di.spring;


import com.di.spring.constdi.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        //Primitive Type DI
//        ApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
//        Student st=context.getBean("st1", Student.class);
//        System.out.println(st);

        //Collection Type DI
//        ApplicationContext context=new ClassPathXmlApplicationContext("collection.xml");
//        Student st=context.getBean("st1",Student.class);
//        System.out.println(st);

        //Reference Type DI
//        ApplicationContext context=new ClassPathXmlApplicationContext("refdi.xml");
//        Student st=context.getBean("st",Student.class);
//        System.out.println(st.getName());
//        System.out.println(st.getAddress().getCity());

        //Constructor Injection
        ApplicationContext context=new ClassPathXmlApplicationContext("constdi.xml");
        Student st=context.getBean("student",Student.class);
        System.out.println(st);

    }
}
