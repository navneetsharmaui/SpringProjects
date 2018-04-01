/**
 * 
 */
package com.mindtree.springfive.beans;

/**
 * @author M1044357
 *
 */
public class Customer {

	/**
	 * 
	 */
	private String customerName;
	private String customerId;
	private boolean secondHand;
	private double prodPrice;
	private String prodName;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param customerName
	 * @param customerId
	 * @param secondHand
	 * @param prodPrice
	 * @param prodName
	 */
	public Customer(String customerName, String customerId, boolean secondHand, double prodPrice, String prodName) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.secondHand = secondHand;
		this.prodPrice = prodPrice;
		this.prodName = prodName;
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
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the secondHand
	 */
	public boolean isSecondHand() {
		return secondHand;
	}
	/**
	 * @param secondHand the secondHand to set
	 */
	public void setSecondHand(boolean secondHand) {
		this.secondHand = secondHand;
	}
	/**
	 * @return the prodPrice
	 */
	public double getProdPrice() {
		return prodPrice;
	}
	/**
	 * @param prodPrice the prodPrice to set
	 */
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	/**
	 * @return the prodName
	 */
	public String getProdName() {
		return prodName;
	}
	/**
	 * @param prodName the prodName to set
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", secondHand=" + secondHand
				+ ", prodPrice=" + prodPrice + ", prodName=" + prodName + "]";
	}
	
	
}
