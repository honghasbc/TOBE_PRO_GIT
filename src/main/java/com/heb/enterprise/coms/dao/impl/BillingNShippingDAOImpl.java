/*
 * $Id: BillingNShippingDAOImpl.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.heb.enterprise.coms.dao.BillingNShippingDAO;
import com.heb.enterprise.coms.dao.mapper.BillingNShippingMapper;
import com.heb.enterprise.coms.model.vo.BillInforVO;
import com.heb.enterprise.coms.utils.Constants;

/**
 * @author ha.than
 * 
 */
@Repository(Constants.BILLING_SHIPPING_DAO)
public class BillingNShippingDAOImpl extends BaseDAOImpl implements BillingNShippingDAO {

	private Log log = LogFactory.getLog(BillingNShippingDAOImpl.class);

	/**
	 * get all phone number by ordId
	 * @param ordId
	 * @return List<CustPhnNbrVO>
	 * @author ha.than
	 */
	public List<BillInforVO> getBillInforByOrdId(long ordId) throws DataAccessException {	
		return null;
	}

}
