/*
 * $Id: CustInforVO.java
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
public class CustInforVO extends BaseModel{
	String custFrstNm;
	String custMidNm;
	String custLstNm;
	String email;
	String addTxt1;
	String addTxt2;
	String addTxt3;
	String addTxt4;
	String zipCode;
	String zipCodeExt;
	String country;
	String ctyTxt;
	String stAbb;
	ArrayList<CustPhnNbrVO> custPhnNbrs;
	boolean billAddress;
	boolean shipAddress;
	String cre8Ts;
	String cre8Uid;
	String updtTs;
	String updtUid;
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
	 * @return the zipCodeExt
	 */
	public String getZipCodeExt() {
		return zipCodeExt;
	}
	/**
	 * @param zipCodeExt the zipCodeExt to set
	 */
	public void setZipCodeExt(String zipCodeExt) {
		this.zipCodeExt = zipCodeExt;
	}
	/**
	 * @return the stAbb
	 */
	public String getStAbb() {
		return stAbb;
	}
	/**
	 * @param stAbb the stAbb to set
	 */
	public void setStAbb(String stAbb) {
		this.stAbb = stAbb;
	}
	/**
	 * @return the ctyTxt
	 */
	public String getCtyTxt() {
		return ctyTxt;
	}
	/**
	 * @param ctyTxt the ctyTxt to set
	 */
	public void setCtyTxt(String ctyTxt) {
		this.ctyTxt = ctyTxt;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the custFrstNm
	 */
	public String getCustFrstNm() {
		return custFrstNm;
	}
	/**
	 * @param custFrstNm the custFrstNm to set
	 */
	public void setCustFrstNm(String custFrstNm) {
		this.custFrstNm = custFrstNm;
	}
	/**
	 * @return the custMidNm
	 */
	public String getCustMidNm() {
		return custMidNm;
	}
	/**
	 * @param custMidNm the custMidNm to set
	 */
	public void setCustMidNm(String custMidNm) {
		this.custMidNm = custMidNm;
	}
	/**
	 * @return the custLstNm
	 */
	public String getCustLstNm() {
		return custLstNm;
	}
	/**
	 * @param custLstNm the custLstNm to set
	 */
	public void setCustLstNm(String custLstNm) {
		this.custLstNm = custLstNm;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the addTxt1
	 */
	public String getAddTxt1() {
		return addTxt1;
	}
	/**
	 * @param addTxt1 the addTxt1 to set
	 */
	public void setAddTxt1(String addTxt1) {
		this.addTxt1 = addTxt1;
	}
	/**
	 * @return the addTxt2
	 */
	public String getAddTxt2() {
		return addTxt2;
	}
	/**
	 * @param addTxt2 the addTxt2 to set
	 */
	public void setAddTxt2(String addTxt2) {
		this.addTxt2 = addTxt2;
	}
	/**
	 * @return the addTxt3
	 */
	public String getAddTxt3() {
		return addTxt3;
	}
	/**
	 * @param addTxt3 the addTxt3 to set
	 */
	public void setAddTxt3(String addTxt3) {
		this.addTxt3 = addTxt3;
	}
	/**
	 * @return the addTxt4
	 */
	public String getAddTxt4() {
		return addTxt4;
	}
	/**
	 * @param addTxt4 the addTxt4 to set
	 */
	public void setAddTxt4(String addTxt4) {
		this.addTxt4 = addTxt4;
	}
	/**
	 * @return the custPhnNbrs
	 */
	public ArrayList<CustPhnNbrVO> getCustPhnNbrs() {
		return custPhnNbrs;
	}
	/**
	 * @param custPhnNbrs the custPhnNbrs to set
	 */
	public void setCustPhnNbrs(ArrayList<CustPhnNbrVO> custPhnNbrs) {
		this.custPhnNbrs = custPhnNbrs;
	}
	/**
	 * @return the billAddress
	 */
	public boolean isBillAddress() {
		return billAddress;
	}
	/**
	 * @param billAddress the billAddress to set
	 */
	public void setBillAddress(boolean billAddress) {
		this.billAddress = billAddress;
	}
	/**
	 * @return the shipAddress
	 */
	public boolean isShipAddress() {
		return shipAddress;
	}
	/**
	 * @param shipAddress the shipAddress to set
	 */
	public void setShipAddress(boolean shipAddress) {
		this.shipAddress = shipAddress;
	}
}
