/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author M1044357
 *
 */
public class TestFileSystemApplicationContext {
	/**
	 * @param args
	 */
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\workcodes\\eclipse\\spring\\springone\\beans_fileSystem.xml");
			System.out.println("Container created successfully.");
		} catch (BeansException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
