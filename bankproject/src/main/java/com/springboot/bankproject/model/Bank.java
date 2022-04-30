package com.springboot.bankproject.model;

/**
 * 
 */
package com.springboot.bankproject.model;

import java.util.Objects;

/**
 * @author Leona
 *
 */
public class Bank implements Comparable<Bank> {
	private String bankCode;
	private String bankName;
	private Address mainOfficeAddress;

	/**
	 * 
	 */
	public Bank() {
	}

	/**
	 * @param bankCode
	 * @param bankName
	 * @param mainOfficeAddress
	 */
	public Bank(String bankCode, String bankName, Address mainOfficeAddress) {
		this.bankCode = bankCode;
		this.bankName = bankName;
		this.mainOfficeAddress = mainOfficeAddress;
	}

	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}

	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the mainOfficeAddress
	 */
	public Address getMainOfficeAddress() {
		return mainOfficeAddress;
	}

	/**
	 * @param mainOfficeAddress the mainOfficeAddress to set
	 */
	public void setMainOfficeAddress(Address mainOfficeAddress) {
		this.mainOfficeAddress = mainOfficeAddress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return Objects.equals(bankCode, other.bankCode);
	}

	@Override
	public int compareTo(Bank o) {
		if (this.equals(o))
			return 0;
		else
			return 1;
	}

	@Override
	public String toString() {
		return "Bank [bankCode=" + bankCode + ", bankName=" + bankName + ", mainOfficeAddress=" + mainOfficeAddress
				+ "]";
	}

}