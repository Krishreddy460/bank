package com.springboot.bankproject.service;

package com.springboot.bankproject.service;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springboot.my.bank.models.Transaction;
import com.springboot.my.bank.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Resource(name = "transactionRepo")
	private TransactionRepository transactionRepository;

	public Boolean deposit(Double amount, Integer accNo) {
		try {
			return transactionRepository.deposit(amount, accNo);
		}catch (SQLException e) {
			return false;
		}
	}
	
	public Boolean withdraw(Double amount, Integer accNo) {
		try {
			return transactionRepository.withdraw(amount, accNo);
		}catch (SQLException e) {
			return false;
		}
	}
	
	public List<Transaction> getAllTransactions(){
		try {
			return transactionRepository.showTransactions();
		}catch(SQLException e) {
			return null;
		}
	}
}
