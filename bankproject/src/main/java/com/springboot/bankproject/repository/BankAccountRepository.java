package com.springboot.bankproject.repository;

/**
 * 
 */
package com.springboot.bankproject.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.my.bank.dao.BankAccountDAO;
import com.springboot.my.bank.mappers.SavingsAccountMapper;
import com.springboot.my.bank.models.BankAccount;

/**
 * @author Leona
 *
 */

@Repository("bankAccountRepo")
public class BankAccountRepository implements BankAccountDAO {
	@Autowired
	JdbcTemplate jdbcTemplateObject;

	@Override
	public Boolean createAccount(BankAccount bankAccount) {
		System.out.println("hello");
		String sql = "INSERT INTO bank_accounts VALUES(?, ?, ?, ?, ?)";
		try {
			System.out.println(bankAccount);
			jdbcTemplateObject.update(sql, bankAccount.getAccountNo(), bankAccount.getCustomerId(),
					bankAccount.getBranchCode(), bankAccount.getType(), bankAccount.returnAccBalance());
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	@Override
	public List<BankAccount> showAllAccounts() {
		String sql = "SELECT * FROM bank_accounts";
		return jdbcTemplateObject.query(sql, new SavingsAccountMapper());
	}

	@SuppressWarnings("deprecation")
	@Override
	public BankAccount getAccountByAccNo(Integer accNo) {
		String sql = "SELECT * FROM bank_accounts";
		return jdbcTemplateObject.queryForObject(sql, new Object[] { accNo }, new SavingsAccountMapper());
	}

	@SuppressWarnings("deprecation")
	public BankAccount getAccountDetailsById(Integer customerId) {
		String sql = "SELECT * FROM bank_accounts WHERE customer=?";
		return jdbcTemplateObject.queryForObject(sql, new Object[] { customerId }, new SavingsAccountMapper());
	}
	
	public Boolean deleteBankAccount(Integer accNo) {
		String sql = "DELETE FROM bank_accounts WHERE accNo=?";
		return jdbcTemplateObject.update(sql,accNo)>0;

	}


}