/**
 * 
 */
package com.mindtree.springfive.beans;

/**
 * @author M1044357
 *
 */
public class EnggStudent extends Student{

	/**
	 * 
	 */
	private String 	branchCode;
	private String collegeCode;
	public EnggStudent() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the branchCode
	 */
	public String getBranchCode() {
		return branchCode;
	}
	/**
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	/**
	 * @return the collegeCode
	 */
	public String getCollegeCode() {
		return collegeCode;
	}
	/**
	 * @param collegeCode the collegeCode to set
	 */
	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}
	
}
