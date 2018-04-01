/**
 * 
 */
package com.mindtree.springfive.stereotype.annotations;

import org.springframework.stereotype.Component;

import com.mindtree.springfive.beans.Address;

/**
 * @author M1044357
 *
 */
@Component (value="customerComponent")
public class CustomerComponent {

	/**
	 * 
	 */
	private String customerName;
	private int customerID;
	private Address customerAddress;
	public CustomerComponent() {
		// TODO Auto-generated constructor stub
		customerName="CustomerName";
		customerID=100;
		customerAddress=new Address();
		customerAddress.setCityName("Delhi");
		customerAddress.setBuildNo(2);
		customerAddress.setPinCode(000001);
	}
	
	/**
	 * @param customerName
	 * @param customerID
	 * @param customerAddress
	 */
	public CustomerComponent(String customerName, int customerID, Address customerAddress) {
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
