package com.springboot.bankproject.service;

package com.springboot.bankproject.service;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springboot.my.bank.models.Bank;
import com.springboot.my.bank.repository.BankRepository;

@Service
public class BankService {

	@Resource(name = "bankRepo")
	private BankRepository bankRepository;

	public Boolean createBank(Bank bank) {
		try {
			return bankRepository.createBank(bank);
		} catch (SQLException e) {
			return false;
		}
	}

	public Bank viewDetails(String ifscCode) {
		try {
			return this.bankRepository.viewDetailsByIFSC(ifscCode);
		} catch (SQLException e) {
			return null;
		}
	}
}
