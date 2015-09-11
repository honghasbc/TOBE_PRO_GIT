/*
 * $Id: OrderHdrStatVO.java
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
public class OrderHdrStatVO extends BaseModel{
	private String ordHdrStatCd;
	private String ordHdrStatAbb;
	private String ordHdrStatDes;
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
	/**
	 * @return the ordHdrStatAbb
	 */
	public String getOrdHdrStatAbb() {
		return ordHdrStatAbb;
	}
	/**
	 * @param ordHdrStatAbb the ordHdrStatAbb to set
	 */
	public void setOrdHdrStatAbb(String ordHdrStatAbb) {
		this.ordHdrStatAbb = ordHdrStatAbb;
	}
	/**
	 * @return the ordHdrStatDes
	 */
	public String getOrdHdrStatDes() {
		return ordHdrStatDes;
	}
	/**
	 * @param ordHdrStatDes the ordHdrStatDes to set
	 */
	public void setOrdHdrStatDes(String ordHdrStatDes) {
		this.ordHdrStatDes = ordHdrStatDes;
	}
	
}
