/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.beans.Car;

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
		ApplicationContext applicationContextOne = new ClassPathXmlApplicationContext("Beans.xml");
		Car car = (Car) applicationContextOne.getBean("objOne");
		car.show();
		
		Car carTwo = (Car) applicationContextOne.getBean("objOne");
		carTwo.show();
		
		System.out.println("After changing car one is: ");
		car.setColor("Olive green");
		car.setPrice(34000000);
		car.show();
		System.out.println("After changing car two is: ");
		carTwo.show();
	}

}
