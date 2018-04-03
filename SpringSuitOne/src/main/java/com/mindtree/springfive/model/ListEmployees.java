/**
 * 
 */
package com.mindtree.springfive.model;

import java.util.List;

/**
 * @author M1044357
 *
 */
public class ListEmployees {
	private List<Employee> listEmps;
	private List<String> listEmpNames;
	/**
	 * 
	 */
	public ListEmployees() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param listEmps
	 * @param listEmpNames
	 */
	public ListEmployees(List<Employee> listEmps, List<String> listEmpNames) {
		this.listEmps = listEmps;
		this.listEmpNames = listEmpNames;
	}
	/**
	 * @return the listEmps
	 */
	public List<Employee> getListEmps() {
		return listEmps;
	}
	/**
	 * @param listEmps the listEmps to set
	 */
	public void setListEmps(List<Employee> listEmps) {
		this.listEmps = listEmps;
	}
	/**
	 * @return the listEmpNames
	 */
	public List<String> getListEmpNames() {
		return listEmpNames;
	}
	/**
	 * @param listEmpNames the listEmpNames to set
	 */
	public void setListEmpNames(List<String> listEmpNames) {
		this.listEmpNames = listEmpNames;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListEmployees [listEmps=" + listEmps + ", listEmpNames=" + listEmpNames + "]";
	}
}
