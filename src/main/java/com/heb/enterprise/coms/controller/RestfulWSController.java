/*
 * $Id: RestfulWSController.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.heb.enterprise.coms.utils.CommonFunction;
import com.heb.enterprise.coms.utils.ConstantsWeb;

/**
 * Controller for the Alert screen.
 * 
 * @author ha.than
 * 
 */
@Controller
@RequestMapping(ConstantsWeb.RESTFULWS)
public class RestfulWSController {
	private Log LOG = LogFactory.getLog(RestfulWSController.class);
	// PATH
	private static final String ROOT_PATH = "/";

	// TILE
	private static final String GETDATAFROMWS_INDEX = "getdatafromws.index.tile";
	private static final String ORDERBASKETSIZE_PATH = "/orderbasketsize";
	
	@Autowired
	private HttpServletRequest request;
	/**
	 * Handles any alert index page case.
	 * 
	 * @param model
	 *            Attributes set to jsp
	 * @return the tile for the alert index page
	 */
	@RequestMapping(value = { ROOT_PATH, "/{name}" }, method = RequestMethod.GET)
	public String index(@PathVariable String name, ModelMap model) {
		JSONArray jsonData = null;
		this.LOG.info("Request name:"+name);
		if(name.equals("orderbasketsize")){
			jsonData = CommonFunction.parseOrderBksSizesHeaderJSON(request.getRealPath(ConstantsWeb.PATH_RESOURCE_HEADER));
			model.addAttribute("jsonDataRestFul",jsonData);
		}else if(name.equals("orderthroughput")){
			jsonData = CommonFunction.parseOrdThrPutHeaderJSON(request.getRealPath(ConstantsWeb.PATH_RESOURCE_HEADER),true);
			model.addAttribute("jsonDataRestFul",jsonData);
		}
		this.LOG.info(jsonData);
		return GETDATAFROMWS_INDEX;
	}
}