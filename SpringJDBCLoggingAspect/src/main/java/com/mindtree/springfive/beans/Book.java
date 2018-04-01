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
	 * @param bookName
	 * @param iSBN
	 * @param publication
	 * @param price
	 * @param description
	 * @param author
	 */
	private String bookName;
	private long ISBN;
	private String publication;
	private int price;
	private String description;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
		this.bookName = "Final Empire";
		this.ISBN = 98564587L;
		this.publication = "Harper Collins";
		this.price = 400;
		this.description = "This is fatnasy fiction book";
		this.author = "Brandon Sanderson";
	}

	/**
	 * @param bookName
	 * @param iSBN
	 * @param publication
	 * @param price
	 * @param description
	 * @param author
	 */
	public Book(String bookName, long ISBN, String publication, int price, String description, String author) {
		this.bookName = bookName;
		this.ISBN = ISBN;
		this.publication = publication;
		this.price = price;
		this.description = description;
		this.author = author;
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
	 * @return the iSBN
	 */
	public long getISBN() {
		return ISBN;
	}

	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(long iSBN) {
		ISBN = iSBN;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", ISBN=" + ISBN + ", publication=" + publication + ", price=" + price
				+ ", description=" + description + ", author=" + author + "]";
	}
	
}
