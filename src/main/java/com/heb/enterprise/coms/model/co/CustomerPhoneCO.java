/*
 * $Id: CustomerPhoneCO.java
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
public class CustomerPhoneCO extends BaseModel{
	
	String phnTypCd;
	String phnCntryCd;
	String phnAreaCd;
	String phnNbr;
	String phnExtnNbr;
	
	/**
	 * @return the phnTypCd
	 */
	public String getPhnTypCd() {
		return phnTypCd;
	}
	/**
	 * @param phnTypCd the phnTypCd to set
	 */
	public void setPhnTypCd(String phnTypCd) {
		this.phnTypCd = phnTypCd;
	}
	
	/**
	 * @return the phnCntryCd
	 */
	public String getPhnCntryCd() {
		return phnCntryCd;
	}
	/**
	 * @param phnCntryCd the phnCntryCd to set
	 */
	public void setPhnCntryCd(String phnCntryCd) {
		this.phnCntryCd = phnCntryCd;
	}
	/**
	 * @return the phnAreaCd
	 */
	public String getPhnAreaCd() {
		return phnAreaCd;
	}
	/**
	 * @param phnAreaCd the phnAreaCd to set
	 */
	public void setPhnAreaCd(String phnAreaCd) {
		this.phnAreaCd = phnAreaCd;
	}
	/**
	 * @return the phnNbr
	 */
	public String getPhnNbr() {
		return phnNbr;
	}
	/**
	 * @param phnNbr the phnNbr to set
	 */
	public void setPhnNbr(String phnNbr) {
		this.phnNbr = phnNbr;
	}
	/**
	 * @return the phnExtnNbr
	 */
	public String getPhnExtnNbr() {
		return phnExtnNbr;
	}
	/**
	 * @param phnExtnNbr the phnExtnNbr to set
	 */
	public void setPhnExtnNbr(String phnExtnNbr) {
		this.phnExtnNbr = phnExtnNbr;
	}
}
