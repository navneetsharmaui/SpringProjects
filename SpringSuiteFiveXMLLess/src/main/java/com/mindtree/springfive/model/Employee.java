/**
 * 
 */
package com.mindtree.springfive.model;

import java.util.Date;

/**
 * @author M1044357
 *
 */
public class Employee {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Integer age;
	private Double salary;
	private String position;
	private Department department;
	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("An Employee is created.");
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param age
	 * @param salary
	 * @param position
	 * @param department
	 */
	public Employee(String firstName, String lastName, Date birthDate, Integer age, Double salary, String position, Department department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.age = age;
		this.salary = salary;
		this.position = position;
		this.department = department;
		System.out.println("An Employee is created.");
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", age="
				+ age + ", salary=" + salary + ", position=" + position + ", department=" + department + "]";
	}
	
}
