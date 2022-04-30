package com.springboot.bankproject.dao;

/**
 * 
 */
package com.springboot.bankproject.dao;

import java.sql.SQLException;

/**
 * @author Leona
 *
 */
public interface BankBranchDAO {

	public Boolean updateByIFSC(String ifscCode) throws SQLException;

	public Boolean deleteByIFSC(String ifscCode) throws SQLException;

}