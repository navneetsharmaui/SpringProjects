/**
 * 
 */
package com.mindtree.springfive.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindtree.springfive.beans.Book;

/**
 * @author M1044357
 *
 */
@Repository (value="bookSessionFactory")
public class BookDAOJDBCTemplateImpl implements BookDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		int rows=0;
		String insertBook = "insert into book values(default, ?, ?, ?, ?, ?, ?)";
		rows = jdbcTemplate.update(insertBook, book.getBookName(), book.getISBN(), book.getPrice(), book.getDescription(), book.getAuthor(), book.getPublication());
		return rows;
	}

	@Override
	public int update(long ISBN, int price) {
		// TODO Auto-generated method stub
		int rows=0;
		String updateBook = "update book set price=? where ISBN=?";
		rows=jdbcTemplate.update(updateBook, price, ISBN);
		return rows;
	}

	@Override
	public boolean deleteBook(long ISBN) {
		// TODO Auto-generated method stub
		int rows=0;
		boolean flag=false;
		String deleteBook = "delete from book where ISBN=?";
		rows=jdbcTemplate.update(deleteBook, ISBN);
		flag=rows>0?true:false;
		return flag;
	}

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		String findAll = "select * from book";
		List<Map<String, Object>> entries = jdbcTemplate.queryForList(findAll);
		for (Map<String, Object> m : entries) {
			Book book = new Book();
			book.setAuthor((String)m.get("author"));
			book.setBookName((String)m.get("bookName"));
			book.setISBN((Long)m.get("ISBN"));
			book.setDescription((String)m.get("description"));
			book.setPrice((int)m.get("price"));
			book.setPublication((String)m.get("publication"));
			books.add(book);
		}
		return books;
	}

	@Override
	public List<Book> findAllBooks(String author) {
		// TODO Auto-generated method stub
		System.out.println(author);
		String findAllAuthor= "select * from book where author=?";
		return jdbcTemplate.query(findAllAuthor, new String[] {author}, new RowMapper<Book>() {

			@Override
			public Book mapRow(ResultSet set, int rows) throws SQLException {
				// TODO Auto-generated method stub
				Book book = new Book();
				while (set.next()) {
					book.setAuthor(set.getString("author"));
					book.setBookName(set.getString("bookName"));
					book.setISBN(set.getLong("ISBN"));
					book.setDescription(set.getString("description"));
					book.setPrice(set.getInt("price"));
					book.setPublication(set.getString("publication"));
				}
				System.out.println(book.getISBN()+" "+book.getAuthor());
				return book;
			}
			
		});
	}
}
