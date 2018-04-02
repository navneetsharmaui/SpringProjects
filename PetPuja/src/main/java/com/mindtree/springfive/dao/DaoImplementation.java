/**
 * 
 */
package com.mindtree.springfive.dao;

import java.util.LinkedHashSet;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import com.mindtree.springfive.entity.OrderDetails;

/**
 * @author M1044357
 *
 */
@Repository(value="orderSessionFactory")
public class DaoImplementation {

	@Autowired
	protected SessionFactory sessionFactory;

	@Transactional
	public boolean addToDatabase(OrderDetails orderDetails) {
		int c=0;
		System.out.println(sessionFactory);
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		session.save(orderDetails);
		c++;
		session.getTransaction().commit();
		session.close();
		if(c>0)
			return true;
		else return false;
		
	}
	
	@Transactional
	public boolean deleteOrder(int oid) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			OrderDetails orderDetails = session.get(OrderDetails.class, oid);
			session.delete(orderDetails);
			transaction.commit();
			session.close();
			return true;
		} catch (DataAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	@Transactional
	public int findLatestOrderID() {

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		
	    CriteriaBuilder builder = session.getCriteriaBuilder();

	    CriteriaQuery<OrderDetails> criteriaOne = builder.createQuery(OrderDetails.class);

	    criteriaOne.from(OrderDetails.class);
	    
	    List<OrderDetails> listOne = session.createQuery(criteriaOne).getResultList();
	    int loid = listOne.get(listOne.size()-1).getOid();
		session.getTransaction().commit();
		session.close();
		return loid;
	}

	@Transactional
	public LinkedHashSet<OrderDetails> findOrderListByEmailID(String emailID) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
	    CriteriaBuilder builder = session.getCriteriaBuilder();

	    CriteriaQuery<OrderDetails> criteriaOne = builder.createQuery(OrderDetails.class);

	    criteriaOne.from(OrderDetails.class);
	    
	    List<OrderDetails> listOne = session.createQuery(criteriaOne).getResultList();
	    
	    LinkedHashSet<OrderDetails> orderDetailsList = new LinkedHashSet<OrderDetails>();
	    
	    listOne.parallelStream().forEach(ol->{
	    	if (ol.getEmail().equalsIgnoreCase(emailID)) {
	    		orderDetailsList.add(ol);
	    	}
	    });
		session.getTransaction().commit();
		session.close();
		return orderDetailsList;
	}
}
