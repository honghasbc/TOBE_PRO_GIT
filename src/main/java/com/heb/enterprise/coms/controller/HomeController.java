/*
 * $Id: HomeController.java
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


/**
 * Controller for the Home screen.
 * 
 * @author ha.than
 * 
 */
@Controller
public class HomeController {
	
	//PATH
	private static final String ROOT_PATH = "/";
	private static final String HOME_PATH = "/home";
	//TILE
	private static final String HOME_TILE = "home.index.tile";
	
	/**
     * Handles any home page case.
     *
     * @param model Attributes set to jsp
     * @return the tile for the home page
     */
	@RequestMapping(value={ROOT_PATH,HOME_PATH},method = RequestMethod.GET)
	public String index(ModelMap model) {
		return HOME_TILE;
	}	

}