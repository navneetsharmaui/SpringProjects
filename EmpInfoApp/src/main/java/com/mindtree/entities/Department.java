/**
 * 
 */
package com.mindtree.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author M1044357
 *
 */
@Entity
@Table(name="department")
public class Department {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="departmentNo", length=11, nullable=false)
	private int departmentNo;
	
	@Column(name="departmentName", length=255, nullable=false)
	private String departmentName;
	
	@OneToMany(mappedBy="department")
	private Set<Employee> employee;

	/**
	 * @return the departmentNo
	 */
	public int getDepartmentNo() {
		return departmentNo;
	}

	/**
	 * @param departmentNo the departmentNo to set
	 */
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the employee
	 */
	public Set<Employee> getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	
	
}
