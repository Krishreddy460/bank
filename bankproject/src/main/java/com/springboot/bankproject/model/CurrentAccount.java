package com.springboot.bankproject.model;
/**
 * 
 */
package com.springboot.bankproject.model;

/**
 * @author Leona
 *
 */
public class CurrentAccount extends BankAccount {

	public CurrentAccount() {

	}

	public CurrentAccount(Integer accountNo, Integer customerId, String branchCode, Double balance, String type) {
		super(accountNo, customerId, branchCode, balance, type);
	}

	@Override
	double calculateCharges() {
		double charges = 100;// Service charge
		// Minimum balance not maintained charges
		if (super.returnAccBalance() >= 500 && super.returnAccBalance() < 1000)
			charges += 1000;
		else if (super.returnAccBalance() < 500)
			charges += 1800;
		return charges;
	}

	@Override
	double calculateInterest() {
		// Current accounts do not have any interest
		return 0;
	}

}