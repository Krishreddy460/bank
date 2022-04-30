package com.springboot.bankproject.mapper;

/**
 * 
 */
package com.springboot.bankproject.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.my.bank.models.AccountType;
import com.springboot.my.bank.models.BankAccount;
import com.springboot.my.bank.models.SavingsAccount;

/**
 * @author Leona
 *
 */
public class SavingsAccountMapper implements RowMapper<BankAccount> {

	@Override
	public BankAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
		BankAccount savingsAccount = new SavingsAccount();
		savingsAccount.setAccountNo(rs.getInt("accNo"));
		savingsAccount.setBranchCode(rs.getString("branch"));
		savingsAccount.setCustomerId(rs.getInt("customer"));
		savingsAccount.setType(rs.getString("type"));
		savingsAccount.updateBalance(rs.getDouble("accBalance"));
		return savingsAccount;
	}

}
