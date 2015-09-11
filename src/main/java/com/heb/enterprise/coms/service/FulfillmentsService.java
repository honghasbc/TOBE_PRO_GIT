/*
 * $Id: FulfillmentsService.java
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

import com.heb.enterprise.coms.dao.FulfillmentsDAO;
import com.heb.enterprise.coms.utils.Constants;

/**
 * @author ha.than
 * 
 */
@Service(Constants.FULFILLMENTS_SERVICE)
public class FulfillmentsService {

	@Autowired
	@Qualifier(Constants.FULFILLMENTS_DAO)
	private FulfillmentsDAO fulfillmentsDAO;

	
}
