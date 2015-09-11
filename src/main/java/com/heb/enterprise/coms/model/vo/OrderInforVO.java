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
public class OrderInforVO extends BaseModel{
	
	long ordId;
	String ordDes;
	String ordTypCd;
	String ordStat;
	String ordSrcCd;
	int subOrd;
	String cre8Ts;
	String cre8Uid;
	String updtTs;
	String updtUid;
	String note;
	String ordSrcDes;
	String ordTypDes;
	String ordStatDes;
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
	 * @return the ordDes
	 */
	public String getOrdDes() {
		return ordDes;
	}
	/**
	 * @param ordDes the ordDes to set
	 */
	public void setOrdDes(String ordDes) {
		this.ordDes = ordDes;
	}
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
	 * @return the ordStat
	 */
	public String getOrdStat() {
		return ordStat;
	}
	/**
	 * @param ordStat the ordStat to set
	 */
	public void setOrdStat(String ordStat) {
		this.ordStat = ordStat;
	}
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
	 * @return the subOrd
	 */
	public int getSubOrd() {
		return subOrd;
	}
	/**
	 * @param subOrd the subOrd to set
	 */
	public void setSubOrd(int subOrd) {
		this.subOrd = subOrd;
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
	 * @return the updtTs
	 */
	public String getUpdtTs() {
		return updtTs;
	}
	/**
	 * @param updtTs the updtTs to set
	 */
	public void setUpdtTs(String updtTs) {
		this.updtTs = updtTs;
	}
	/**
	 * @return the updtUid
	 */
	public String getUpdtUid() {
		return updtUid;
	}
	/**
	 * @param updtUid the updtUid to set
	 */
	public void setUpdtUid(String updtUid) {
		this.updtUid = updtUid;
	}
	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}
	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
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
	/**
	 * @return the ordStatDes
	 */
	public String getOrdStatDes() {
		return ordStatDes;
	}
	/**
	 * @param ordStatDes the ordStatDes to set
	 */
	public void setOrdStatDes(String ordStatDes) {
		this.ordStatDes = ordStatDes;
	}
	
}
