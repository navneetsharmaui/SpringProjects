/**
 * 
 */
package com.mindtree.springfive.model;

import java.util.Set;

/**
 * @author M1044357
 *
 */
public class SetDepartments {
	private Set<Department> setDept;
	private Set<String> deptNames;
	/**
	 * 
	 */
	public SetDepartments() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param setDept
	 * @param deptNames
	 */
	public SetDepartments(Set<Department> setDept, Set<String> deptNames) {
		this.setDept = setDept;
		this.deptNames = deptNames;
	}
	/**
	 * @return the setDept
	 */
	public Set<Department> getSetDept() {
		return setDept;
	}
	/**
	 * @param setDept the setDept to set
	 */
	public void setSetDept(Set<Department> setDept) {
		this.setDept = setDept;
	}
	/**
	 * @return the deptNames
	 */
	public Set<String> getDeptNames() {
		return deptNames;
	}
	/**
	 * @param deptNames the deptNames to set
	 */
	public void setDeptNames(Set<String> deptNames) {
		this.deptNames = deptNames;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SetDepartments [setDept=" + setDept + ", deptNames=" + deptNames + "]";
	}
}
