/*
 * $Id: OrderSrcVO.java
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
public class OrderSrcVO extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ordSrcCd;
	private String ordSrcAbb;
	private String ordSrcDes;
	/**
	 * @return the ordSrcCd
	 */
	public String getOrdSrcCd() {
		return ordSrcCd;
	}
	/**
	 * @param ordSrcCd the ordSrcCd to set
	 */
	public void setOrdSrcCd(String ordSrcCd) {
		this.ordSrcCd = ordSrcCd;
	}
	/**
	 * @return the ordSrcAbb
	 */
	public String getOrdSrcAbb() {
		return ordSrcAbb;
	}
	/**
	 * @param ordSrcAbb the ordSrcAbb to set
	 */
	public void setOrdSrcAbb(String ordSrcAbb) {
		this.ordSrcAbb = ordSrcAbb;
	}
	/**
	 * @return the ordSrcDes
	 */
	public String getOrdSrcDes() {
		return ordSrcDes;
	}
	/**
	 * @param ordSrcDes the ordSrcDes to set
	 */
	public void setOrdSrcDes(String ordSrcDes) {
		this.ordSrcDes = ordSrcDes;
	}
	
}
