/**
 * 
 */
package com.mindtree.springfive.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.springfive.beans.Book;

/**
 * @author M1044357
 *
 */

@Repository (value="bookDAOAnnot")
public class BookDAOAnnotaionImpl implements BookDAO {
	
	@Autowired
	private DataSource dataSource;
	
	/**
	 * @param dataSource the dataSource to set
	 */
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int addBook(Book book) {
		// TODO Auto-generated method stub
		int rows=0;
		String inserBook = "insert into book values (default, ?, ?, ?, ?, ?, ?)";
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(inserBook);
			preparedStatement.setString(1, book.getBookName());
			preparedStatement.setLong(2, book.getISBN());
			preparedStatement.setInt(3, book.getPrice());
			preparedStatement.setString(4, book.getDescription());
			preparedStatement.setString(5, book.getAuthor());
			preparedStatement.setString(6, book.getPublication());
			rows=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rows;
	}

	public int update(long ISBN, int price) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean deleteBook(long ISBN) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> findAllBooks(String author) {
		// TODO Auto-generated method stub
		return null;
	}
}
