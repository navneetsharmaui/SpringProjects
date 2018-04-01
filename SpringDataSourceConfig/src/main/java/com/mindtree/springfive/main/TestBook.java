/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.beans.Book;
import com.mindtree.springfive.dao.BookDAO;

/**
 * @author M1044357
 *
 */
public class TestBook {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		BookDAO bookDAO=(BookDAO) context.getBean("bookDao");
		int rows=bookDAO.addBook(new Book());
	    if(rows>0) {
	    	System.out.println("book inserted successfully");
	    } else {
	    	System.out.println("SORRY!cannot add book");
	    }
	}
}
