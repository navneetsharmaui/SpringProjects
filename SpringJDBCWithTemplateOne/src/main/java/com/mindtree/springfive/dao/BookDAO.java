/**
 * 
 */
package com.mindtree.springfive.dao;

import com.mindtree.springfive.beans.Book;

/**
 * @author M1044357
 *
 */
public interface BookDAO {
	public int addBook(Book book);
	public int update(long ISBN, int price);
	public boolean deleteBook(long ISBN);
}
