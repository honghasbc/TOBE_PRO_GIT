/*
 * $Id: FullfillmentVO.java
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
public class FullfillmentVO extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String time;
	private String inStore;
	private String ecomDistCenter;
	private String warehouse;
	private String vendor;
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the inStore
	 */
	public String getInStore() {
		return inStore;
	}
	/**
	 * @param inStore the inStore to set
	 */
	public void setInStore(String inStore) {
		this.inStore = inStore;
	}
	/**
	 * @return the ecomDistCenter
	 */
	public String getEcomDistCenter() {
		return ecomDistCenter;
	}
	/**
	 * @param ecomDistCenter the ecomDistCenter to set
	 */
	public void setEcomDistCenter(String ecomDistCenter) {
		this.ecomDistCenter = ecomDistCenter;
	}
	/**
	 * @return the warehouse
	 */
	public String getWarehouse() {
		return warehouse;
	}
	/**
	 * @param warehouse the warehouse to set
	 */
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	/**
	 * @return the vendor
	 */
	public String getVendor() {
		return vendor;
	}
	/**
	 * @param vendor the vendor to set
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
