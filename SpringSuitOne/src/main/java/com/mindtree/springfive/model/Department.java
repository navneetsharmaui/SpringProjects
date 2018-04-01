/**
 * 
 */
package com.mindtree.springfive.model;

/**
 * @author M1044357
 *
 */
public class Department {
	private Integer deptNo;
	private String deptName;
	/**
	 * 
	 */
	public Department() {
		// TODO Auto-generated constructor stub
		System.out.println("A Department is created.");
	}
	/**
	 * @param deptNo
	 * @param deptName
	 */
	public Department(Integer deptNo, String deptName) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		System.out.println("A Department is created.");
	}
	/**
	 * @return the deptNo
	 */
	public Integer getDeptNo() {
		return deptNo;
	}
	/**
	 * @param deptNo the deptNo to set
	 */
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}
}
