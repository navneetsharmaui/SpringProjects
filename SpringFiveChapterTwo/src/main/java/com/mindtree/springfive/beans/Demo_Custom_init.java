/**
 * 
 */
package com.mindtree.springfive.beans;

/**
 * @author M1044357
 *
 */
public class Demo_Custom_init {

	/**
	 * 
	 */
	private String message;
	private String name;
	public Demo_Custom_init() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor get called for initializing data members in custom init.");
		message="Welcome!!!";
		name="no name";
	}
	
	@Override
	public String toString() {
		return message+" "+name;
	}
	
	public void myInit() {
		name=name.toUpperCase();
		System.out.println("myInit() get called.");
	}
	
	public void destroy() {
		name=null;
		System.out.println("Destroy is here, run for your life.");
	}
}
