/*
 * $Id: OrderStatusVO.java
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
public class OrderStatusVO extends BaseModel{
	private String time;
	private String ordHdrStatCd;
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
	/**
	 * @return the ordHdrStatCd
	 */
	public String getOrdHdrStatCd() {
		return ordHdrStatCd;
	}
	/**
	 * @param ordHdrStatCd the ordHdrStatCd to set
	 */
	public void setOrdHdrStatCd(String ordHdrStatCd) {
		this.ordHdrStatCd = ordHdrStatCd;
	}
	

}
