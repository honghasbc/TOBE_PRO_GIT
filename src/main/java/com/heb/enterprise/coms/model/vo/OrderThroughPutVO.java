/*
 * $Id: OrderThroughPutVO.java
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
public class OrderThroughPutVO extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cre8Ts;
	private int orders;
	/**
	 * @return the orders
	 */
	public int getOrders() {
		return orders;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(int orders) {
		this.orders = orders;
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
}
