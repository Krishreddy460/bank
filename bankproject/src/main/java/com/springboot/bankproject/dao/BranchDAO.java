package com.springboot.bankproject.dao;


/**
 * 
 */
package com.springboot.bankproject.dao;

import java.sql.SQLException;
import java.util.List;

import com.springboot.my.bank.models.Branch;
import com.springboot.my.bank.models.Customer;
import com.springboot.my.bank.models.Transaction;

/**
 * @author Leona
 *
 */
public interface BranchDAO {

	public Boolean createBranch(Branch branch) throws SQLException;

	public List<Branch> showBranches() throws SQLException;

	public Branch viewDetailsByIFSC(String ifscCode) throws SQLException;

	public Boolean updateBranchManager(Branch branch) throws SQLException;

	public Boolean deleteByIFSC(String ifscCode) throws SQLException;

	public List<Transaction> showTransactions() throws SQLException;

	public List<Customer> showCustomers() throws SQLException;

}