package com.springboot.bankproject.model;

/**
 * 
 */
package com.springboot.bankproject.model;

/**
 * @author Leona
 *
 */
public class Customer {
	private String name;
	private Address address;
	private Integer customerId;

	/**
	 * 
	 */
	public Customer() {
		super();
	}

	/**
	 * @param name
	 * @param address
	 * @param customerId
	 */
	public Customer(String name, Address address, Integer customerId) {
		super();
		this.name = name;
		this.address = address;
		this.customerId = customerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", customerId=" + customerId + "]";
	}

}