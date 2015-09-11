/*
 * $Id: OrdDetailVO.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.model.vo;

import java.util.ArrayList;

import com.heb.enterprise.coms.model.BaseModel;

/**
 * author ha.than
 */
public class OrdDetailVO extends BaseModel{
	long ordId;
	String ordDtlEntyTypCd;
	String ordDtlKey;
	String ordDtlSeqNbr;
	int ordQty;
	float unitReailAmt; 
	float taxRtPct;
	float totRetlAmt;
	float totDiscAmt;
	float totTaxAmt;
	float totNetAmt;
	String cre8Ts;
	String cre8Uid;
	String lsttUpdtTs;
	String lstUpdtUid;
	int custShpngId;
	String ordDtlStatDes;
	ArrayList<OrderDtlCmtVO>  orderDtlCmtVOs = new ArrayList<OrderDtlCmtVO>();
	/**
	 * @return the ordDtlStatDes
	 */
	public String getOrdDtlStatDes() {
		return ordDtlStatDes;
	}
	/**
	 * @param ordDtlStatDes the ordDtlStatDes to set
	 */
	public void setOrdDtlStatDes(String ordDtlStatDes) {
		this.ordDtlStatDes = ordDtlStatDes;
	}
	/**
	 * @return the unitReailAmt
	 */
	public float getUnitReailAmt() {
		return unitReailAmt;
	}
	/**
	 * @param unitReailAmt the unitReailAmt to set
	 */
	public void setUnitReailAmt(float unitReailAmt) {
		this.unitReailAmt = unitReailAmt;
	}
	/**
	 * @return the ordQty
	 */
	public int getOrdQty() {
		return ordQty;
	}
	/**
	 * @param ordQty the ordQty to set
	 */
	public void setOrdQty(int ordQty) {
		this.ordQty = ordQty;
	}
	/**
	 * @return the custShpngId
	 */
	public int getCustShpngId() {
		return custShpngId;
	}
	/**
	 * @param custShpngId the custShpngId to set
	 */
	public void setCustShpngId(int custShpngId) {
		this.custShpngId = custShpngId;
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
	 * @return the ordDtlEntyTypCd
	 */
	public String getOrdDtlEntyTypCd() {
		return ordDtlEntyTypCd;
	}
	/**
	 * @param ordDtlEntyTypCd the ordDtlEntyTypCd to set
	 */
	public void setOrdDtlEntyTypCd(String ordDtlEntyTypCd) {
		this.ordDtlEntyTypCd = ordDtlEntyTypCd;
	}
	/**
	 * @return the ordDtlKey
	 */
	public String getOrdDtlKey() {
		return ordDtlKey;
	}
	/**
	 * @param ordDtlKey the ordDtlKey to set
	 */
	public void setOrdDtlKey(String ordDtlKey) {
		this.ordDtlKey = ordDtlKey;
	}
	/**
	 * @return the ordDtlSeqNbr
	 */
	public String getOrdDtlSeqNbr() {
		return ordDtlSeqNbr;
	}
	/**
	 * @param ordDtlSeqNbr the ordDtlSeqNbr to set
	 */
	public void setOrdDtlSeqNbr(String ordDtlSeqNbr) {
		this.ordDtlSeqNbr = ordDtlSeqNbr;
	}
	/**
	 * @return the taxRtPct
	 */
	public float getTaxRtPct() {
		return taxRtPct;
	}
	/**
	 * @param taxRtPct the taxRtPct to set
	 */
	public void setTaxRtPct(float taxRtPct) {
		this.taxRtPct = taxRtPct;
	}
	/**
	 * @return the totRetlAmt
	 */
	public float getTotRetlAmt() {
		return totRetlAmt;
	}
	/**
	 * @param totRetlAmt the totRetlAmt to set
	 */
	public void setTotRetlAmt(float totRetlAmt) {
		this.totRetlAmt = totRetlAmt;
	}
	/**
	 * @return the totDiscAmt
	 */
	public float getTotDiscAmt() {
		return totDiscAmt;
	}
	/**
	 * @param totDiscAmt the totDiscAmt to set
	 */
	public void setTotDiscAmt(float totDiscAmt) {
		this.totDiscAmt = totDiscAmt;
	}
	/**
	 * @return the totTaxAmt
	 */
	public float getTotTaxAmt() {
		return totTaxAmt;
	}
	/**
	 * @param totTaxAmt the totTaxAmt to set
	 */
	public void setTotTaxAmt(float totTaxAmt) {
		this.totTaxAmt = totTaxAmt;
	}
	/**
	 * @return the totNetAmt
	 */
	public float getTotNetAmt() {
		return totNetAmt;
	}
	/**
	 * @param totNetAmt the totNetAmt to set
	 */
	public void setTotNetAmt(float totNetAmt) {
		this.totNetAmt = totNetAmt;
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
	 * @return the lsttUpdtTs
	 */
	public String getLsttUpdtTs() {
		return lsttUpdtTs;
	}
	/**
	 * @param lsttUpdtTs the lsttUpdtTs to set
	 */
	public void setLsttUpdtTs(String lsttUpdtTs) {
		this.lsttUpdtTs = lsttUpdtTs;
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
	
}
