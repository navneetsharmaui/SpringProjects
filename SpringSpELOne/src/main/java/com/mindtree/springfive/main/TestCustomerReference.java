/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.beans.CustomerReference;

/**
 * @author M1044357
 *
 */
public class TestCustomerReference {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		CustomerReference cuReference = (CustomerReference) applicationContext.getBean("objFour");
		System.out.println(cuReference);
	}

}
