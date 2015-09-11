/*
 * $Id: CustomersDAOImpl.java
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

import com.heb.enterprise.coms.dao.CustomersDAO;
import com.heb.enterprise.coms.dao.mapper.CustomersMapper;
import com.heb.enterprise.coms.model.co.CustomerInformationCO;
import com.heb.enterprise.coms.model.vo.CustPhnNbrVO;
import com.heb.enterprise.coms.utils.COMSException;
import com.heb.enterprise.coms.utils.Constants;

/**
 * @author ha.than
 * 
 */
@Repository(Constants.CUSTOMERS_DAO)
public class CustomersDAOImpl extends BaseDAOImpl implements CustomersDAO {

	private Log log = LogFactory.getLog(CustomersDAOImpl.class);
	
	/**
	 * get all phone number by ordId
	 * @param ordId
	 * @return List<CustPhnNbrVO>
	 * @author ha.than
	 */
	public List<CustPhnNbrVO> getPhnNbrByOrdId(long ordId) throws DataAccessException {	
		return null;
	}

	/**
	 * update customer info
	 * @param cust CustomerInformationCO
	 * @return int number of record to updated
	 * @author ha.than
	 */
	public int updateCustInfo(CustomerInformationCO cust) throws COMSException {	
		return 0;
	}
	
}
