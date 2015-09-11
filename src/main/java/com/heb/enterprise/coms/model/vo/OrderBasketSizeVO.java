/*
 * $Id: OrderBasketSizeVO.java
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
public class OrderBasketSizeVO extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String time;
	private int max;
	private int min;
	private double averageBasketSize;
	private double dollarValue;
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
	 * @return the max
	 */
	public int getMax() {
		return max;
	}
	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}
	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}
	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}
	/**
	 * @return the averageBasketSize
	 */
	public double getAverageBasketSize() {
		return averageBasketSize;
	}
	/**
	 * @param averageBasketSize the averageBasketSize to set
	 */
	public void setAverageBasketSize(double averageBasketSize) {
		this.averageBasketSize = averageBasketSize;
	}
	/**
	 * @return the dollarValue
	 */
	public double getDollarValue() {
		return dollarValue;
	}
	/**
	 * @param dollarValue the dollarValue to set
	 */
	public void setDollarValue(double dollarValue) {
		this.dollarValue = dollarValue;
	}
	
	
}
