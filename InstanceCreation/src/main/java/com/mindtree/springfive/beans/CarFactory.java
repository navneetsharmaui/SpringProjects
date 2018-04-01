/**
 * 
 */
package com.mindtree.springfive.beans;

/**
 * @author M1044357
 *
 */
public class CarFactory {

	/**
	 * 
	 */
	private static Car car = new Car();
	public Car buildCar() {
		// TODO Auto-generated constructor stub
		System.out.println("Building the car.");
		return car;
	}

}
