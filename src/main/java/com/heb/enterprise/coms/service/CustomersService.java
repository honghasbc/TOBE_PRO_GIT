/*
 * $Id: CustomersService.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.heb.enterprise.coms.dao.CustomersDAO;
import com.heb.enterprise.coms.model.co.CustomerInformationCO;
import com.heb.enterprise.coms.utils.COMSException;
import com.heb.enterprise.coms.utils.Constants;

/**
 * @author ha.than
 * 
 */
@Service(Constants.CUSTOMERS_SERVICE)
public class CustomersService {

	@Autowired
	@Qualifier(Constants.CUSTOMERS_DAO)
	private CustomersDAO customersDao;
	
	
	/**
	 * update customer info
	 * @param cust CustomerInformationCO
	 * @return int number of record to updated
	 * @author ha.than
	 */
	public int updateCustInfo(CustomerInformationCO cust) throws COMSException {	
		return customersDao.updateCustInfo(cust);
	}
	
}
