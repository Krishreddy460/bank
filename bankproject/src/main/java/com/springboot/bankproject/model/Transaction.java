package com.springboot.bankproject.model;

/**
 * 
 */
package com.springboot.bankproject.model;

import java.sql.Timestamp;

/**
 * @author Leona
 *
 */
public class Transaction {
	private Integer accountNo;
	private TransactionType type;
	private Timestamp timeStamp;
	private Double amount;
	private Integer transactionNo;

	/**
	 * 
	 */
	public Transaction() {
	}

	/**
	 * @param accountNo
	 * @param type
	 * @param date
	 * @param amount
	 */
	public Transaction(Integer accountNo, TransactionType type, Timestamp timeStamp, Double amount,
			Integer transactionNo) {
		this.accountNo = accountNo;
		this.type = type;
		this.timeStamp = timeStamp;
		this.amount = amount;
		this.transactionNo = transactionNo;
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
	 * @return the type
	 */
	public TransactionType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TransactionType type) {
		this.type = type;
	}

	/**
	 * @return the date
	 */
	public Timestamp getTimestamp() {
		return timeStamp;
	}

	/**
	 * @param date the date to set
	 */
	public void setTimestamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the transactionNo
	 */
	public Integer getTransactionNo() {
		return transactionNo;
	}

	/**
	 * @param transactionNo the transactionNo to set
	 */
	public void setTransactionNo(Integer transactionNo) {
		this.transactionNo = transactionNo;
	}

	@Override
	public String toString() {
		return "Transaction [accountNo=" + accountNo + ", type=" + type + ", timestamp=" + timeStamp + ", amount="
				+ amount + "]";
	}

}