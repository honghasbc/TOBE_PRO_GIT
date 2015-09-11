/*
 * $Id: IndivOrdStatisticVO.java
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
public class IndivOrdStatisticVO extends BaseModel{
	OrderInforVO orderInforVO;
	CustInforVO custInforVO;
	ArrayList<OrdDetailVO> ordDetailVOs;
	ArrayList<BillInforVO> billInforVOs;
	int itmCnt;
	float ordTotDiscAmt;
	float ordNetAmt;
	float ordTotShpngAmt;
	float ordEstTaxAmt;
	float ordSubTotAmt;
	float totPymtAmt;
	ArrayList<OrderCmtVO>  orderCmtVOs = new ArrayList<OrderCmtVO>();
	ArrayList<OrderStatHistVO>  orderStatHistVOs = new ArrayList<OrderStatHistVO>();
	/**
	 * @return the orderStatHistVOs
	 */
	public ArrayList<OrderStatHistVO> getOrderStatHistVOs() {
		return orderStatHistVOs;
	}
	/**
	 * @param orderStatHistVOs the orderStatHistVOs to set
	 */
	public void setOrderStatHistVOs(ArrayList<OrderStatHistVO> orderStatHistVOs) {
		this.orderStatHistVOs = orderStatHistVOs;
	}
	/**
	 * @return the orderCmtVOs
	 */
	public ArrayList<OrderCmtVO> getOrderCmtVOs() {
		return orderCmtVOs;
	}
	/**
	 * @param orderCmtVOs the orderCmtVOs to set
	 */
	public void setOrderCmtVOs(ArrayList<OrderCmtVO> orderCmtVOs) {
		this.orderCmtVOs = orderCmtVOs;
	}
	/**
	 * @return the itmCnt
	 */
	public int getItmCnt() {
		return itmCnt;
	}
	/**
	 * @param itmCnt the itmCnt to set
	 */
	public void setItmCnt(int itmCnt) {
		this.itmCnt = itmCnt;
	}
	/**
	 * @return the totPymtAmt
	 */
	public float getTotPymtAmt() {
		return totPymtAmt;
	}
	/**
	 * @param totPymtAmt the totPymtAmt to set
	 */
	public void setTotPymtAmt(float totPymtAmt) {
		this.totPymtAmt = totPymtAmt;
	}
	/**
	 * @return the ordTotDiscAmt
	 */
	public float getOrdTotDiscAmt() {
		return ordTotDiscAmt;
	}
	/**
	 * @param ordTotDiscAmt the ordTotDiscAmt to set
	 */
	public void setOrdTotDiscAmt(float ordTotDiscAmt) {
		this.ordTotDiscAmt = ordTotDiscAmt;
	}
	/**
	 * @return the ordNetAmt
	 */
	public float getOrdNetAmt() {
		return ordNetAmt;
	}
	/**
	 * @param ordNetAmt the ordNetAmt to set
	 */
	public void setOrdNetAmt(float ordNetAmt) {
		this.ordNetAmt = ordNetAmt;
	}
	/**
	 * @return the ordTotShpngAmt
	 */
	public float getOrdTotShpngAmt() {
		return ordTotShpngAmt;
	}
	/**
	 * @param ordTotShpngAmt the ordTotShpngAmt to set
	 */
	public void setOrdTotShpngAmt(float ordTotShpngAmt) {
		this.ordTotShpngAmt = ordTotShpngAmt;
	}
	/**
	 * @return the ordEstTaxAmt
	 */
	public float getOrdEstTaxAmt() {
		return ordEstTaxAmt;
	}
	/**
	 * @param ordEstTaxAmt the ordEstTaxAmt to set
	 */
	public void setOrdEstTaxAmt(float ordEstTaxAmt) {
		this.ordEstTaxAmt = ordEstTaxAmt;
	}
	/**
	 * @return the ordSubTotAmt
	 */
	public float getOrdSubTotAmt() {
		return ordSubTotAmt;
	}
	/**
	 * @param ordSubTotAmt the ordSubTotAmt to set
	 */
	public void setOrdSubTotAmt(float ordSubTotAmt) {
		this.ordSubTotAmt = ordSubTotAmt;
	}
	/**
	 * @return the billInforVOs
	 */
	public ArrayList<BillInforVO> getBillInforVOs() {
		return billInforVOs;
	}
	/**
	 * @param billInforVOs the billInforVOs to set
	 */
	public void setBillInforVOs(ArrayList<BillInforVO> billInforVOs) {
		this.billInforVOs = billInforVOs;
	}
	/**
	 * @return the orderInforVO
	 */
	public OrderInforVO getOrderInforVO() {
		return orderInforVO;
	}
	/**
	 * @param orderInforVO the orderInforVO to set
	 */
	public void setOrderInforVO(OrderInforVO orderInforVO) {
		this.orderInforVO = orderInforVO;
	}
	/**
	 * @return the custInforVO
	 */
	public CustInforVO getCustInforVO() {
		return custInforVO;
	}
	/**
	 * @param custInforVO the custInforVO to set
	 */
	public void setCustInforVO(CustInforVO custInforVO) {
		this.custInforVO = custInforVO;
	}
	/**
	 * @return the ordDetailVOs
	 */
	public ArrayList<OrdDetailVO> getOrdDetailVOs() {
		return ordDetailVOs;
	}
	/**
	 * @param ordDetailVOs the ordDetailVOs to set
	 */
	public void setOrdDetailVOs(ArrayList<OrdDetailVO> ordDetailVOs) {
		this.ordDetailVOs = ordDetailVOs;
	}
	
}
