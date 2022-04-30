package com.springboot.bankproject.model;
/**
 * 


/**
 * @author Leona
 *
 */
public class Address {

	private String street;
	private String city;
	private String state;
	private String country;
	private Integer pincode;

	/**
	 * 
	 */
	public Address() {
		super();
	}

	/**
	 * @param street
	 * @param city
	 * @param state
	 * @param country
	 * @param pincode
	 */
	public Address(String street, String city, String state, String country, Integer pincode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the pincode
	 */
	public Integer getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %d", this.street, this.city, this.state, this.country, this.pincode);
	}

}