package com.springboot.bankproject.dao;



import java.sql.SQLException;
import java.util.List;

import com.springboot.my.bank.models.Bank;
import com.springboot.my.bank.models.Employee;

public interface EmployeeDAO {
public List<Employee> showAllEmployees() throws SQLException; 
public Employee getEmployeeById(Integer employeeId) throws SQLException;
public boolean updateEmployee(Integer employeeId,String employeeName,String branchCode) throws SQLException;
public boolean deleteEmployee(Integer employeeId) throws SQLException;
public boolean createEmployee(Employee emp) throws SQLException;
public Bank getEmployeeBank(String branchCode) throws SQLException;

}