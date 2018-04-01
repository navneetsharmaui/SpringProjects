/**
 * 
 */
package com.mindtree.springfive.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author M1044357
 *
 */
public class Demo_BeanPostProcessor implements BeanPostProcessor {

	/**
	 * 
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("initializing bean before init:- "+beanName);
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Initialzing bean after after init: "+beanName);
		return bean;
	}
}
