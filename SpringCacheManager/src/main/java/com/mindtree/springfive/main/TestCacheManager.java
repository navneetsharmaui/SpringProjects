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
public class TestCacheManager {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		BookDAO bookDAO = (BookDAO) applicationContext.getBean("bookSessionFactory");
		
		Book book = bookDAO.getBook(98564567L);
		System.out.println(book.getBookName()+" "+book.getAuthor());
		
		Book bookTwo = bookDAO.getBook(98564567L);
		System.out.println(bookTwo.getBookName()+" "+bookTwo.getAuthor());
	}
}
