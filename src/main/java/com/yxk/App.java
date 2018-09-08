package com.yxk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");

        IyxkHello iyxkHello = (IyxkHello) context.getBean("yxkHelloService");

        System.out.println(iyxkHello.sayHello("yxk"));


    }
}
