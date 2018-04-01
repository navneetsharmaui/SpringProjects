/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindtree.springfive.beans.Customer;
import com.mindtree.springfive.config.MyConfiguration;

/**
 * @author M1044357
 *
 */
public class TestConfiguration {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Customer customer = (Customer) applicationContext.getBean("myCustomer");
		System.out.println(customer.getCustomerID()+" "+customer.getCustomerName()+" "+customer.getCustomerAddress());
	}

}
