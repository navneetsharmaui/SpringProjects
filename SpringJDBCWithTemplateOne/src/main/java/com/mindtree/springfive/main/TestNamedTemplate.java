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
public class TestNamedTemplate {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		BookDAO bookDAO = (BookDAO) applicationContext.getBean("namedParameterOne");
		
		int rows=0;
		rows=bookDAO.addBook(new Book());
		if (rows>0) System.out.println("book inserted successfully.");
		else System.out.println("SORRY! cannot add book");
		
		rows = bookDAO.update(98564567l, 456);

		if (rows>0) System.out.println("Book Updated successfully.");
		else System.out.println("SORRY! cannot update book.");
		
		boolean delete = bookDAO.deleteBook(98564567l);

		if (delete) System.out.println("Book Delete successfully.");
		else System.out.println("SORRY! cannot delete book.");
	}

}
