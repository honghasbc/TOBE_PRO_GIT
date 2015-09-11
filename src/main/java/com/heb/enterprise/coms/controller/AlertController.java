/*
 * $Id: AlertController.java
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
 * Controller for the Alert screen.
 * 
 * @author ha.than
 * 
 */
@Controller
@RequestMapping(ConstantsWeb.ALERT)
public class AlertController {
	// PATH
	private static final String ROOT_PATH = "/";

	// TILE
	private static final String ALERT_INDEX = "alert.index.tile";
	private static final String DEMOAPP_INDEX = "demoApp.index.tile";
	private static final String ALERT_PATH = "/alerting";
	private static final String DEMOAPP_PATH = "/demoApp";

	/**
	 * Handles any alert index page case.
	 * 
	 * @param model
	 *            Attributes set to jsp
	 * @return the tile for the alert index page
	 */
	@RequestMapping(value = { ROOT_PATH, ALERT_PATH }, method = RequestMethod.GET)
	public String index(ModelMap model) {
		return ALERT_INDEX;
	}
	/**
	 * Handles any alert index page case.
	 * 
	 * @param model
	 *            Attributes set to jsp
	 * @return the tile for the alert index page
	 */
	@RequestMapping(value = { ROOT_PATH, DEMOAPP_PATH }, method = RequestMethod.GET)
	public String demoApp(ModelMap model) {
		return DEMOAPP_INDEX;
	}

}