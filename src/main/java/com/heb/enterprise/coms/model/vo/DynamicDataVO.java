/*
 * $Id: DynamicDataVO.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.model.vo;

import java.util.List;

import com.heb.enterprise.coms.model.BaseModel;

/**
 * @author ha.than
 */
public class DynamicDataVO extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<MetaDataVO> data;
	private String tableName;
	private String tableLabel;

	/**
	 * @return the data
	 */
	public List<MetaDataVO> getData() {
		return this.data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(List<MetaDataVO> data) {
		this.data = data;
	}

	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return this.tableName;
	}

	/**
	 * @param tableName
	 *            the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * @return the tableLabel
	 */
	public String getTableLabel() {
		return this.tableLabel;
	}

	/**
	 * @param tableLabel
	 *            the tableLabel to set
	 */
	public void setTableLabel(String tableLabel) {
		this.tableLabel = tableLabel;
	}

}
