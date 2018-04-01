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
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		BookDAO bookDAO = (BookDAO) applicationContext.getBean("bookSessionFactory");
		int rows=0;
		rows= bookDAO.addBook(new Book());
		System.out.println(rows>0?"book inserted successfully":"SORRY! cannot add book");
		rows= bookDAO.update(98564587L, 789);
		System.out.println(rows>0?"book updated successfully":"SORRY! cannot update book");
		boolean bool = bookDAO.deleteBook(98564567L);
		System.out.println(bool?"book deleted successfully":"SORRY! cannot deleted book");
	}
}
