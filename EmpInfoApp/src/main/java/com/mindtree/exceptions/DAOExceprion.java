/**
 * 
 */
package com.mindtree.exceptions;

/**
 * @author M1044357
 *
 */
public class DAOExceprion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5386002413711870766L;

	/**
	 * 
	 */
	private String message;
	public DAOExceprion(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	
	public String toString() {
		return ("Invalid : "+message);
	}
}
