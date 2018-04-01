package com.mindtree.springfive.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * 
 *
 */
@SuppressWarnings("deprecation")
public class App {
    @SuppressWarnings({ "unused"})
	public static void main( String[] args ) {
    	BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans_classpath.xml"));
		BeanFactory beanFactoryOne = new XmlBeanFactory(new FileSystemResource("D:\\workcodes\\eclipse\\spring\\springone\\beans_fileSystem.xml"));
    	System.out.println("Bean factory created successfully");
    }
}
