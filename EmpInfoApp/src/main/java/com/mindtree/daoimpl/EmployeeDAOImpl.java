/**
 * 
 */
package com.mindtree.daoimpl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mindtree.entities.Department;
import com.mindtree.entities.Employee;
import com.mindtree.util.HibernateUtil;

/**
 * @author M1044357
 *
 */
public class EmployeeDAOImpl {
	
	final static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Department department = new Department();
	Scanner in = new Scanner(System.in);
	public int addEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<Employee> criteriaQueryEmployee = builder.createQuery(Employee.class);
		
		criteriaQueryEmployee.from(Employee.class);
		
		@SuppressWarnings("unused")
		List<Employee> listOfEmployeData = session.createQuery(criteriaQueryEmployee).getResultList();
		System.out.println("Enter the Employee Name: ");
		String employeeName = in.nextLine();
		System.out.println("Enter the Employee email: ");
		String email = in.nextLine();
		System.out.println("Enter the DOB: ");
		String DOB = in.nextLine();
	    DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
	    Date dateOfBirth=null;
		try {
			dateOfBirth = date.parse(DOB);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the salary: ");
		double salary = Double.parseDouble(in.nextLine());
		
		/*System.out.println("Enter the department no: ");
		int departmentNo = Integer.parseInt(in.nextLine());*/
		department.setDepartmentName("CS");
		session.save(department);
		employee.setEmployeeName(employeeName);
		employee.setEmail(email);
		employee.setDateOfBirth(dateOfBirth);
		employee.setSalary(salary);
		employee.setDepartment(department);
		session.save(employee);
		session.getTransaction().commit();
		sessionFactory.close();
		return 1;
	}
	
	public Employee getEmployee(int employeeNo) {
		
		return null;
	}
	
	public void deleteEmployee(int employeeNo) {
		
	}
	
	public void updateEmployee(Employee employee) {
		
	}
}
