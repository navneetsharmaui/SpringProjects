/**
 * 
 */
package com.mindtree.springfive.beans;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author M1044357
 *
 */
@Named (value="customer")
public class Customer {

	/**
	 * 
	 */
	private String customerName;
	private int customerID;
	
	@Inject
	private Address customerAddress;
	public Customer() {
		// TODO Auto-generated constructor stub
		customerName="Navneet Sharma";
		customerID=1;
	}
	
	/**
	 * @param customerName
	 * @param customerID
	 * @param customerAddress
	 */
	public Customer(String customerName, int customerID, Address customerAddress) {
		this.customerName = customerName;
		this.customerID = customerID;
		this.customerAddress = customerAddress;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the customerAddress
	 */
	public Address getCustomerAddress() {
		return customerAddress;
	}
	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	@Override
	public String toString() {
		return this.customerName+" "+this.customerAddress.getCityName()+" "+this.customerAddress.getPinCode();
	}
	
	public void show() {
		System.out.println(customerID+" "+customerName+" "+customerAddress.getCityName()+" "+customerAddress.getPinCode());
	}
}
