/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.beans.CarJSR;

/**
 * @author M1044357
 *
 */
public class TestCar {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean_lifecycle.xml");
		CarJSR carJSR = (CarJSR) applicationContext.getBean("objSix");
		carJSR.show();
		((AbstractApplicationContext)applicationContext).registerShutdownHook();
	}

}
