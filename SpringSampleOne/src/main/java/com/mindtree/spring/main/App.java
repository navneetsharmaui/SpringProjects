package com.mindtree.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A.");
        System.out.println("Object A message: "+objA.getMessage());
        
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        System.out.println("Object B message: "+objB.getMessage());
    }
}
