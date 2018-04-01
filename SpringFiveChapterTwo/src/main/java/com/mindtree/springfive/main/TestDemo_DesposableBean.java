/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.beans.Demo_DesposableBean;

/**
 * @author M1044357
 *
 */
public class TestDemo_DesposableBean {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean_lifecycle.xml");
		Demo_DesposableBean objThree = (Demo_DesposableBean) applicationContext.getBean("objThree");
		
		System.out.println(objThree);
		((AbstractApplicationContext)applicationContext).registerShutdownHook();
	}

}
