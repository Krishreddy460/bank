package com.springboot.bankproject.mapper;

/**
 * 
 */
package com.springboot.bankproject.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.my.bank.models.Employee;

/**
 * @author Leona
 *
 */
public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpId(rs.getInt("empId"));
		employee.setName(rs.getString("name"));
		employee.setBranchCode(rs.getString("branchCode"));
		return employee;
	}

}