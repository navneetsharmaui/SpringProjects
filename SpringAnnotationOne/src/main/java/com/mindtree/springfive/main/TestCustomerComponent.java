/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.stereotype.annotations.CustomerComponent;

/**
 * @author M1044357
 *
 */
public class TestCustomerComponent {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		CustomerComponent component= (CustomerComponent) applicationContext.getBean("customerComponent");
		System.out.println(component.getCustomerID()+" "+component.getCustomerName()+" "+component.getCustomerAddress().getCityName());
	}

}
