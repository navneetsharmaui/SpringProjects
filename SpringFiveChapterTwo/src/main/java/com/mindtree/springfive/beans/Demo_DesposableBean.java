/**
 * 
 */
package com.mindtree.springfive.beans;

import org.springframework.beans.factory.DisposableBean;

/**
 * @author M1044357
 *
 */
public class Demo_DesposableBean implements DisposableBean {

	/**
	 * 
	 */
	private String message;
	private String name;
	public Demo_DesposableBean() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor get called for initializing data members in desposable bean.");
		message="Welcome!!";
		name="no name";
	}

	@Override
	public String toString() {
		return message+" "+name;
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy from disposable bean get called");
		name=null;
	}
}
