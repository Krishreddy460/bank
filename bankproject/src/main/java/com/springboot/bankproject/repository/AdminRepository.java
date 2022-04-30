package com.springboot.bankproject.repository;

/**
 * 
 */
package com.springboot.bankproject.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.my.bank.dao.AdminDAO;
import com.springboot.my.bank.mappers.AdminMapper;
import com.springboot.my.bank.mappers.CustomerMapper;
import com.springboot.my.bank.mappers.TransactionMapper;
import com.springboot.my.bank.models.Admin;
import com.springboot.my.bank.models.Customer;
import com.springboot.my.bank.models.Transaction;

/**
 * @author Leona
 *
 */

@Repository("adminRepo")
public class AdminRepository implements AdminDAO {
	@Autowired
	JdbcTemplate jdbcTemplateObject;

	@SuppressWarnings("deprecation")
	@Override
	public Admin getAdminById(Integer adminId) throws SQLException {
		String sql = "SELECT * FROM admins WHERE adminId = ?";
		return jdbcTemplateObject.queryForObject(sql, new Object[] { adminId }, new AdminMapper());
	}

	@Override
	public List<Transaction> showTransactions() throws SQLException {
		String sql = "SELECT * FROM transactions";
		return jdbcTemplateObject.query(sql, new TransactionMapper());
	}

	@Override
	public List<Customer> showCustomers() throws SQLException {
		String sql = "SELECT * FROM customers";
		return jdbcTemplateObject.query(sql, new CustomerMapper());
	}

//	@Override
//	public Boolean approveReversal() throws SQLException {
//		return null;
//	}
//
//	@Override
//	public Boolean rejectRevesal() throws SQLException {
//		return null;
//	}

}
