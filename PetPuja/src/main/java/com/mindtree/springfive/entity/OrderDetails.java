/**
 * 
 */
package com.mindtree.springfive.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author M1044357
 *
 */
@Entity
@Table
public class OrderDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, length=11)
	private int oid;
	
	@Column(nullable=false)
	private String userName;
	
	@Column(nullable=false)
	private String address;
	
	@Column(nullable=false)
	private String phonenumber;
	
	@Column(nullable=false)
	private String pin;
	
	@Column
	private String email;
	
	@Column
	private String ordertype;

	public OrderDetails() {
	}

	
	/**
	 * @param oid
	 * @param userName
	 * @param address
	 * @param phonenumber
	 * @param pin
	 * @param email
	 * @param ordertype
	 */
	public OrderDetails(String userName, String address, String phonenumber, String pin, String email,
			String ordertype) {
		this.userName = userName;
		this.address = address;
		this.phonenumber = phonenumber;
		this.pin = pin;
		this.email = email;
		this.ordertype = ordertype;
	}
	
	/**
	 * @return the oid
	 */
	public int getOid() {
		return oid;
	}


	/**
	 * @param oid the oid to set
	 */
	public void setOid(int oid) {
		this.oid = oid;
	}


	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}



	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}

	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the ordertype
	 */
	public String getOrdertype() {
		return ordertype;
	}

	/**
	 * @param ordertype the ordertype to set
	 */
	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderDetails [oid=" + oid + ", userName=" + userName + ", address=" + address + ", phonenumber="
				+ phonenumber + ", pin=" + pin + ", email=" + email + ", ordertype=" + ordertype + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
}