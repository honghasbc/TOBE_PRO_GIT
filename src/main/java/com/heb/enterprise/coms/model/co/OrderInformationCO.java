/*
 * $Id: OrderInformationCO.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.model.co;

import com.heb.enterprise.coms.model.BaseModel;

/**
 * author ha.than
 */
public class OrderInformationCO extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long ordId;
	private String ordDes;

	
	/**
	 * @return the ordId
	 */
	public long getOrdId() {
		return ordId;
	}

	/**
	 * @param ordId the ordId to set
	 */
	public void setOrdId(long ordId) {
		this.ordId = ordId;
	}

	/**
	 * @return the ordDes
	 */
	public String getOrdDes() {
		return ordDes;
	}

	/**
	 * @param ordDes the ordDes to set
	 */
	public void setOrdDes(String ordDes) {
		this.ordDes = ordDes;
	}
	
	
	
}
