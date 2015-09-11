/*
 * $Id: OrdersDAOImpl.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.heb.enterprise.coms.dao.OrdersDAO;
import com.heb.enterprise.coms.dao.mapper.OrdersMapper;
import com.heb.enterprise.coms.model.co.OrderInformationCO;
import com.heb.enterprise.coms.model.vo.BillInforVO;
import com.heb.enterprise.coms.model.vo.CustInforVO;
import com.heb.enterprise.coms.model.vo.CustPhnNbrVO;
import com.heb.enterprise.coms.model.vo.FullfillmentVO;
import com.heb.enterprise.coms.model.vo.IndivOrdStatisticVO;
import com.heb.enterprise.coms.model.vo.OrdDetailVO;
import com.heb.enterprise.coms.model.vo.OrderBasketSizeVO;
import com.heb.enterprise.coms.model.vo.OrderCmtVO;
import com.heb.enterprise.coms.model.vo.OrderHdrStatVO;
import com.heb.enterprise.coms.model.vo.OrderInforVO;
import com.heb.enterprise.coms.model.vo.OrderSrcVO;
import com.heb.enterprise.coms.model.vo.OrderStatHistVO;
import com.heb.enterprise.coms.model.vo.OrderStatusVO;
import com.heb.enterprise.coms.model.vo.OrderThroughPutVO;
import com.heb.enterprise.coms.model.vo.OrderTypeVO;
import com.heb.enterprise.coms.model.vo.OrderTypesChartVO;
import com.heb.enterprise.coms.model.vo.OrderingSystemVO;
import com.heb.enterprise.coms.utils.COMSException;
import com.heb.enterprise.coms.utils.CommonFunction;
import com.heb.enterprise.coms.utils.Constants;

/**
 * @author ha.than
 * 
 */
@Repository(Constants.ORDERS_DAO)
public class OrdersDAOImpl extends BaseDAOImpl implements OrdersDAO {

	private Log log = LogFactory.getLog(OrdersDAOImpl.class);

	
	/**
	 * get list OrderingSystemVO by range
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderingSystemVO>
	 * @author ha.than
	 */
	public List<OrderingSystemVO> getOrderingSystems(String fromDate,String toDate)  throws COMSException{
//		String sql = "select  TO_CHAR(comsorder.CRE8_TS, '"+Constants.DATE_FORMAT+"') as cre8Ts, src.ORD_SRC_CD, count(comsorder.ORD_ID), count(eem.logic_Key_val)	" +
//				"from ORD_SRC src left join COMS_ORD_HDR comsorder on  src.ORD_SRC_CD = comsorder.ORD_SRC_CD " +
//				"left join eem_trx_hdr eem on eem.logic_Key_val = comsorder.XTRNL_ORD_ID  " +
//				"where comsorder.CRE8_TS between  TO_TIMESTAMP (?, ?) and TO_TIMESTAMP (?, ?) " +
//				"group by  TO_CHAR(comsorder.CRE8_TS, '"+Constants.DATE_FORMAT+"'), src.ORD_SRC_CD order by cre8Ts";
//
//		List<OrderingSystemVO> orderingSystems = BaseDAOImpl.jdbcTemplate.query(sql,
//					new Object[] { fromDate,Constants.TIMESTAM_FULL_FORMAT,toDate,Constants.TIMESTAM_FULL_FORMAT }, OrdersMapper.getOrderingSystemsMapper());

		return null;
	}
	/**
	 * get list OrderBasketSizeVO by range
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderBasketSizeVO>
	 * @author ha.than
	 */
	public List<OrderBasketSizeVO> orderBasketSizes(String fromDate,String toDate)   throws COMSException{	
		return null;
	}
	
	/**
	 * get list OrderThroughPutVO by range
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderThroughPutVO>
	 * @author ha.than
	 */
	public List<OrderThroughPutVO> getOrdThrPutByRag(String fromDate,String toDate) throws COMSException{	
		return null;
	}
	/**
	 * get list OrderThroughPutVO by date
	 * @param date
	 * @return List<OrderThroughPutVO>
	 * @author ha.than
	 */
	public List<OrderThroughPutVO> getOrdThrPutByDate(String date)  throws COMSException{	
		return null;
	}
	/**
	 * get all OrderTypes of chart by range
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderTypesChartVO>
	 * @author ha.than
	 */
	public List<OrderTypesChartVO> getAllOrdTypes(String fromDate,String toDate)  throws COMSException {	
		return null;
	}
	/**
	 * get all OrderType
	 * @return List<OrderTypeVO>
	 * @author ha.than
	 */
	public List<OrderTypeVO> getOrderTypeVOs()  throws COMSException {	
		return null;
	}
	/**
	 * get all OrderStatusVO of chart by range
	 * @param fromDate
	 * @param toDate
	 * @return List<OrderStatusVO>
	 * @author ha.than
	 */
	public List<OrderStatusVO> getAllOrderStatus(String fromDate,String toDate) throws COMSException {	
		return null;
	}
	/**
	 * get all OrderHdrStatVO
	 * @return List<OrderHdrStatVO>
	 * @author ha.than
	 */
	public List<OrderHdrStatVO> getOrderHdrStatVOs()  throws COMSException{	
		return null;
	}
	/**
	 * get all OrderSrc
	 * @return List<OrderTypeVO>
	 * @author ha.than
	 */
	public List<OrderSrcVO> getOrderSrcVOs()  throws COMSException {	
		return null;
	}
	/**
	 * get all individual order statistic by ordId
	 * @param ordId
	 * @return IndivOrdStatisticVO
	 * @author ha.than
	 */
	@SuppressWarnings("unchecked")
	public IndivOrdStatisticVO getIndivOrdStattById(long ordId)  throws COMSException {	
		return null;
	}
	
	/**
	 * get all order Detail by ordId
	 * @param ordId
	 * @return List<CustPhnNbrVO>
	 * @author ha.than
	 */
	public List<OrdDetailVO> getOrdDetailById(long ordId) throws COMSException {	
		return null;
	}
	/**
	 * get all order comments by ordId
	 * @param ordId
	 * @return List<OrderCmtVO>
	 * @author ha.than
	 */
	public List<OrderCmtVO> getOrdCmmtById(long ordId) throws COMSException {	
		return null;
	}
	
	/**
	 * get all order status history by ordId
	 * @param ordId
	 * @return List<OrderStatHistVO>
	 * @author ha.than
	 */
	public List<OrderStatHistVO> getOrdStatHistById(long ordId) throws COMSException {	
		return null;
	}
	
	
	/**
	 * update order info
	 * @param order OrderInformationCO
	 * @return int number of record to updated
	 * @author ha.than
	 */
	public int updateOrderInfo(OrderInformationCO order) throws COMSException {	
		return 0;
	}
}
