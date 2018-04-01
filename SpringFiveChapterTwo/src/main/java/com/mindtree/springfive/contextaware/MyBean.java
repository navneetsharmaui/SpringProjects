/**
 * 
 */
package com.mindtree.springfive.contextaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.mindtree.springfive.beans.Demo_InitializingBean;

/**
 * @author M1044357
 *
 */
public class MyBean implements ApplicationContextAware {

	private ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("context set");
		this.context=ctx;

	}	
	public void display() {
		System.out.println((Demo_InitializingBean)context.getBean("objTwo"));
	}
}
