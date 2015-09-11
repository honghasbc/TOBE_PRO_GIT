/*
 * $Id: OrderCmtVO.java
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
public class OrderCmtVO extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	long ordId;
	String ordCmtCd;
	String ordCmtTxt;
	String cre8Ts;
	String cre8Uid;
	String lstUpdtTs;
	String lstUpdtUid;
	String ordCmtTypDes;
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
	 * @return the ordCmtCd
	 */
	public String getOrdCmtCd() {
		return ordCmtCd;
	}
	/**
	 * @param ordCmtCd the ordCmtCd to set
	 */
	public void setOrdCmtCd(String ordCmtCd) {
		this.ordCmtCd = ordCmtCd;
	}
	/**
	 * @return the ordCmtTxt
	 */
	public String getOrdCmtTxt() {
		return ordCmtTxt;
	}
	/**
	 * @param ordCmtTxt the ordCmtTxt to set
	 */
	public void setOrdCmtTxt(String ordCmtTxt) {
		this.ordCmtTxt = ordCmtTxt;
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
	 * @return the ordCmtTypDes
	 */
	public String getOrdCmtTypDes() {
		return ordCmtTypDes;
	}
	/**
	 * @param ordCmtTypDes the ordCmtTypDes to set
	 */
	public void setOrdCmtTypDes(String ordCmtTypDes) {
		this.ordCmtTypDes = ordCmtTypDes;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
