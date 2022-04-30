package com.springboot.bankproject.model;
/**
 * 
 */
package com.springboot.bankproject.model;

import java.util.Objects;

public class Branch implements Comparable<Branch> {
	private String branchCode;
	private String bankCode;
	private String manager;
	private Address address;
	private Integer headOffice;

	/**
	 * 
	 */
	public Branch() {
		super();
	}

	/**
	 * @param branchCode
	 * @param bankCode
	 * @param manager
	 * @param address
	 */
	public Branch(String branchCode, String bankCode, String manager, Address address, Integer headOffice) {
		super();
		this.branchCode = branchCode;
		this.bankCode = bankCode;
		this.manager = manager;
		this.address = address;
		this.headOffice = headOffice;
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
	 * @return the manager
	 */
	public String getManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(String manager) {
		this.manager = manager;
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
	 * @return the headOffice
	 */
	public Integer getHeadOffice() {
		return headOffice;
	}

	/**
	 * @param headOffice the headOffice to set
	 */
	public void setHeadOffice(Integer headOffice) {
		this.headOffice = headOffice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankCode, branchCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Branch other = (Branch) obj;
		return Objects.equals(bankCode, other.bankCode) && Objects.equals(branchCode, other.branchCode);
	}

	@Override
	public int compareTo(Branch o) {
		if (this.equals(o))
			return 0;
		else
			return 1;
	}

	@Override
	public String toString() {
		return "Branches [branchCode=" + branchCode + ", bankCode=" + bankCode + ", manager=" + manager + ", address="
				+ address + ", headOffice=" + headOffice + "]";
	}

}