/**
 * 
 */
package com.mindtree.springfive.main;

/**
 * @author M1044357
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	private String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Bean is going through init.");
	}
	
	public void destroy() {
		System.out.println("Bean will destroy you and everything in its way.");
	}
}
