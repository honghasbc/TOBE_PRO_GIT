/*
 * $Id: BillingNShippingMapper.java
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

import com.heb.enterprise.coms.model.vo.BillInforVO;

/**
 * @author ha.than
 * 
 */
public class BillingNShippingMapper {
	private Log log = LogFactory.getLog(BillingNShippingMapper.class);

	/**
	 * function convert result set to RowMapper<BillInforVO>.
	 * 
	 * @return RowMapper<BillInforVO>
	 */
	public static RowMapper<BillInforVO> getBillInforByOrdIdMapper() {
		RowMapper<BillInforVO> rowMapper = new RowMapper<BillInforVO>() {
		    public BillInforVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	
		    	BillInforVO order = new BillInforVO();
		    	order.setOrdId(rs.getLong(1));
		    	order.setSeqNbr(rs.getInt(2));
		    	order.setPaymtStatCd(rs.getString(3));
		    	order.setPaymtStatTs(rs.getString(4));
		    	order.setPaymtMethCd(rs.getString(5));
		    	order.setAuthnNbr(rs.getString(6));
		    	order.setPaymtRecId(rs.getString(7));
		    	order.setPaymtTs(rs.getString(8));
		    	order.setPaymtAmt(rs.getString(9));
		    	order.setBillingFrstNm(rs.getString(10));
		    	order.setBillingMidNm(rs.getString(11));
		    	order.setBillingLstNm(rs.getString(12));
		    	order.setBillingAdr1Txt(rs.getString(13));
		    	order.setBillingAdr2Txt(rs.getString(14));
		    	order.setBillingAdr3Txt(rs.getString(15));
		    	order.setBillingAdr4Txt(rs.getString(16));
		    	order.setBillingCtyTxt(rs.getString(17));
		    	order.setBillingStAbb(rs.getString(18));
		    	order.setBillingZipCd(rs.getString(19));
		    	order.setBillingZipExtnCd(rs.getString(20));
		    	order.setBillingCntryNm(rs.getString(21));
		    	order.setCre8Ts(rs.getString(22));
		    	order.setCre8Uid(rs.getString(23));
		    	order.setUpdtTs(rs.getString(24));
		    	order.setUpdtUid(rs.getString(25));
		    	order.setPaymtProcTypCd(rs.getString(26));
		    	order.setPaymtActnCd(rs.getString(27));
		    	order.setPaymtCardTypCd(rs.getString(28));
		    	order.setPaymtCardRefNum(rs.getString(29));
		    	order.setPaymtCardRefHash(rs.getString(30));
		    	order.setPaymtCardMskdNum(rs.getString(31));
		    	order.setPaymtTndrTyp(rs.getString(32));
		    	order.setAuthnTypCd(rs.getString(33));
		    	order.setAuthnAmt(rs.getString(34));
		    	order.setPaymtRspnCd(rs.getString(35));
		    	order.setPaymtRspnMsg(rs.getString(36));
		    	order.setPaymtFrdChkCd(rs.getString(37));
		    	order.setPaymtFrdRspnCd(rs.getString(38));
		    	order.setPaymtFrdRspnMsg(rs.getString(39));
		    	
		    	order.setPaymtStatDes(rs.getString(40));
		    	order.setPaymtMethDes(rs.getString(41));
		    	
		    	
				return order;
		    }
		};
		return rowMapper;
	}	
	
	
}