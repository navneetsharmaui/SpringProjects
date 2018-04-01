/**
 * 
 */
package com.mindtree.springfive.beans;

/**
 * @author M1044357
 *
 */
public class Address {

	/**
	 * 
	 */
	private String cityName;
	private int buildNo;
	private long pinCode;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param cityName
	 * @param buildNo
	 * @param pinCode
	 */
	public Address(String cityName, int buildNo, long pinCode) {
		this.cityName = cityName;
		this.buildNo = buildNo;
		this.pinCode = pinCode;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the buildNo
	 */
	public int getBuildNo() {
		return buildNo;
	}
	/**
	 * @param buildNo the buildNo to set
	 */
	public void setBuildNo(int buildNo) {
		this.buildNo = buildNo;
	}
	/**
	 * @return the pinCode
	 */
	public long getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", buildNo=" + buildNo + ", pinCode=" + pinCode + "]";
	}
	
}
