/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author M1044357
 *
 */
public class TestClasspathApplicationContext {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_classpath.xml");
			ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext(new String[] {"beans_classpath.xml", "beans_classpathone.xml"});
			System.out.println("Container created successfully.");
		} catch (BeansException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
