package com.springboot.bankproject.mapper;

/**
 * 
 */
package com.springboot.bankproject.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.my.bank.models.ReversalRequests;

/**
 * @author Leona
 *
 */
public class ReversalRequestsMapper implements RowMapper<ReversalRequests> {

	@Override
	public ReversalRequests mapRow(ResultSet rs, int rowNum) throws SQLException {
		ReversalRequests reversalRequest = new ReversalRequests();
		reversalRequest.setReqId(rs.getInt("reqId"));
		reversalRequest.setTransactionNo(rs.getInt("transactionNo"));
		reversalRequest.setReqDate(rs.getTimestamp("reqDate"));
		return reversalRequest;
	}

}
