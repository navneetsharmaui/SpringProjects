package com.mindtree.springfive.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CarJSR {

	/**
	 * 
	 */
	private String chesis_number, color, fuel_type;
	private long price;
	private double average;
	public CarJSR() {
		// TODO Auto-generated constructor stub
		chesis_number = "eng00";
		color="navy blue";
		fuel_type="diesel";
		price=570000l;
		average = 12d;
	}
	
	
	
	/**
	 * @param chesis_number
	 * @param color
	 * @param fuel_type
	 * @param price
	 * @param average
	 */
	public CarJSR(String chesis_number, String color, String fuel_type, long price, double average) {
		this.chesis_number = chesis_number;
		this.color = color;
		this.fuel_type = fuel_type;
		this.price = price;
		this.average = average;
	}



	public void show() {
		System.out.println("Showing car: "+chesis_number+" color: "+color+" fuel type: "+fuel_type+" price:  "+price+" average: "+average);
	}

	/**
	 * @return the chesis_number
	 */
	public String getChesis_number() {
		return chesis_number;
	}

	/**
	 * @param chesis_number the chesis_number to set
	 */
	public void setChesis_number(String chesis_number) {
		this.chesis_number = chesis_number;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the fuel_type
	 */
	public String getFuel_type() {
		return fuel_type;
	}

	/**
	 * @param fuel_type the fuel_type to set
	 */
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}

	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}

	/**
	 * @param average the average to set
	 */
	public void setAverage(double average) {
		this.average = average;
	}
	
	@PostConstruct
	public void initCar () {
		System.out.println("Initializing the car.");
		price = (long)(price+(price*0.10));
	}
	
	@PreDestroy
	public void destroyCar() {
		System.out.println("Demolishing the car.");
	}
}
