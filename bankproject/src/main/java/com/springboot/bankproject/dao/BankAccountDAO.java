package com.springboot.bankproject.dao;

package com.springboot.bankproject.dao;

import java.util.List;

import com.springboot.my.bank.models.BankAccount;

/**
 * @author Leona
 *
 */

public interface BankAccountDAO {

	public Boolean createAccount(BankAccount bankAccount);

	public List<BankAccount> showAllAccounts();

	public BankAccount getAccountByAccNo(Integer accNo);
	public BankAccount getAccountDetailsById(Integer customerId );
	public Boolean deleteBankAccount(Integer accNo);
}