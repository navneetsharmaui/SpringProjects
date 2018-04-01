/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.beans.CarService;

/**
 * @author M1044357
 *
 */
public class TestCarService {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("instance.xml");
		CarService carService = (CarService) applicationContext.getBean("objThree");
		carService.serve();
	}

}
