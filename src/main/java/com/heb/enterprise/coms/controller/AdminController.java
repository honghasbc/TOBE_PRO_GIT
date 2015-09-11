/*
 * $Id: AdminController.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.heb.enterprise.coms.model.vo.DynamicDataVO;
import com.heb.enterprise.coms.model.vo.MetaDataVO;
import com.heb.enterprise.coms.service.CodeTablesService;
import com.heb.enterprise.coms.utils.COMSException;
import com.heb.enterprise.coms.utils.CodeTablesParser;
import com.heb.enterprise.coms.utils.CommonFunction;
import com.heb.enterprise.coms.utils.Constants;
import com.heb.enterprise.coms.utils.ConstantsWeb;

/**
 * Controller for the Admin screen.
 * 
 * @author ha.than
 * 
 */
@Controller
@RequestMapping(ConstantsWeb.ADMIN)
public class AdminController {
	// PATH
	private static final String ROOT_PATH = "/";
	private static final String ADMIN_CODE_TABLES_PATH = "/codeTables";
	private static final String AJAX_GET_CODE_TABLES_PATH = "/getCodeTable";
	private static final String AJAX_SAVE_CODE_TABLES_PATH = "/saveCodeTable";
	// TILE
	private static final String ADMIN_INDEX = "admin.index.tile";
	private static final String ADMIN_CODE_TABLES = "admin.code.table.tile";
	private static final String ADMIN_AJAX_GET_CODE_TABLES = "admin.ajax.get.code.table.tile";

	/**
	 * Initial AdminService.
	 * 
	 * @param adminService
	 *            set service
	 */
	@Autowired
	@Qualifier(Constants.CODE_TABLES_SERVICE)
	private CodeTablesService codeTablesService;

	/**
	 * Handles any admin index page case.
	 * 
	 * @param model
	 *            Attributes set to jsp
	 * @return the tile for the admin index page
	 */

	@RequestMapping(value = ROOT_PATH, method = RequestMethod.GET)
	public String index(ModelMap model) {
		return ADMIN_INDEX;
	}

	/**
	 * Handles any code table page case.
	 * 
	 * @param model
	 *            Attributes set to jsp
	 * @return the tile for the code tables page
	 * @throws Exception
	 */
	@RequestMapping(value = { ROOT_PATH, ADMIN_CODE_TABLES_PATH }, method = RequestMethod.GET)
	public String codeTables(ModelMap model) throws Exception {
		CodeTablesParser cdTblsParser = new CodeTablesParser();
		try {
			List<String> lstTable = cdTblsParser.getCdTblsFromPropsFile();
			model.addAttribute(ConstantsWeb.LIST_META_DATA_TABLES_ATTR,
					this.createLstMetaForTable(lstTable));
		} catch (IOException e) {
			// FIXME : please return to error page
			e.printStackTrace();
		}
		return ADMIN_CODE_TABLES;
	}

	/**
	 * Handles any code table page case.
	 * 
	 * @param model
	 *            Attributes set to jsp
	 * @return the tile for the code tables page
	 */
	@RequestMapping(value = { ROOT_PATH, AJAX_GET_CODE_TABLES_PATH }, method = RequestMethod.GET, params = { "tableName" })
	public String getMetaDataCodeTable(ModelMap model,
			@RequestParam String tableName) {
		try {
			if (tableName != null && !tableName.trim().isEmpty()) {
				List<DynamicDataVO> lst = codeTablesService
						.geDataByTable(tableName);
				JSONObject jsonData = CommonFunction.parseLstDynamicToJSON(lst);
				model.addAttribute("jsonDataCdTbls", jsonData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ADMIN_AJAX_GET_CODE_TABLES;
	}

	private List<DynamicDataVO> createLstMetaForTable(List<String> lstTable)
			throws Exception {
		CodeTablesParser cdTblsParser = new CodeTablesParser();
		List<DynamicDataVO> lst = new ArrayList<DynamicDataVO>();
		DynamicDataVO dynamic = null;
		List<MetaDataVO> lstMetaData = null;
		for (String tableName : lstTable) {
			dynamic = new DynamicDataVO();
			lstMetaData = codeTablesService.getMetaDatasByTable(tableName);
			if (lstMetaData != null && !lstMetaData.isEmpty()) {
				try {
					cdTblsParser.bindDescForMetaDatas(tableName, lstMetaData,
							dynamic);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			dynamic.setTableName(tableName);
			lst.add(dynamic);
		}
		return lst;
	}

	/**
	 * Handles any code table page case.
	 * 
	 * @param model
	 *            Attributes set to jsp
	 * @return the tile for the code tables page
	 */
	@RequestMapping(value = { ROOT_PATH, AJAX_SAVE_CODE_TABLES_PATH }, method = RequestMethod.POST)
	public String saveCodeTableForm(
			ModelMap model,
			@RequestParam(value = "tableName", required = false) String tableName,
			@RequestParam(value = "type", required = false) String type,
			@RequestParam(value = "fields", required = false) String[] fields,
			@RequestParam(value = "values", required = false) String[] values) {
		int ret = -1;
		try {
			if (type.equalsIgnoreCase(Constants.STR_ADD)) {
				ret = codeTablesService.addCodeTable(tableName, fields, values);
			} else if (type.equalsIgnoreCase(Constants.STR_EDIT)) {
				ret = codeTablesService.updateCodeTable(tableName, fields,
						values);
			} else if (type.equalsIgnoreCase(Constants.STR_DELETE)) {
				ret = codeTablesService.deleteCodeTable(tableName, fields,
						values);
			}
		} catch (COMSException e) {
			e.printStackTrace();
		}
		model.addAttribute("jsonDataCdTbls", ret);
		return ADMIN_AJAX_GET_CODE_TABLES;
	}
}