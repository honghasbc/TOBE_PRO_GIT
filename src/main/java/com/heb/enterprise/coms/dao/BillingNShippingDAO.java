/*
 * $Id: BillingNShippingDAO.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.heb.enterprise.coms.model.vo.BillInforVO;

/**
 * @author ha.than
 * 
 */
public interface BillingNShippingDAO extends BaseDAO {

	/**
	 * get all phone number by ordId
	 * @param ordId
	 * @return List<CustPhnNbrVO>
	 * @author ha.than
	 */
	public List<BillInforVO> getBillInforByOrdId(long ordId) throws DataAccessException;
}
