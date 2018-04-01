/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.beans.Demo_InitializingBean;

/**
 * @author M1044357
 *
 */
public class TestDemo_InitializingBean {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean_lifecycle.xml");
		Demo_InitializingBean objTwo = (Demo_InitializingBean) applicationContext.getBean("objTwo");
		System.out.println(objTwo);
	}

}
