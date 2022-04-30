package com.springboot.bankproject.model;
package com.springboot.bankproject.model;

public class Employee {
	private Integer empId;
	private String name;
	private String branchCode;

	/**
	 * 
	 */
	public Employee() {
	}

	/**
	 * @param empId
	 * @param name
	 * @param branchCode
	 */
	public Employee(Integer empId, String name, String branchCode) {
		this.empId = empId;
		this.name = name;
		this.branchCode = branchCode;
	}

	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
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

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", name=" + name + ", branchCode=" + branchCode + "]";
	}

}