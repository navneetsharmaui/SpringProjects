/**
 * 
 */
package com.mindtree.springfive.beans;

/**
 * @author M1044357
 *
 */
public class CarService {

	/**
	 * 
	 */
	private static CarService carService = new CarService();
	private CarService() {
		// TODO Auto-generated constructor stub
	}
	
	public static CarService createService() {
		return carService;
	}
	
	public void serve() {
		System.out.println("Car Service.");
	}

}
