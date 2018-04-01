/**
 * 
 */
package com.mindtree.springfive.beans;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author M1044357
 *
 */
public class Demo_InitializingBean implements InitializingBean {

	/**
	 * 
	 */
	private String name;
	private String message;
	public Demo_InitializingBean() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor get for initialzing bean in demo initialzing bean.");
		message="Welcome!!!";
		name="no name";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message+" "+name;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		name="Mr."+name.toUpperCase();
		System.out.println("after propertiesSet got called");

	}
}
