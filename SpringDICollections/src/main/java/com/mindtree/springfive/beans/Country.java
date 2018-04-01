/**
 * 
 */
package com.mindtree.springfive.beans;

import java.util.Properties;

/**
 * @author M1044357
 *
 */
public class Country {

	/**
	 * 
	 */
	private String countryName;
	private String continent;
	private Properties stateCapitals;
	public Country() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}
	/**
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}
	/**
	 * @return the stateCapitals
	 */
	public Properties getStateCapitals() {
		return stateCapitals;
	}
	/**
	 * @param stateCapitals the stateCapitals to set
	 */
	public void setStateCapitals(Properties stateCapitals) {
		this.stateCapitals = stateCapitals;
	}
	public void printCapitals() {
		stateCapitals.stringPropertyNames().parallelStream().forEachOrdered(st->System.err.println(st+" "+stateCapitals.getProperty(st)));
	}
}
