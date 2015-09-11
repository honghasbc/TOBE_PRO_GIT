/*
 * $Id: OrderStatHistVO.java
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
public class OrderStatHistVO extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	long ordId;
	String ordStatTs;
	String ordHdrStatCd;
	String ordStatUsrId;
	String cre8Ts;
	String cre8Uid;
	String ordHdrStatDes;
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
	 * @return the ordStatTs
	 */
	public String getOrdStatTs() {
		return ordStatTs;
	}
	/**
	 * @param ordStatTs the ordStatTs to set
	 */
	public void setOrdStatTs(String ordStatTs) {
		this.ordStatTs = ordStatTs;
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
	/**
	 * @return the ordStatUsrId
	 */
	public String getOrdStatUsrId() {
		return ordStatUsrId;
	}
	/**
	 * @param ordStatUsrId the ordStatUsrId to set
	 */
	public void setOrdStatUsrId(String ordStatUsrId) {
		this.ordStatUsrId = ordStatUsrId;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
