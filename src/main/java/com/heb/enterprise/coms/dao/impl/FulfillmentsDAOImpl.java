/*
 * $Id: FulfillmentsDAOImpl.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.heb.enterprise.coms.dao.FulfillmentsDAO;
import com.heb.enterprise.coms.model.vo.FullfillmentVO;
import com.heb.enterprise.coms.utils.Constants;

/**
 * @author ha.than
 * 
 */
@Repository(Constants.FULFILLMENTS_DAO)
public class FulfillmentsDAOImpl extends BaseDAOImpl implements FulfillmentsDAO {

	private Log log = LogFactory.getLog(FulfillmentsDAOImpl.class);
	
	
	/**
	 * get list FullfillmentVO by range
	 * @param fromDate
	 * @param toDate
	 * @return
	 * @author ha.than
	 */
	public List<FullfillmentVO> getFullfillments(String fromDate,String toDate){
		List<FullfillmentVO> fullfillments = new ArrayList<FullfillmentVO>();
		FullfillmentVO fullFill ;
		for (int i = 0; i < 10; i++) {
			fullFill = new FullfillmentVO();
			fullFill.setTime("12/12/2012");
			fullFill.setInStore("170");
			fullFill.setEcomDistCenter("1705");
			fullFill.setWarehouse("7056");
			fullFill.setVendor("170567");
			fullfillments.add(fullFill);
		}
		return fullfillments;
	}
	
}
