package com.springboot.bankproject.mapper;

/**
 * 
 */
package com.springboot.bankproject.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.my.bank.models.Bank;

/**
 * @author Leona
 *
 */
public class BankMapper implements RowMapper<Bank> {

	@Override
	public Bank mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bank bank = new Bank();
		bank.setBankCode(rs.getString("bankCode"));
		bank.setBankName(rs.getString("bankName"));
		bank.setMainOfficeAddress(AddressHelper.processAddress(rs.getString("mainOfficeAddress")));
		return bank;
	}

}