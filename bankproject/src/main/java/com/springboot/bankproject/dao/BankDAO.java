package com.springboot.bankproject.dao;

/**
 * 
 */
package com.springboot.bankproject.dao;

import java.sql.SQLException;

import com.springboot.my.bank.models.Bank;


public interface BankDAO {

	public Boolean createBank(Bank bank) throws SQLException;

	public Bank viewDetailsByIFSC(String ifscCode) throws SQLException;

}
