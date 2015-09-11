/*
 * $Id: OrdersService.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.heb.enterprise.coms.dao.CodeTablesDAO;
import com.heb.enterprise.coms.model.vo.DynamicDataVO;
import com.heb.enterprise.coms.model.vo.MetaDataVO;
import com.heb.enterprise.coms.utils.COMSException;
import com.heb.enterprise.coms.utils.CodeTablesParser;
import com.heb.enterprise.coms.utils.Constants;

/**
 * @author ha.than
 * 
 */
@Service(Constants.CODE_TABLES_SERVICE)
public class CodeTablesService {

	@Autowired
	@Qualifier(Constants.CODE_TABLES_DAO)
	private CodeTablesDAO codeTablesDAO;

	/**
	 * function get meta data column by table
	 * 
	 * @param tableName
	 *            String
	 * @return List<MetaDataTableVO>
	 * @author ha.than
	 * @throws COMSException
	 */
	public List<MetaDataVO> getMetaDatasByTable(String tableName)
			throws COMSException {
		return codeTablesDAO.getMetaDatasByTable(tableName);
	}

	/**
	 * function get data by table name
	 * 
	 * @param tableName
	 *            String
	 * @return List<MetaDataTableVO>
	 * @author ha.than
	 * @throws COMSException
	 */
	public List<DynamicDataVO> geDataByTable(String tableName)
			throws COMSException {
		List<MetaDataVO> metaData = codeTablesDAO
				.getMetaDatasByTable(tableName);
		List<Map<String, Object>> lstData = codeTablesDAO.geDatasByTable(
				tableName, metaData);
		List<DynamicDataVO> ret = CodeTablesParser.convertLstMapToLstDynamic(
				metaData, lstData);
		return ret;
	}

	/**
	 * function insert
	 * 
	 * @param tableName
	 *            String
	 * @param String
	 *            [] fields
	 * @param String
	 *            [] values
	 * @return int
	 * @author ha.than
	 */
	public int addCodeTable(String tableName, String[] fields, String[] values)
			throws COMSException {
		return codeTablesDAO.addCodeTable(tableName, fields, values);
	}

	/**
	 * function update
	 * 
	 * @param tableName
	 *            String
	 * @param String
	 *            [] fields
	 * @param String
	 *            [] values
	 * @return int
	 * @author ha.than
	 */
	public int updateCodeTable(String tableName, String[] fields,
			String[] values) throws COMSException {
		return codeTablesDAO.updateCodeTable(tableName, fields, values);
	}

	/**
	 * function delete
	 * 
	 * @param tableName
	 *            String
	 * @param String
	 *            [] fields
	 * @param String
	 *            [] values
	 * @return int
	 * @author ha.than
	 */
	public int deleteCodeTable(String tableName, String[] fields,
			String[] values) throws COMSException {
		return codeTablesDAO.deleteCodeTable(tableName, fields, values);
	}
}
