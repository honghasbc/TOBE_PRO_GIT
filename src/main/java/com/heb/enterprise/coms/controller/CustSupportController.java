/*
 * $Id: CustSupportController.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.heb.enterprise.coms.utils.ConstantsWeb;

/**
 * Controller for the Customer Support screen.
 * 
 * @author ha.than
 * 
 */
@Controller
@RequestMapping(ConstantsWeb.CUSTSUPPORT)
public class CustSupportController {
	// PATH
	private static final String ROOT_PATH = "/";
	private static final String CUSTOMER_SEARCH_PATH = "/customerSearch";
	private static final String CUSTOMER_INFO_PATH = "/customerInfo";
	private static final String REVIEW_ORDER_PATH = "/reviewOrder";
	// TILE
	private static final String CUSTOMER_SEARCH = "customerSupport.customerSearch.tile";
	private static final String CUSTOMER_INFO = "customerSupport.customerInfo.tile";
	private static final String REVIEW_ORDER = "customerSupport.reviewOrder.tile";

	/**
	 * Handles any customer search page case.
	 * 
	 * @param model
	 *            Attributes set to jsp
	 * @return the tile for the customer search page
	 */
	@RequestMapping(value = { ROOT_PATH, CUSTOMER_SEARCH_PATH }, method = RequestMethod.GET)
	public String customerSearch(ModelMap model) {
		return CUSTOMER_SEARCH;
	}

	/**
	 * Handles any customer information page case.
	 * 
	 * @param model
	 *            Attributes set to jsp
	 * @return the tile for the customer information page
	 */
	@RequestMapping(value = CUSTOMER_INFO_PATH, method = RequestMethod.GET)
	public String customerInfo(ModelMap model) {
		return CUSTOMER_INFO;
	}

	/**
	 * Handles any review order page case.
	 * 
	 * @param model
	 *            Attributes set to jsp
	 * @return the tile for the review order page
	 */
	@RequestMapping(value = REVIEW_ORDER_PATH, method = RequestMethod.GET)
	public String reviewOrder(ModelMap model) {
		return REVIEW_ORDER;
	}

}