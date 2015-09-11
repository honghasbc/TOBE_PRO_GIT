/*
 * $Id: ShipInforVO.java
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
public class ShipInforVO extends BaseModel{
	String fistName;
	String lastName;
	String addLine1;
	String addLine2;
	String cty;
	String state;
	String province;
	String zip;
	String postCode;
	String phoneNbr;
	boolean useAsBillAdd;
	/**
	 * @return the fistName
	 */
	public String getFistName() {
		return fistName;
	}
	/**
	 * @param fistName the fistName to set
	 */
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the addLine1
	 */
	public String getAddLine1() {
		return addLine1;
	}
	/**
	 * @param addLine1 the addLine1 to set
	 */
	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}
	/**
	 * @return the addLine2
	 */
	public String getAddLine2() {
		return addLine2;
	}
	/**
	 * @param addLine2 the addLine2 to set
	 */
	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}
	/**
	 * @return the cty
	 */
	public String getCty() {
		return cty;
	}
	/**
	 * @param cty the cty to set
	 */
	public void setCty(String cty) {
		this.cty = cty;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * @return the phoneNbr
	 */
	public String getPhoneNbr() {
		return phoneNbr;
	}
	/**
	 * @param phoneNbr the phoneNbr to set
	 */
	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}
	/**
	 * @return the useAsBillAdd
	 */
	public boolean isUseAsBillAdd() {
		return useAsBillAdd;
	}
	/**
	 * @param useAsBillAdd the useAsBillAdd to set
	 */
	public void setUseAsBillAdd(boolean useAsBillAdd) {
		this.useAsBillAdd = useAsBillAdd;
	}
	
}
