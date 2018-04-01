/**
 * 
 */
package com.mindtree.springfive.beans;

import java.util.List;

/**
 * @author M1044357
 *
 */
public class LibraryList {

	/**
	 * 
	 */
	private List<Book> bookList;
	public LibraryList() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the bookList
	 */
	public List<Book> getBookList() {
		return bookList;
	}
	/**
	 * @param bookList the bookList to set
	 */
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void displayBook() {
		bookList.parallelStream().forEachOrdered(bk->System.out.println(bk.getBookName()+" "+bk.getPublication()+" "+bk.getPrice()+" "+bk.getIsbn()));
	}
}
