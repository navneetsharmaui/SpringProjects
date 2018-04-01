/**
 * 
 */
package com.mindtree.springfive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mindtree.springfive.beans.Customer;

/**
 * @author M1044357
 *
 */
@Configuration
@ComponentScan(basePackages="com.mindtree.springfive.beans")
public class MyConfiguration {

	/**
	 * 
	 */	
	@Bean (name="myCustomer")
	public Customer myCustomer() {
		Customer customer = new Customer();
		customer.setCustomerID(1);
		customer.setCustomerName("Navneet Sharma");
		
		return customer;
	}
}
