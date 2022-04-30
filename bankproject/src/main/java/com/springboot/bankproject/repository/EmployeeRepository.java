package com.springboot.bankproject.repository;

package com.springboot.bankproject.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.my.bank.dao.EmployeeDAO;
import com.springboot.my.bank.mappers.BankMapper;
import com.springboot.my.bank.mappers.EmployeeMapper;
import com.springboot.my.bank.models.Bank;
import com.springboot.my.bank.models.Employee;

@Repository("employeeRepo")
public class EmployeeRepository implements EmployeeDAO {
	@Autowired
	JdbcTemplate jdbcTemplateObject;

	@Override
	public boolean createEmployee(Employee emp) throws SQLException {
		String query = "INSERT INTO employees(name, branchCode) VALUES(?,?)";
		return jdbcTemplateObject.update(query, emp.getName(), emp.getBranchCode()) > 0;

	}

	@Override
	public boolean deleteEmployee(Integer empId) throws SQLException {
		String query = "DELETE FROM employees WHERE empId = ?";
		return jdbcTemplateObject.update(query, empId) > 0;

	}
	public Bank getEmployeeBank(String branchCode) throws SQLException{
		String query = "select bankcode,bankname,mainOfficeAddress from banks inner join branches using(bankcode) where branchcode=?";
		return jdbcTemplateObject.queryForObject(query, new Object[] { branchCode }, new BankMapper());

	}


	@SuppressWarnings("deprecation")
	@Override
	public Employee getEmployeeById(Integer empId) throws SQLException {
		String query = "SELECT * FROM employees WHERE empId=?";
		return jdbcTemplateObject.queryForObject(query, new Object[] { empId }, new EmployeeMapper());

	}

	@Override
	public List<Employee> showAllEmployees() throws SQLException {
		String query = "SELECT * FROM employees";
		return jdbcTemplateObject.query(query, new EmployeeMapper());
	}

	@Override
	public boolean updateEmployee(Integer empId, String name, String branchCode) throws SQLException {
		String query = "UPDATE employees SET name= ? WHERE empId= ? ";
		return jdbcTemplateObject.update(query, name, empId) > 0;

	}

}