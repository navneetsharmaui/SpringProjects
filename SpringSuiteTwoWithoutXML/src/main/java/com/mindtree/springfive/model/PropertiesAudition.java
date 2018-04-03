/**
 * 
 */
package com.mindtree.springfive.model;

import java.util.Properties;

/**
 * @author M1044357
 *
 */
public class PropertiesAudition {
	private Properties auditionAddress;
	private Properties auditionRequirement;
	/**
	 * 
	 */
	public PropertiesAudition() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param auditionAddress
	 * @param auditionRequirement
	 */
	public PropertiesAudition(Properties auditionAddress, Properties auditionRequirement) {
		this.auditionAddress = auditionAddress;
		this.auditionRequirement = auditionRequirement;
	}
	/**
	 * @return the auditionAddress
	 */
	public Properties getAuditionAddress() {
		return auditionAddress;
	}
	/**
	 * @param auditionAddress the auditionAddress to set
	 */
	public void setAuditionAddress(Properties auditionAddress) {
		this.auditionAddress = auditionAddress;
	}
	/**
	 * @return the auditionRequirement
	 */
	public Properties getAuditionRequirement() {
		return auditionRequirement;
	}
	/**
	 * @param auditionRequirement the auditionRequirement to set
	 */
	public void setAuditionRequirement(Properties auditionRequirement) {
		this.auditionRequirement = auditionRequirement;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PropertiesAudition [auditionAddress=" + auditionAddress + ", auditionRequirement=" + auditionRequirement
				+ "]";
	}
}
