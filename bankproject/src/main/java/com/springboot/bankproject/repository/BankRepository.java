package com.springboot.bankproject.repository;

/**
 * 
 */
package com.springboot.bankproject.repository;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.my.bank.dao.BankDAO;
import com.springboot.my.bank.mappers.BankMapper;
import com.springboot.my.bank.models.Bank;

/**
 * @author Leona
 *
 */

@Repository("bankRepo")
public class BankRepository implements BankDAO {

	@Autowired
	JdbcTemplate jdbcTemplateObject;

	@Override
	public Boolean createBank(Bank bank) throws SQLException {
		String sql = "INSERT INTO banks VALUES (?, ? ,?)";
		try {
			jdbcTemplateObject.update(sql, bank.getBankCode(), bank.getBankName(),
					bank.getMainOfficeAddress().toString());
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Bank viewDetailsByIFSC(String ifscCode) throws SQLException {
		String sql = "SELECT * FROM banks where bankCode = ?";
		return jdbcTemplateObject.queryForObject(sql, new Object[] { ifscCode }, new BankMapper());
	}

}
