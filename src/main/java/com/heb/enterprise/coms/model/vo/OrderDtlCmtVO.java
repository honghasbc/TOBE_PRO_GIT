/*
 * $Id: OrderDtlCmtVO.java
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
public class OrderDtlCmtVO extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	long ordId;
	String ordDtlCmtCd;
	String ordDtlCmtTxt;
	String cre8Ts;
	String cre8Uid;
	String lstUpdtTs;
	String lstUpdtUid;
	String ordDtlCmtTypDes;
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
	 * @return the ordDtlCmtCd
	 */
	public String getOrdDtlCmtCd() {
		return ordDtlCmtCd;
	}
	/**
	 * @param ordDtlCmtCd the ordDtlCmtCd to set
	 */
	public void setOrdDtlCmtCd(String ordDtlCmtCd) {
		this.ordDtlCmtCd = ordDtlCmtCd;
	}
	/**
	 * @return the ordDtlCmtTxt
	 */
	public String getOrdDtlCmtTxt() {
		return ordDtlCmtTxt;
	}
	/**
	 * @param ordDtlCmtTxt the ordDtlCmtTxt to set
	 */
	public void setOrdDtlCmtTxt(String ordDtlCmtTxt) {
		this.ordDtlCmtTxt = ordDtlCmtTxt;
	}
	/**
	 * @return the cre8Ts
	 */
	public String getCre8Ts() {
		return cre8Ts;
	}
	/**
	 * @param cre8Ts the cre8Ts to set
	 */
	public void setCre8Ts(String cre8Ts) {
		this.cre8Ts = cre8Ts;
	}
	/**
	 * @return the cre8Uid
	 */
	public String getCre8Uid() {
		return cre8Uid;
	}
	/**
	 * @param cre8Uid the cre8Uid to set
	 */
	public void setCre8Uid(String cre8Uid) {
		this.cre8Uid = cre8Uid;
	}
	/**
	 * @return the lstUpdtTs
	 */
	public String getLstUpdtTs() {
		return lstUpdtTs;
	}
	/**
	 * @param lstUpdtTs the lstUpdtTs to set
	 */
	public void setLstUpdtTs(String lstUpdtTs) {
		this.lstUpdtTs = lstUpdtTs;
	}
	/**
	 * @return the lstUpdtUid
	 */
	public String getLstUpdtUid() {
		return lstUpdtUid;
	}
	/**
	 * @param lstUpdtUid the lstUpdtUid to set
	 */
	public void setLstUpdtUid(String lstUpdtUid) {
		this.lstUpdtUid = lstUpdtUid;
	}
	/**
	 * @return the ordDtlCmtTypDes
	 */
	public String getOrdDtlCmtTypDes() {
		return ordDtlCmtTypDes;
	}
	/**
	 * @param ordDtlCmtTypDes the ordDtlCmtTypDes to set
	 */
	public void setOrdDtlCmtTypDes(String ordDtlCmtTypDes) {
		this.ordDtlCmtTypDes = ordDtlCmtTypDes;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
