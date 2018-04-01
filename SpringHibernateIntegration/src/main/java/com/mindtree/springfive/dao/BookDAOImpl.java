/**
 * 
 */
package com.mindtree.springfive.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.mindtree.springfive.beans.Book;

/**
 * @author M1044357
 *
 */
@Repository (value="bookSessionFactory")
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(book);
			transaction.commit();
			session.close();
			return 1;
		} catch (DataAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(int bookId, int price) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			Book book = session.get(Book.class, bookId);
			book.setPrice(price);
			session.saveOrUpdate(book);
			transaction.commit();
			session.close();
			return 1;
		} catch (DataAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean deleteBook(int bookId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			Book book = session.get(Book.class, bookId);
			session.delete(book);
			transaction.commit();
			session.close();
			return true;
		} catch (DataAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

}
