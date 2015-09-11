/*
 * $Id: CustomerInformationVO.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.model.co;

import java.util.ArrayList;
import java.util.List;

import com.heb.enterprise.coms.model.BaseModel;

/**
 * author ha.than
 */
public class CustomerInformationCO extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long ordId;
	private String custFrstNm;
	private String custMidNm;
	private String custLstNm;
	private String email;
	private String addTxt1;
	private String addTxt2;
	private String addTxt3;
	private String addTxt4;
	private String zipCode;
	private String zipCodeExt;
	private String country;
	private String ctyTxt;
	private String stAbb;
	private boolean billAddress;
	private boolean shipAddress;
	private List<CustomerPhoneCO> phones;
	
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
	/**
	 * @return the phones
	 */
	public List<CustomerPhoneCO> getPhones() {
		return phones;
	}
	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<CustomerPhoneCO> phones) {
		this.phones = phones;
	}
	
	
	
}
