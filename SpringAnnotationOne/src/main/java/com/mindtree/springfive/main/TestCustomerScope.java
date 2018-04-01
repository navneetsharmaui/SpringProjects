/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.scope.annotations.CustomerScope;

/**
 * @author M1044357
 *
 */
public class TestCustomerScope {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		CustomerScope cuScope = (CustomerScope) applicationContext.getBean("customerScope");
		System.out.println(cuScope.getCustomerName()+" "+cuScope.getCustomerID()+" "+cuScope.getCustomerAddress());
		cuScope.setCustomerName("New Name");
		CustomerScope cuScopeTwo = (CustomerScope) applicationContext.getBean("customerScope");
		System.out.println(cuScopeTwo.getCustomerName()+" "+cuScopeTwo.getCustomerID()+" "+cuScopeTwo.getCustomerAddress());
		System.out.println("after changing name and using prototypescope");
		System.out.println(cuScope.getCustomerName()+" "+cuScope.getCustomerID()+" "+cuScope.getCustomerAddress());
		System.out.println(cuScopeTwo.getCustomerName()+" "+cuScopeTwo.getCustomerID()+" "+cuScopeTwo.getCustomerAddress());
		
	}

}
