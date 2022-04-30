package com.springboot.bankproject.mapper;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.my.bank.models.Transaction;
import com.springboot.my.bank.models.TransactionType;

public class TransactionMapper implements RowMapper<Transaction> {

	@Override
	public Transaction mapRow(ResultSet rs, int rowNum) throws SQLException {

		Transaction transaction = new Transaction();
		transaction.setAccountNo(rs.getInt("accNo"));
		transaction.setAmount(rs.getDouble("amount"));
		transaction.setType(TransactionType.valueOf(rs.getString("type")));
		transaction.setTimestamp(rs.getTimestamp("timestamp"));
		transaction.setTransactionNo(rs.getInt("transactionNo"));
		return transaction;

	}

}