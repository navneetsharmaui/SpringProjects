/**
 * 
 */
package com.mindtree.springfive.beans;

import java.util.Set;

/**
 * @author M1044357
 *
 */
public class LibrarySet {

	/**
	 * 
	 */
	private Set<Book> bookSet;
	public LibrarySet() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the bookSet
	 */
	public Set<Book> getBookSet() {
		return bookSet;
	}
	/**
	 * @param bookSet the bookSet to set
	 */
	public void setBookSet(Set<Book> bookSet) {
		this.bookSet = bookSet;
	}
	public void displayBooks() {
		bookSet.parallelStream().forEachOrdered(bk->System.out.println(bk.getBookName()+" "+bk.getPrice()+" "+bk.getPublication()+" "+bk.getIsbn()));
	}
}
