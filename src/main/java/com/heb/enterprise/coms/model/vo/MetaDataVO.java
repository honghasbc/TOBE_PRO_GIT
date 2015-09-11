/*
 * $Id: CustInforVO.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.model.vo;

import com.heb.enterprise.coms.model.BaseModel;

/**
 * @author ha.than
 */
public class MetaDataVO extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String columnName;
	private String dataTyp;
	private int dataLength;
	private String nullable;
	private String constraintTyp;
	private String columnDesc;
	private String columnData;
	private String title;

	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return this.columnName;
	}

	/**
	 * @param columnName
	 *            the columnName to set
	 */
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	/**
	 * @return the dataTyp
	 */
	public String getDataTyp() {
		return this.dataTyp;
	}

	/**
	 * @param dataTyp
	 *            the dataTyp to set
	 */
	public void setDataTyp(String dataTyp) {
		this.dataTyp = dataTyp;
	}

	/**
	 * @return the dataLength
	 */
	public int getDataLength() {
		return this.dataLength;
	}

	/**
	 * @param dataLength
	 *            the dataLength to set
	 */
	public void setDataLength(int dataLength) {
		this.dataLength = dataLength;
	}

	/**
	 * @return the nullable
	 */
	public String getNullable() {
		return this.nullable;
	}

	/**
	 * @param nullable
	 *            the nullable to set
	 */
	public void setNullable(String nullable) {
		this.nullable = nullable;
	}

	/**
	 * @return the constraintTyp
	 */
	public String getConstraintTyp() {
		return this.constraintTyp;
	}

	/**
	 * @param constraintTyp
	 *            the constraintTyp to set
	 */
	public void setConstraintTyp(String constraintTyp) {
		this.constraintTyp = constraintTyp;
	}

	/**
	 * @return the columnDesc
	 */
	public String getColumnDesc() {
		return this.columnDesc;
	}

	/**
	 * @param columnDesc
	 *            the columnDesc to set
	 */
	public void setColumnDesc(String columnDesc) {
		this.columnDesc = columnDesc;
	}

	/**
	 * @return the columnData
	 */
	public String getColumnData() {
		return columnData;
	}

	/**
	 * @param columnData
	 *            the columnData to set
	 */
	public void setColumnData(String columnData) {
		this.columnData = columnData;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
}
