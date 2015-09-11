/*
 * $Id: OrderInforVO.java
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
public class CustPhnNbrVO extends BaseModel{
	
	long ordId;
	String phnTypCd;
	String phnTypDes;
	String phnCntryCd;
	String phnAreaCd;
	String phnNbr;
	String phnExtnNbr;
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
	 * @return the phnTypDes
	 */
	public String getPhnTypDes() {
		return phnTypDes;
	}
	/**
	 * @param phnTypDes the phnTypDes to set
	 */
	public void setPhnTypDes(String phnTypDes) {
		this.phnTypDes = phnTypDes;
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
