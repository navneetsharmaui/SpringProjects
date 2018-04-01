/**
 * 
 */
package com.mindtree.springfive.dao;

import java.util.List;

import com.mindtree.springfive.beans.Book;

/**
 * @author M1044357
 *
 */
public interface BookDAO {
	public int addBook(Book book);
	public int update(long ISBN, int price);
	public boolean deleteBook(long ISBN);
	public List<Book> findAllBooks();
	public List<Book> findAllBooks(String author);
}
