/*
 * $Id: FulfillmentsDAO.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dao;

import java.util.List;

import com.heb.enterprise.coms.model.vo.FullfillmentVO;


/**
 * @author ha.than
 * 
 */
public interface FulfillmentsDAO extends BaseDAO {

	/**
	 * get list FullfillmentVO by range
	 * @param fromDate
	 * @param toDate
	 * @return
	 * @author ha.than
	 */
	public List<FullfillmentVO> getFullfillments(String fromDate,String toDate);
}
