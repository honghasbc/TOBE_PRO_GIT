/*
 * $Id: OrderingSystemVO.java
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
public class OrderingSystemVO extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String time;
	private String ordSrsCd;
	private String ordSrsCdError;
	private int countOrd;
	private int countOrdError;
	
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
	 * @return the ordSrsCd
	 */
	public String getOrdSrsCd() {
		return ordSrsCd;
	}
	/**
	 * @param ordSrsCd the ordSrsCd to set
	 */
	public void setOrdSrsCd(String ordSrsCd) {
		this.ordSrsCd = ordSrsCd;
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
	 * @return the ordSrsCdError
	 */
	public String getOrdSrsCdError() {
		return ordSrsCdError;
	}
	/**
	 * @param ordSrsCdError the ordSrsCdError to set
	 */
	public void setOrdSrsCdError(String ordSrsCdError) {
		this.ordSrsCdError = ordSrsCdError;
	}
	/**
	 * @return the countOrdError
	 */
	public int getCountOrdError() {
		return countOrdError;
	}
	/**
	 * @param countOrdError the countOrdError to set
	 */
	public void setCountOrdError(int countOrdError) {
		this.countOrdError = countOrdError;
	}
}
