/**
 * 
 */
package com.mindtree.springfive.beans;

/**
 * @author M1044357
 *
 */
public class CustomerReference {

	/**
	 * 
	 */
	private String customerName;
	private int customerId;
	private Address customerAddress;
	public CustomerReference() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param customerName
	 * @param customerId
	 * @param customerAddress
	 */
	public CustomerReference(String customerName, int customerId, Address customerAddress) {
		this.customerName = customerName;
		this.customerId = customerId;
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
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerReference [customerName=" + customerName + ", customerId=" + customerId + ", customerAddress="
				+ customerAddress + "]";
	}
	
}
