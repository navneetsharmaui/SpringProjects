/**
 * 
 */
package com.mindtree.springfive.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.PermissionDeniedDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindtree.springfive.beans.Book;

/**
 * @author M1044357
 *
 */
@Repository (value="namedParameterOne")
public class BookDAONamedParameterJDBCTemplate implements BookDAO{
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@SuppressWarnings("unused")
	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		int rows=0;
		String insertBook = "insert into book values(default, :bookName, :ISBN, :price, :description, :author, :publication)";
		Map<String, Object> params = new HashMap<>();
		params.put("bookName", book.getBookName());
		params.put("ISBN", book.getISBN());
		params.put("price", book.getPrice());
		params.put("description", book.getDescription());
		params.put("author", book.getAuthor());
		params.put("publication", book.getPublication());
		rows=namedParameterJdbcTemplate.update(insertBook, params);
		PermissionDeniedDataAccessException accessException;
		return rows;
	}

	@Override
	public int update(long ISBN, int price) {
		// TODO Auto-generated method stub
		int rows=0;
		String updateBook = "update book set price=:price where ISBN=:ISBN";
		Map<String, Object> params = new HashMap<>();
		params.put("ISBN", ISBN);
		params.put("price", price);
		rows=namedParameterJdbcTemplate.update(updateBook, params);
		return rows;
	}

	@Override
	public boolean deleteBook(long ISBN) {
		// TODO Auto-generated method stub
		int rows=0;
		boolean bool = false;
		String deleteBook = "delete from book where ISBN=:ISBN";
		Map<String, Object> params = new HashMap<>();
		params.put("ISBN", ISBN);
		rows=namedParameterJdbcTemplate.update(deleteBook, params);
		bool=rows>0?true:false;
		return bool;
	}
	
	 
}
