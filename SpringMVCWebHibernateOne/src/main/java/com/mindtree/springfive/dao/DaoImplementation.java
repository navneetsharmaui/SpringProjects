/**
 * 
 */
package com.mindtree.springfive.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.springfive.entity.ProjectDetails;
import com.mindtree.springfive.entity.UserDetails;

/**
 * @author M1044357
 *
 */
@Repository
public class DaoImplementation {

	@Autowired
	protected SessionFactory sessionFactory;

	@Transactional
	public boolean addToDatabase(UserDetails user) {
		int c=0;
		System.out.println(sessionFactory);
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		c++;
		session.getTransaction().commit();
		session.close();
		if(c>0)
			return true;
		else return false;
		
	}
	
	@Transactional
	public boolean addProjectToDatabase(ProjectDetails project) {
		int c=0;
		System.out.println(sessionFactory);
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		session.save(project);
		c++;
		session.getTransaction().commit();
		session.close();
		if(c>0)
		return true;
		else return false;
	
	}
}
