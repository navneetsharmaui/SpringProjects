package com.mindtree.springfive.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
    	HelloWorld objOne = (HelloWorld) applicationContext.getBean("helloBean");
    	//objOne.setMessage("This is bean One.");
    	System.out.println(objOne.getMessage());
    	applicationContext.registerShutdownHook();
    }
}
