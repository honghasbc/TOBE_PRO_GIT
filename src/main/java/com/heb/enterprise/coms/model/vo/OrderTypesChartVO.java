/*
 * $Id: OrderTypesChartVO.java
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
 * author ha.than
 */
public class OrderTypesChartVO extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String time;
	private String ordTypCd;
	private int countOrd;
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the ordTypCd
	 */
	public String getOrdTypCd() {
		return ordTypCd;
	}
	/**
	 * @param ordTypCd the ordTypCd to set
	 */
	public void setOrdTypCd(String ordTypCd) {
		this.ordTypCd = ordTypCd;
	}
	/**
	 * @return the countOrd
	 */
	public int getCountOrd() {
		return countOrd;
	}
	/**
	 * @param countOrd the countOrd to set
	 */
	public void setCountOrd(int countOrd) {
		this.countOrd = countOrd;
	}
	

}
