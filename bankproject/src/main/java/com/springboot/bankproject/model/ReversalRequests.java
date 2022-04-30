package com.springboot.bankproject.model;

package com.springboot.bankproject.model;

import java.sql.Timestamp;

public class ReversalRequests {
	private Integer reqId;
	private Integer transactionNo;
	private Timestamp reqDate;

	/**
	 * 
	 */
	public ReversalRequests() {
	}

	/**
	 * @param reqId
	 * @param transactionNo
	 * @param reqDate
	 */
	public ReversalRequests(Integer reqId, Integer transactionNo, Timestamp reqDate) {
		this.reqId = reqId;
		this.transactionNo = transactionNo;
		this.reqDate = reqDate;
	}

	/**
	 * @return the reqId
	 */
	public Integer getReqId() {
		return reqId;
	}

	/**
	 * @param reqId the reqId to set
	 */
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
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

	/**
	 * @return the reqDate
	 */
	public Timestamp getReqDate() {
		return reqDate;
	}

	/**
	 * @param reqDate the reqDate to set
	 */
	public void setReqDate(Timestamp reqDate) {
		this.reqDate = reqDate;
	}

	@Override
	public String toString() {
		return "ReversalRequests [reqId=" + reqId + ", transactionNo=" + transactionNo + ", reqDate=" + reqDate + "]";
	}

}