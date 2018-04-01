/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.autowiring.annotations.CustomerAutowire;

/**
 * @author M1044357
 *
 */
public class TestCustomerAutowire {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		CustomerAutowire cuAutowire = (CustomerAutowire) applicationContext.getBean("customerAutowire");
		System.out.println(cuAutowire.getCustomerID()+" "+cuAutowire.getCustomerName()+" "+cuAutowire.getCustomerAddress());
	}

}
