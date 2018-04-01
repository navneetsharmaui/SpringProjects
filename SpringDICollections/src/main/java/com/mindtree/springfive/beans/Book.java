/**
 * 
 */
package com.mindtree.springfive.beans;

/**
 * @author M1044357
 *
 */
public class Book {

	/**
	 * 
	 */
	private String isbn;
	private String bookName;
	private int price;
	private String publication;
	public Book() {
		// TODO Auto-generated constructor stub
		this.isbn = "310ND";
		this.bookName = "UnKnown";
		this.price = 300;
		this.publication = "Publication One";
	}
	/**
	 * @param isbn
	 * @param bookName
	 * @param price
	 * @param publication
	 */
	public Book(String isbn, String bookName, int price, String publication) {
		this.isbn = isbn;
		this.bookName = bookName;
		this.price = price;
		this.publication = publication;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the publication
	 */
	public String getPublication() {
		return publication;
	}
	/**
	 * @param publication the publication to set
	 */
	public void setPublication(String publication) {
		this.publication = publication;
	}
	
	@Override
	public String toString() {
		return bookName+" "+price+" "+isbn+" "+publication;
	}
	
	@Override
	public boolean equals(Object object) {
		Book book = (Book)object;
		
		return this.isbn.equals(book.getIsbn());
	}
	
	public int hashCode() {
		return bookName.length()/2;
	}
}
