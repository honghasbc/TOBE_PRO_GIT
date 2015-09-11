/*
 * $Id: OrdersDAOImpl.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.heb.enterprise.coms.dao.CodeTablesDAO;
import com.heb.enterprise.coms.dao.mapper.CodeTablesMapper;
import com.heb.enterprise.coms.model.vo.MetaDataVO;
import com.heb.enterprise.coms.utils.COMSException;
import com.heb.enterprise.coms.utils.CodeTablesParser;
import com.heb.enterprise.coms.utils.CommonFunction;
import com.heb.enterprise.coms.utils.Constants;

/**
 * @author ha.than
 * 
 */
@Repository(Constants.CODE_TABLES_DAO)
public class CodeTablesDAOImpl extends BaseDAOImpl implements CodeTablesDAO {

	private Log log = LogFactory.getLog(CodeTablesDAOImpl.class);

	/**
	 * function get meta data column by table
	 * 
	 * @param tableName
	 *            String
	 * @return List<MetaDataTableVO>
	 * @author ha.than
	 */
	@Override
	public List<MetaDataVO> getMetaDatasByTable(String tableName)
			throws COMSException {
		return null;
	}

	/**
	 * function get data by table name
	 * 
	 * @param tableName
	 *            String
	 * @param lstMetaData
	 *            List<MetaDataVO>
	 * @return List<Map<String, Object>>
	 * @author ha.than
	 */
	@Override
	public List<Map<String, Object>> geDatasByTable(String tableName,
			List<MetaDataVO> lstMetaData) throws COMSException {
		return null;
	}

	@Override
	public int addCodeTable(String tableName, String[] fields, String[] values)
			throws COMSException {
		return 0;
	}

	@Override
	public int updateCodeTable(String tableName, String[] fields,
			String[] values) throws COMSException {
		return 0;
	}

	@Override
	public int deleteCodeTable(String tableName, String[] fields,
			String[] values) throws COMSException {
		return 0;
	}
}
