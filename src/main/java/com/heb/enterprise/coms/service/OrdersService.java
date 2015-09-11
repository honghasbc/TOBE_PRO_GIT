/*
 * $Id: OrdersService.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.heb.enterprise.coms.dao.BillingNShippingDAO;
import com.heb.enterprise.coms.dao.CustomersDAO;
import com.heb.enterprise.coms.dao.OrdersDAO;
import com.heb.enterprise.coms.model.co.OrderInformationCO;
import com.heb.enterprise.coms.model.vo.BillInforVO;
import com.heb.enterprise.coms.model.vo.CustPhnNbrVO;
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
import com.heb.enterprise.coms.utils.Constants;

/**
 * @author ha.than
 * 
 */
@Service(Constants.ORDERS_SERVICE)
public class OrdersService {

	@Autowired
	@Qualifier(Constants.ORDERS_DAO)
	private OrdersDAO ordersDao;
	
	@Autowired
	@Qualifier(Constants.CUSTOMERS_DAO)
	private CustomersDAO customersDao;
	
	@Autowired
	@Qualifier(Constants.BILLING_SHIPPING_DAO)
	private BillingNShippingDAO billShipDao;

	
	/**
	 * get list OrderBasketSizeVO by range
	 * 
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderBasketSizeVO>
	 * @author ha.than
	 * @throws COMSException 
	 */
	public List<OrderBasketSizeVO> orderBasketSizes(String fromDate,
			String toDate) throws COMSException {
		return ordersDao.orderBasketSizes(fromDate, toDate);
	}

	/**
	 * get list OrderThroughPutVO by range
	 * 
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderThroughPutVO>
	 * @author ha.than
	 * @throws COMSException 
	 */
	public List<OrderThroughPutVO> getOrdThrPutByRag(String fromDate,
			String toDate) throws COMSException {
		return ordersDao.getOrdThrPutByRag(fromDate, toDate);
	}
	
	/**
	 * get list OrderThroughPutVO by a date
	 * 
	 * @param date
	 * @return List<OrderThroughPutVO>
	 * @author ha.than
	 * @throws COMSException 
	 */
	public List<OrderThroughPutVO> getOrdThrPutByDate(String date) throws COMSException {
		return ordersDao.getOrdThrPutByDate(date);
	}

	/**
	 * get all OrderType
	 * 
	 * @return List<OrderTypeVO>
	 * @author ha.than
	 * @throws COMSException 
	 */
	public List<OrderTypeVO> getOrderTypeVOs() throws COMSException {
		return ordersDao.getOrderTypeVOs();
	}

	/**
	 * get all OrderTypes of chart by range
	 * 
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderTypesChartVO>
	 * @author ha.than
	 * @throws COMSException 
	 */
	public List<OrderTypesChartVO> getAllOrdTypes(String fromDate, String toDate) throws COMSException {
		return ordersDao.getAllOrdTypes(fromDate, toDate);
	}
	/**
	 * get list OrderingSystemVO by range
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderingSystemVO>
	 * @author ha.than
	 * @throws COMSException 
	 */
	public List<OrderingSystemVO> getOrderingSystems(String fromDate,String toDate) throws COMSException{
		return ordersDao.getOrderingSystems(fromDate,toDate );
	}
	/**
	 * get all OrderHdrStatVO
	 * @return List<OrderHdrStatVO>
	 * @author ha.than
	 * @throws COMSException 
	 */
	public List<OrderHdrStatVO> getOrderHdrStatVOs() throws COMSException {
		return ordersDao.getOrderHdrStatVOs();
	}
	/**
	 * get all OrderStatusVO of chart by range
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderStatusVO>
	 * @author ha.than
	 * @throws COMSException 
	 */
	public List<OrderStatusVO> getAllOrderStatus(String fromDate,String toDate) throws COMSException {	
		return ordersDao.getAllOrderStatus(fromDate,toDate);
	}
	/**
	 * get all OrderSrc
	 * @return List<OrderTypeVO>
	 * @author ha.than
	 * @throws COMSException 
	 */
	public List<OrderSrcVO> getOrderSrcVOs() throws COMSException {	
		return ordersDao.getOrderSrcVOs();
	}
	/**
	 * get all individual orderstatistic by ordId
	 * @param ordId
	 * @return IndivOrdStatisticVO
	 * @author ha.than
	 * @throws COMSException 
	 */
	public IndivOrdStatisticVO getIndivOrdStattById(long ordId) throws COMSException {			
		IndivOrdStatisticVO indivOrdStatisticVO =  ordersDao.getIndivOrdStattById(ordId);
		
		indivOrdStatisticVO.setOrdDetailVOs((ArrayList<OrdDetailVO>) ordersDao.getOrdDetailById(ordId));
		indivOrdStatisticVO.getCustInforVO().setCustPhnNbrs((ArrayList<CustPhnNbrVO>) customersDao.getPhnNbrByOrdId(ordId));
		indivOrdStatisticVO.setBillInforVOs((ArrayList<BillInforVO>) billShipDao.getBillInforByOrdId(ordId));
		
		return indivOrdStatisticVO;
	}
	/**
	 * get all order comments by ordId
	 * @param ordId
	 * @return List<OrderCmtVO>
	 * @author ha.than
	 */
	public List<OrderCmtVO> getOrdCmmtById(long ordId) throws COMSException {	
		return ordersDao.getOrdCmmtById(ordId);
	}
	/**
	 * get all order status history by ordId
	 * @param ordId
	 * @return List<OrderStatHistVO>
	 * @author ha.than
	 */
	public List<OrderStatHistVO> getOrdStatHistById(long ordId) throws COMSException {	
		return ordersDao.getOrdStatHistById(ordId);
	}
	
	/**
	 * update order info
	 * @param order OrderInformationCO
	 * @return int number of record to updated
	 * @author ha.than
	 */
	public int updateOrderInfo(OrderInformationCO order) throws COMSException {	
		return ordersDao.updateOrderInfo(order);
	}
	
}
