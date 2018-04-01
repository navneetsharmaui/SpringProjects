/**
 * 
 */
package com.mindtree.springfive.model.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindtree.springfive.context.BeanConfig;
import com.mindtree.springfive.model.Employee;

/**
 * @author M1044357
 *
 */
public class TestScopes {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(BeanConfig.class);
		System.out.println("Application context loaded.");
		applicationContext.refresh();
		System.out.println("*******The empRec1 bean*******");
		Employee empRec1A = (Employee) applicationContext.getBean("empRec1");
		System.out.println("instance A: "+empRec1A.hashCode());
		Employee empRec1B = (Employee) applicationContext.getBean("empRec1");
		System.out.println("instance B: "+empRec1B.hashCode());
		
		System.out.println("*******The empRec2 bean*******");
		Employee empRec2A = (Employee) applicationContext.getBean("empRec2");
		System.out.println("Instance 2A: "+empRec2A.hashCode());
		Employee empRec2B = (Employee) applicationContext.getBean("empRec2");
		System.out.println("Instance 2B: "+empRec2B.hashCode());
		applicationContext.registerShutdownHook();
	}

}
