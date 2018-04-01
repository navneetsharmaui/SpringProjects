/**
 * 
 */
package com.mindtree.springfive.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.mindtree.springfive.beans.Book;

/**
 * @author M1044357
 *
 */
@Repository (value="daoSupport")
public class BookDAOJDBCTemplateSupport extends JdbcDaoSupport implements BookDAO {

	/**
	 * 
	 */
	@Autowired
	public BookDAOJDBCTemplateSupport(JdbcTemplate jdbcTemplate) {
		// TODO Auto-generated constructor stub
		setJdbcTemplate(jdbcTemplate);
	}
	
	
	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		int rows=0;
		String insertBook="insert into book values(default, ?, ?, ?, ?, ?, ?)";
		rows=getJdbcTemplate().update(insertBook, book.getBookName(), book.getISBN(), book.getPrice(), book.getDescription(), book.getAuthor(), book.getPublication());
		return rows;
	}


	@Override
	public int update(long ISBN, int price) {
		// TODO Auto-generated method stub
		int rows=0;
		String updateBook="update book set price=? where ISBN=?";
		rows=getJdbcTemplate().update(updateBook, price, ISBN);
		return rows;
	}

	@Override
	public boolean deleteBook(long ISBN) {
		// TODO Auto-generated method stub
		int rows=0;
		boolean bool=false;
		String deleteBook="delete from book where ISBN=?";
		rows=getJdbcTemplate().update(deleteBook, ISBN);
		bool=rows>0?true:false;
		return bool;
	}

}
