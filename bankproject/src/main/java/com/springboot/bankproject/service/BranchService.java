package com.springboot.bankproject.service;


/**
 * 
 BranchServicege com.springboot.my.bank.services;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.my.bank.models.Branch;
import com.springboot.my.bank.models.Customer;
import com.springboot.my.bank.repository.BranchRepository;
import com.springboot.my.bank.repository.CustomerRepository;

/**
 * @author Leona
 *
 */
@Service
public class BranchService {

	@Resource(name = "branchRepo")
	private BranchRepository branchRepository;

	@Autowired
	private CustomerRepository customerRepo;

	public Boolean createBranch(Branch branch) {
		try {
			System.out.println(branch);
			return this.branchRepository.createBranch(branch);
		} catch (SQLException e) {
			return false;
		}
	}

	public List<Branch> getBranches() {
		try {
			return this.branchRepository.showBranches();
		} catch (SQLException e) {
			return null;
		}
	}

	public Branch getBranchByIFSC(String IFSC) {
		try {
			return this.branchRepository.viewDetailsByIFSC(IFSC);
		} catch (SQLException e) {
			return null;
		}
	}

	public String deleteBranchByIFSC(String IFSC) {
		try {
			if (this.branchRepository.deleteByIFSC(IFSC)) {
				return "Branch Deleted Successfully";
			} else {
				return "Branch not Deleted";
			}
		} catch (SQLException e) {
			return "Exception Reached";
		}
	}

	public Boolean updateBranchManagerName(Branch branch) {
		try {
			return this.branchRepository.updateBranchManager(branch);
		} catch (SQLException e) {
			return false;
		}
	}

	public List<Customer> getCustomersByBranch(String branchCode) {
		try {
			return customerRepo.getCustomerByBranches(branchCode);
		} catch (SQLException e) {
			return null;
		}
	}
}