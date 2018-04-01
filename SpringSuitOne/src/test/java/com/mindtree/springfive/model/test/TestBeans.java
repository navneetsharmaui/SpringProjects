/**
 * 
 */
package com.mindtree.springfive.model.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.model.Department;
import com.mindtree.springfive.model.Employee;

/**
 * @author M1044357
 *
 */
public class TestBeans {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("Application context loaded.");
		System.out.println("**** The Employee Object One empRec1****");
		Employee empRec1 = (Employee)applicationContext.getBean("empRec1");
		System.out.println(empRec1);
		System.out.println("**** The Employee Object Two empRec2****");
		Employee empRec2 = (Employee)applicationContext.getBean("empRec2");
		Department dept2 = empRec2.getDepartment();
		System.out.println("First Name: "+ empRec2.getFirstName());
		System.out.println("Last Name: "+ empRec2.getLastName());
		System.out.println("Birthdate: "+ empRec2.getBirthDate());
		System.out.println("Age: "+ empRec2.getAge());
		System.out.println("Salary: "+ empRec2.getSalary());
		System.out.println("Position: "+ empRec2.getPosition());
		System.out.println("Department Name: "+ dept2.getDeptName());
		
		Employee empRec5 = (Employee)applicationContext.getBean("empRec5", Employee.class);
		Department dept3 = empRec5.getDepartment();
		System.out.println("First Name: "+ empRec5.getFirstName());
		System.out.println("Last Name: "+ empRec5.getLastName());
		System.out.println("Birthdate: "+ empRec5.getBirthDate());
		System.out.println("Age: "+ empRec5.getAge());
		System.out.println("Salary: "+ empRec5.getSalary());
		System.out.println("Position: "+ empRec5.getPosition());
		System.out.println("Department Name: "+ dept3.getDeptName());
		
	}

}
