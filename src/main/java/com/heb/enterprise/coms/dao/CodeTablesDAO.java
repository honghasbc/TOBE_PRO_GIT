/*
 * $Id: CodeTablesDAO.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dao;

import java.util.List;
import java.util.Map;

import com.heb.enterprise.coms.model.vo.MetaDataVO;
import com.heb.enterprise.coms.utils.COMSException;

/**
 * @author ha.than
 * 
 */
public interface CodeTablesDAO extends BaseDAO {

	/**
	 * function get meta data column by table
	 * 
	 * @param tableName
	 *            String
	 * @return List<MetaDataTableVO>
	 * @author ha.than
	 */
	public List<MetaDataVO> getMetaDatasByTable(String tableName)
			throws COMSException;

	/**
	 * function get data by table name
	 * 
	 * @param tableName
	 *            String
	 * @param lstMetaData
	 *            List<MetaDataVO>
	 * @return List<MetaDataTableVO>
	 * @author ha.than
	 */
	public List<Map<String, Object>> geDatasByTable(String tableName,
			List<MetaDataVO> lstMetaData) throws COMSException;

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
	public int addCodeTable(String tableName, String[] fields,
			String[] values) throws COMSException;
	
	
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
			String[] values) throws COMSException;
	
	
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
			String[] values) throws COMSException;
}
