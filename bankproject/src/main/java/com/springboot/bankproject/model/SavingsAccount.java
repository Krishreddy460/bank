package com.springboot.bankproject.model;

/**
 * 
 */
package com.springboot.bankproject.model;

/**
 * @author Leona
 *
 */
public class SavingsAccount extends BankAccount {
	static final double RATEOFINTEREST = 3.0;

	public SavingsAccount(Integer accountNo, Integer customerId, String branchCode, Double balance, String type) {
		super(accountNo, customerId, branchCode, balance, type);
	}

	public SavingsAccount() {
	}

	@Override
	double calculateCharges() {
		double charges = 100; // Service Charge
		if (super.returnAccBalance() < 5000) {
			charges += ((5000 - super.returnAccBalance()) % 100) * 5 + 75;
			// Rs 5 for every 100 shortfall + minimum charge of Rs. 75
		}
		return charges;
	}

	@Override
	double calculateInterest() {
		return (super.returnAccBalance() * 3) / 100;
	}

}