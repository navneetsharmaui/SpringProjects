/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.contextaware.MyBean;

/**
 * @author M1044357
 *
 */
public class TestMyBean {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean_lifecycle.xml");
		
		MyBean objFour = (MyBean) applicationContext.getBean("objFour");
		objFour.display();
	}

}
