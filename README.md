# Spring-Framework
It was developed by Rod Johnson in 2003. 

Spring is a dependency injection Framework is to make Loosely Coupled Application.

Spring Framework makes the easy development fo JavaEE Application.

## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`JAVA IN YOUR SYSTEM`

`ANY IDE LIKE STS OR intellij idea`

## 🔗 Links
Add these two dependency in your project(pom.xml). These two dependency must have same version

[[Spring Core]](https://mvnrepository.com/artifact/org.springframework/spring-core)

[[Spring Context]](https://mvnrepository.com/artifact/org.springframework/spring-context)


## FAQ

#### 1. What is IOC container?

The IOC container is responsible to instantiate, configure and assemble the objects.
The IOC container gets information from the XML file and works accordingly. The main tasks performed by IOC container are:

to instantiate the application class

to configure the object

to assemble the dependencies between the objects

There are Two types of IOC container. They are:

1- BeanFactory
2- Application Context


#### 2. What is Dependency Injection?

Dependency Injection (DI) is a design pattern that removes the dependency from the programming. DI makes our programming code loosely coupled


#### 3. Types of Dependency Injection?

There are two types of dependencies Injection
     
     a> Setter Injection
     b> Constructor Injection

#### 4. What are the Data types of Injection?

Primitive type - byte, long, short, char, int, double

Collection type - list, set, map

Reference type - object

## Spring Bean Life Cycle

The lifecycle of any object means when & how it is born, how it behaves throughout its life, and when & how it dies. Similarly, the bean life cycle refers to when & how the bean is instantiated, what action it performs until it lives, and when & how it is destroyed. In this article, we will discuss the life cycle of the bean. 

Bean life cycle is managed by the spring container. When we run the program then, first of all, the spring container gets started. After that, the container creates the instance of a bean as per the request, and then dependencies are injected. And finally, the bean is destroyed when the spring container is closed. Therefore, if we want to execute some code on the bean instantiation and just after closing the spring container, then we can write that code inside the custom init() method and the destroy() method.

### Screenshots

![App Screenshot](https://media.geeksforgeeks.org/wp-content/uploads/20200428011831/Bean-Life-Cycle-Process-flow3.png)

### Ways to implement the life cycle of a bean
 
    1. XML Based 
    2. Implement InitializingBean and DisposableBean
    3. Using annotation Based

