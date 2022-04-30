package com.springboot.bankproject.mapper;
package com.springboot.my.bank.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.my.bank.models.Customer;

/**
 * @author Leona
 *
 */
public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustomerId(rs.getInt("customerId"));
		customer.setName(rs.getString("name"));
		customer.setAddress(AddressHelper.processAddress(rs.getString("address")));
		return customer;
	}

}