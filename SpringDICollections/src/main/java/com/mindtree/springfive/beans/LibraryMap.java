/**
 * 
 */
package com.mindtree.springfive.beans;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author M1044357
 *
 */
public class LibraryMap {

	/**
	 * 
	 */
	private Map<String, Book> bookMap;
	public LibraryMap() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the bookMap
	 */
	public Map<String, Book> getBookMap() {
		return bookMap;
	}
	/**
	 * @param bookMap the bookMap to set
	 */
	public void setBookMap(Map<String, Book> bookMap) {
		this.bookMap = bookMap;
	}
	
	public void displayBook() {
		Set<Entry<String, Book>> bookSet = bookMap.entrySet();
		bookSet.parallelStream().forEachOrdered(bk->System.out.println(bk.getValue().getBookName()+" "+bk.getValue().getPublication()+" "+bk.getValue().getPrice()+" "+bk.getValue().getIsbn()));
	}
}
