/*
 * $Id: OrderTypeVO.java
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
public class OrderTypeVO extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ordTypCd;
	private String ordTypAbb;
	private String ordTypDes;
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
	 * @return the ordTypAbb
	 */
	public String getOrdTypAbb() {
		return ordTypAbb;
	}
	/**
	 * @param ordTypAbb the ordTypAbb to set
	 */
	public void setOrdTypAbb(String ordTypAbb) {
		this.ordTypAbb = ordTypAbb;
	}
	/**
	 * @return the ordTypDes
	 */
	public String getOrdTypDes() {
		return ordTypDes;
	}
	/**
	 * @param ordTypDes the ordTypDes to set
	 */
	public void setOrdTypDes(String ordTypDes) {
		this.ordTypDes = ordTypDes;
	}

}
