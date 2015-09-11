/*
 * $Id: CodeTablesParser.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.utils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.beanutils.BeanUtils;

import com.heb.enterprise.coms.model.vo.DynamicDataVO;
import com.heb.enterprise.coms.model.vo.MetaDataVO;

public class CodeTablesParser {

	/**
	 * function get list code table from properties field
	 * 
	 * @throws Exception
	 * @return List<String>
	 * @author ha.than
	 * @throws IOException
	 */
	public List<String> getCdTblsFromPropsFile() throws IOException {
		List<String> ret = new ArrayList<String>();

		InputStream inputStream = this.getClass().getResourceAsStream(
				Constants.CODE_TABLES_PROPERTIES);
		Properties tempProps = new Properties();
		tempProps.load(inputStream);
		String key;
		String strTable = null;
		for (Iterator<Object> i = tempProps.keySet().iterator(); i.hasNext();) {
			key = (String) i.next();
			if (key.equals(Constants.TABLES_KEY)) {
				strTable = tempProps.getProperty(key);
				break;
			}
		}

		if (strTable != null && !strTable.trim().isEmpty()) {
			for (String tbl : strTable.split(",")) {
				ret.add(tbl);
			}
		}
		return ret;
	}

	/**
	 * function get list field description for code table from properties field
	 * 
	 * @param tableName
	 *            String
	 * @throws Exception
	 * @return Map<String, String>
	 * @author ha.than
	 */
	public void bindDescForMetaDatas(String tableName, List<MetaDataVO> lst,
			DynamicDataVO dynamic) throws Exception {
		InputStream inputStream = this.getClass().getResourceAsStream(
				Constants.CODE_TABLES_PROPERTIES);
		Properties tempProps = new Properties();
		tempProps.load(inputStream);
		String key;
		for (Iterator<Object> i = tempProps.keySet().iterator(); i.hasNext();) {
			key = (String) i.next();
			for (MetaDataVO meta : lst) {
				if (key.equals(tableName + Constants.DOT + meta.getColumnName())) {
					meta.setColumnDesc(tempProps.getProperty(key));
				}
				if (key.equals(tableName + Constants.DOT + Constants.STR_TITLE)) {
					dynamic.setTableLabel(tempProps.getProperty(key));
				}
			}
		}
		dynamic.setData(lst);
	}

	/**
	 * function get string Table By list MetaData
	 * 
	 * @param lstMetaData
	 *            List<MetaDataVO>
	 * @return String
	 * @author ha.than
	 */
	public static String getStrTableByLstMetaData(List<MetaDataVO> lstMetaData) {
		String ret = "";
		for (MetaDataVO metaData : lstMetaData) {
			ret += metaData.getColumnName() + ",";
		}
		if (ret != null && !ret.trim().isEmpty()) {
			ret = ret.substring(0, ret.length() - 1);
			ret = ret.trim();
		}
		return ret;
	}

	/**
	 * function convert list Map To list DynamicDataVO.
	 * 
	 * @param lstMetaData
	 *            List<MetaDataVO>
	 * @param rows
	 *            List<Map<String, Object>>
	 * @return List<DynamicDataVO>
	 * @author ha.than
	 */
	public static List<DynamicDataVO> convertLstMapToLstDynamic(
			List<MetaDataVO> lstMetaData, List<Map<String, Object>> rows) {
		List<DynamicDataVO> ret = new ArrayList<DynamicDataVO>();
		List<MetaDataVO> lstData = null;
		DynamicDataVO dynamicData = null;
		for (Map<String, Object> map : rows) {
			dynamicData = new DynamicDataVO();
			lstData = new ArrayList<MetaDataVO>();
			for (MetaDataVO metaData : lstMetaData) {
				lstData.add(CodeTablesParser.createMetaData(metaData,
						(String) map.get(metaData.getColumnName())));
			}
			dynamicData.setData(lstData);
			ret.add(dynamicData);
		}
		return ret;
	}

	/**
	 * create metadata for codeTable.
	 * 
	 * @param columnName
	 * @param columnData
	 * @return MetaDataVO
	 * @author ha.than
	 */
	private static MetaDataVO createMetaData(MetaDataVO metaDataOld,
			String columnData) {
		MetaDataVO metaData = null;
		try {
			metaData = (MetaDataVO) BeanUtils.cloneBean(metaDataOld);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		if (metaData != null && columnData != null
				&& !columnData.trim().isEmpty()) {
			metaData.setColumnData(columnData.trim());
		}
		return metaData;
	}

}
