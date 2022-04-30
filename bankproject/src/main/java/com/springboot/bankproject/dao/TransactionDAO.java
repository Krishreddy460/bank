package com.springboot.bankproject.dao;

/**
 * 
 */
package com.springboot.bankproject.dao;

import java.sql.SQLException;
import java.util.List;

import com.springboot.my.bank.models.Transaction;

/**
 * @author Leona
 *
 */
public interface TransactionDAO {

	public Boolean deposit(Double amount, Integer accNo) throws SQLException;

	public Boolean withdraw(Double amount, Integer accNo) throws SQLException;

	// add start date and end date
	public List<Transaction> showTransactions() throws SQLException;

}