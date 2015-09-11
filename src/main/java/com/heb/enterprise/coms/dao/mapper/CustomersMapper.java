/*
 * $Id: CustomersMapper.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.RowMapper;

import com.heb.enterprise.coms.model.vo.CustPhnNbrVO;

/**
 * @author ha.than
 * 
 */
public class CustomersMapper {
	private Log log = LogFactory.getLog(CustomersMapper.class);

	/**
	 * function convert result set to RowMapper<CustPhnNbrVO>.
	 * 
	 * @return RowMapper<CustPhnNbrVO>
	 */
	public static RowMapper<CustPhnNbrVO> getPhnNbrByOrdIdMapper() {
		RowMapper<CustPhnNbrVO> rowMapper = new RowMapper<CustPhnNbrVO>() {
		    public CustPhnNbrVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	CustPhnNbrVO order = new CustPhnNbrVO();
		    	order.setPhnTypCd(rs.getString(3));
		    	order.setPhnCntryCd(rs.getString(4));
		    	order.setPhnAreaCd(rs.getString(5));
		    	order.setPhnNbr(rs.getString(6));
		    	order.setPhnExtnNbr(rs.getString(7));
		    	order.setPhnTypDes(rs.getString(10));
				return order;
		    }
		};
		return rowMapper;
	}
	
	
}