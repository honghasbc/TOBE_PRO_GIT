/*
 * $Id: OrdersDAO.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dao;

import java.util.List;

import com.heb.enterprise.coms.model.co.OrderInformationCO;
import com.heb.enterprise.coms.model.vo.FullfillmentVO;
import com.heb.enterprise.coms.model.vo.IndivOrdStatisticVO;
import com.heb.enterprise.coms.model.vo.OrdDetailVO;
import com.heb.enterprise.coms.model.vo.OrderBasketSizeVO;
import com.heb.enterprise.coms.model.vo.OrderCmtVO;
import com.heb.enterprise.coms.model.vo.OrderHdrStatVO;
import com.heb.enterprise.coms.model.vo.OrderSrcVO;
import com.heb.enterprise.coms.model.vo.OrderStatHistVO;
import com.heb.enterprise.coms.model.vo.OrderStatusVO;
import com.heb.enterprise.coms.model.vo.OrderThroughPutVO;
import com.heb.enterprise.coms.model.vo.OrderTypeVO;
import com.heb.enterprise.coms.model.vo.OrderTypesChartVO;
import com.heb.enterprise.coms.model.vo.OrderingSystemVO;
import com.heb.enterprise.coms.utils.COMSException;

/**
 * @author ha.than
 * 
 */
public interface OrdersDAO extends BaseDAO {
	/**
	 * get list OrderBasketSizeVO by range
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderBasketSizeVO>
	 * @author ha.than
	 */
	public List<OrderBasketSizeVO> orderBasketSizes(String fromDate,String toDate)throws COMSException ;
	/**
	 * get list OrderThroughPutVO by range
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderThroughPutVO>
	 * @author ha.than
	 */
	public List<OrderThroughPutVO> getOrdThrPutByRag(String fromDate,String toDate)  throws COMSException;
	/**
	 * get list OrderThroughPutVO by date
	 * @param date
	 * @return List<OrderThroughPutVO>
	 * @author ha.than
	 */
	public List<OrderThroughPutVO> getOrdThrPutByDate(String date)  throws COMSException;
	
	/**
	 * get all OrderType
	 * @return List<OrderTypeVO>
	 * @author ha.than
	 */
	public List<OrderTypeVO> getOrderTypeVOs() throws COMSException ;
	/**
	 * get all OrderTypes of chart by range
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderTypesChartVO>
	 * @author ha.than
	 */
	public List<OrderTypesChartVO> getAllOrdTypes(String fromDate,String toDate) throws COMSException;
	/**
	 * get list OrderingSystemVO by range
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderingSystemVO>
	 * @author ha.than
	 */
	public List<OrderingSystemVO> getOrderingSystems(String fromDate,String toDate) throws COMSException;
	/**
	 * get all OrderHdrStatVO
	 * @return List<OrderHdrStatVO>
	 * @author ha.than
	 */
	public List<OrderHdrStatVO> getOrderHdrStatVOs() throws COMSException ;
	/**
	 * get all OrderStatusVO of chart by range
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderStatusVO>
	 * @author ha.than
	 */
	public List<OrderStatusVO> getAllOrderStatus(String fromDate,String toDate) throws COMSException;
	/**
	 * get all OrderSrc
	 * @return List<OrderTypeVO>
	 * @author ha.than
	 */
	public List<OrderSrcVO> getOrderSrcVOs() throws COMSException;
	/**
	 * get all individual orderstatistic by ordId
	 * @param ordId
	 * @return IndivOrdStatisticVO
	 * @author ha.than
	 */
	public IndivOrdStatisticVO getIndivOrdStattById(long ordId) throws COMSException ;
	
	/**
	 * get all order Detail by ordId
	 * @param ordId
	 * @return List<CustPhnNbrVO>
	 * @author ha.than
	 */
	public List<OrdDetailVO> getOrdDetailById(long ordId) throws COMSException;
	/**
	 * get all order comments by ordId
	 * @param ordId
	 * @return List<OrderCmtVO>
	 * @author ha.than
	 */
	public List<OrderCmtVO> getOrdCmmtById(long ordId) throws COMSException ;
	/**
	 * get all order status history by ordId
	 * @param ordId
	 * @return List<OrderStatHistVO>
	 * @author ha.than
	 */
	public List<OrderStatHistVO> getOrdStatHistById(long ordId) throws COMSException ;
	
	/**
	 * update order info
	 * @param order OrderInformationCO
	 * @return int number of record to updated
	 * @author ha.than
	 */
	public int updateOrderInfo(OrderInformationCO order) throws COMSException;
}
