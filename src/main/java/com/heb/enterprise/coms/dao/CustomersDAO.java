/*
 * $Id: CustomersDAO.java
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

import com.heb.enterprise.coms.model.co.CustomerInformationCO;
import com.heb.enterprise.coms.model.vo.BillInforVO;
import com.heb.enterprise.coms.model.vo.CustPhnNbrVO;
import com.heb.enterprise.coms.utils.COMSException;


/**
 * @author ha.than
 * 
 */
public interface CustomersDAO extends BaseDAO {

	/**
	 * get all phone number by ordId
	 * @param ordId
	 * @return List<CustPhnNbrVO>
	 * @author ha.than
	 */
	public List<CustPhnNbrVO> getPhnNbrByOrdId(long ordId) throws DataAccessException;
	
	/**
	 * update customer info
	 * @param cust CustomerInformationCO
	 * @return int number of record to updated
	 * @author ha.than
	 */
	public int updateCustInfo(CustomerInformationCO cust) throws COMSException;
}
