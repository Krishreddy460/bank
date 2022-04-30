package com.springboot.bankproject.model;


public abstract class BankAccount {
	private Integer accountNo;
	private Integer customerId;
	private String branchCode;
	private Double accBalance;
	private String type;

	/**
	 * 
	 */
	public BankAccount() {
		
	}

	/**
	 * @param accountNo
	 * @param customerId
	 * @param branchCode
	 * @param balance
	 * @param type
	 */
	public BankAccount(Integer accountNo, Integer customerId, String branchCode, Double accBalance, String type) {
		this.accountNo = accountNo;
		this.customerId = customerId;
		this.branchCode = branchCode;
		this.accBalance = accBalance;
		this.type = type;
	}

	/**
	 * @return the accountNo
	 */
	public Integer getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the balance
	 */
	public Double returnAccBalance() {
		return accBalance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void updateBalance(Double accBalance) {
		this.accBalance = accBalance;
	}

	abstract double calculateCharges();

	abstract double calculateInterest();

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", customerId=" + customerId + ", branchCode=" + branchCode
				+ ", accBalance=" + accBalance + ", type=" + type + "]";
	}

}