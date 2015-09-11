/*
 * $Id: OrdersMapper.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.RowMapper;

import com.heb.enterprise.coms.model.vo.BillInforVO;
import com.heb.enterprise.coms.model.vo.CustInforVO;
import com.heb.enterprise.coms.model.vo.CustPhnNbrVO;
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
import com.heb.enterprise.coms.utils.CommonFunction;
import com.heb.enterprise.coms.utils.Constants;

/**
 * @author ha.than
 * 
 */
public class OrdersMapper {
	private Log log = LogFactory.getLog(OrdersMapper.class);

	private static DateFormat dateTimeFormat = new SimpleDateFormat(Constants.STRING_DATETIME_FM);
	
	/**
	 * function convert result set to RowMapper<OrderThroughPutVO>.
	 * 
	 * @return RowMapper<OrderThroughPutVO>
	 */
	public static RowMapper<OrderThroughPutVO> getThroughPutMapper() {
		RowMapper<OrderThroughPutVO> rowMapper = new RowMapper<OrderThroughPutVO>() {
		    public OrderThroughPutVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	OrderThroughPutVO order = new OrderThroughPutVO();
		    	order.setCre8Ts(rs.getString(1));
		    	order.setOrders(rs.getInt(2));
				return order;
		    }
		};
		return rowMapper;
	}
	
	/**
	 * function convert result set to RowMapper<OrderBasketSizeVO>.
	 * 
	 * @return RowMapper<OrderBasketSizeVO>
	 */
	public static RowMapper<OrderBasketSizeVO> getOrderBasketSizesMapper() {
		RowMapper<OrderBasketSizeVO> rowMapper = new RowMapper<OrderBasketSizeVO>() {
		    public OrderBasketSizeVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	OrderBasketSizeVO order = new OrderBasketSizeVO();
		    	order.setTime(rs.getString(1));
		    	order.setMin(rs.getInt(2));
		    	order.setMax(rs.getInt(3));
		    	order.setAverageBasketSize(rs.getDouble(4));
		    	order.setDollarValue(rs.getDouble(5));
				return order;
		    }
		};
		return rowMapper;
	}
	
	/**
	 * function convert result set to RowMapper<OrderingSystemVO>.
	 * 
	 * @return RowMapper<OrderingSystemVO>
	 */
	public static RowMapper<OrderingSystemVO> getOrderingSystemsMapper() {
		RowMapper<OrderingSystemVO> rowMapper = new RowMapper<OrderingSystemVO>() {
		    public OrderingSystemVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	OrderingSystemVO order = new OrderingSystemVO();
		    	order.setTime(rs.getString(1));
		    	order.setOrdSrsCd(rs.getString(2));
		    	order.setCountOrd(rs.getInt(3));
		    	order.setCountOrdError(rs.getInt(4));
				return order;
		    }
		};
		return rowMapper;
	}
	
	/**
	 * function convert result set to RowMapper<OrderTypesChartVO>.
	 * 
	 * @return RowMapper<OrderTypesChartVO>
	 */
	public static RowMapper<OrderTypesChartVO> getAllOrderTypesVOsMapper() {
		RowMapper<OrderTypesChartVO> rowMapper = new RowMapper<OrderTypesChartVO>() {
		    public OrderTypesChartVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	OrderTypesChartVO order = new OrderTypesChartVO();
		    	order.setTime(rs.getString(1));
		    	order.setOrdTypCd(rs.getString(2));
		    	order.setCountOrd(rs.getInt(3));
				return order;
		    }
		};
		return rowMapper;
	}
	
	/**
	 * function convert result set to RowMapper<OrderStatusVO>.
	 * 
	 * @return RowMapper<OrderStatusVO>
	 */
	public static RowMapper<OrderStatusVO> getAllOrderStatusMapper() {
		RowMapper<OrderStatusVO> rowMapper = new RowMapper<OrderStatusVO>() {
		    public OrderStatusVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	OrderStatusVO order = new OrderStatusVO();
		    	order.setTime(rs.getString(1));
		    	order.setOrdHdrStatCd(rs.getString(2));
		    	order.setCountOrd(rs.getInt(3));
				return order;
		    }
		};
		return rowMapper;
	}
	
	/**
	 * function convert result set to RowMapper<OrderTypeVO>.
	 * 
	 * @return RowMapper<OrderTypeVO>
	 */
	public static RowMapper<OrderTypeVO> getOrderTypesMapper() {
		RowMapper<OrderTypeVO> rowMapper = new RowMapper<OrderTypeVO>() {
		    public OrderTypeVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	OrderTypeVO order = new OrderTypeVO();
		    	order.setOrdTypCd(rs.getString(1));
		    	order.setOrdTypAbb(rs.getString(2));
		    	order.setOrdTypDes(rs.getString(3));
				return order;
		    }
		};
		return rowMapper;
	}
	
	/**
	 * function convert result set to RowMapper<OrderHdrStatVO>.
	 * 
	 * @return RowMapper<OrderHdrStatVO>
	 */
	public static RowMapper<OrderHdrStatVO> getOrderHdrStatsMapper() {
		RowMapper<OrderHdrStatVO> rowMapper = new RowMapper<OrderHdrStatVO>() {
		    public OrderHdrStatVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	OrderHdrStatVO order = new OrderHdrStatVO();
		    	order.setOrdHdrStatCd(rs.getString(1));
		    	order.setOrdHdrStatAbb(rs.getString(2));
		    	order.setOrdHdrStatDes(rs.getString(3));
				return order;
		    }
		};
		return rowMapper;
	}
	
	/**
	 * function convert result set to RowMapper<OrderSrcVO>.
	 * 
	 * @return RowMapper<OrderSrcVO>
	 */
	public static RowMapper<OrderSrcVO> getOrderSrcsMapper() {
		RowMapper<OrderSrcVO> rowMapper = new RowMapper<OrderSrcVO>() {
		    public OrderSrcVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	OrderSrcVO order = new OrderSrcVO();
		    	order.setOrdSrcCd(rs.getString(1));
		    	order.setOrdSrcAbb(rs.getString(2));
		    	order.setOrdSrcDes(rs.getString(3));
				return order;
		    }
		};
		return rowMapper;
	}

	
	/**
	 * function convert result set to RowMapper<OrdDetailVO>.
	 * 
	 * @return RowMapper<OrdDetailVO>
	 */
	public static RowMapper<OrdDetailVO> getOrdDetailByIdMapper() {
		RowMapper<OrdDetailVO> rowMapper = new RowMapper<OrdDetailVO>() {
		    public OrdDetailVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	OrdDetailVO order = new OrdDetailVO();
		    	order.setOrdId(rs.getLong("ORD_ID"));
		    	order.setOrdDtlEntyTypCd(rs.getString("ORD_DTL_ENTY_TYP_CD"));
		    	order.setOrdDtlKey(rs.getString("ORD_DTL_KEY"));
		    	order.setOrdDtlSeqNbr(rs.getString("ORD_DTL_SEQ_NBR"));
		    	order.setUnitReailAmt(rs.getFloat("UNT_REAIL_AMT"));
		    	order.setOrdQty(rs.getInt("ORDED_QTY"));
		    	order.setTaxRtPct(rs.getFloat("TAX_RT_PCT"));
		    	order.setTotRetlAmt(rs.getFloat("TOT_RETL_AMT"));
		    	order.setTotDiscAmt(rs.getFloat("TOT_DISC_AMT"));
		    	order.setTotTaxAmt(rs.getFloat("TOT_TAX_AMT"));
		    	order.setTotNetAmt(rs.getFloat("TOT_NET_AMT"));
//		    	order.setCre8Ts(rs.getDate("CRE8_TS"));
		    	order.setCre8Uid(rs.getString("CRE8_UID"));
		    	order.setLsttUpdtTs(rs.getString("LST_UPDT_TS"));
		    	order.setLstUpdtUid(rs.getString("LST_UPDT_UID"));
		    	order.setCustShpngId(rs.getInt("CUST_SHPNG_ID"));
		    	order.setOrdDtlStatDes(rs.getString("ORD_DTL_STAT_DES"));
				return order;
		    }
		};
		return rowMapper;
	}	
	
	/**
	 * function convert result set to RowMapper<IndivOrdStatisticVO>.
	 * 
	 * @return RowMapper<IndivOrdStatisticVO>
	 */
	public static RowMapper<IndivOrdStatisticVO> getIndivOrdStattByIdMapper() {
		RowMapper<IndivOrdStatisticVO> rowMapper = new RowMapper<IndivOrdStatisticVO>() {
		    public IndivOrdStatisticVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	IndivOrdStatisticVO order = new IndivOrdStatisticVO();
		    	OrderInforVO orderInforVO  = new OrderInforVO();
		    	CustInforVO custInforVO  = new CustInforVO();
		    	orderInforVO.setOrdId(rs.getLong("ORD_ID"));
		    	orderInforVO.setOrdTypCd(rs.getString("ORD_TYP_CD"));
		    	orderInforVO.setOrdDes(rs.getString("ORD_DES"));
		    	orderInforVO.setOrdSrcCd(rs.getString("ORD_SRC_CD"));
		    	orderInforVO.setOrdStat(rs.getString("ORD_HDR_STAT_CD"));
//		    	orderInforVO.setSubOrd(rs.getString(2));
		    	orderInforVO.setCre8Ts(CommonFunction.convertDateTsByFmat(rs.getDate("CRE8_TS")));
		    	orderInforVO.setCre8Uid(rs.getString("CRE8_UID"));
		    	orderInforVO.setUpdtUid(rs.getString("LST_UPDT_UID"));
		    	orderInforVO.setUpdtTs(CommonFunction.convertDateTsByFmat(rs.getDate("LST_UPDT_TS")));
//		    	orderInforVO.setNote(rs.getString(2));
		    	orderInforVO.setOrdTypDes(rs.getString("ORD_TYP_DES"));
		    	orderInforVO.setOrdSrcDes(rs.getString("ORD_SRC_DES"));
		    	orderInforVO.setOrdStatDes(rs.getString("ORD_HDR_STAT_DES"));
		    	custInforVO.setAddTxt1(rs.getString("ADR_1_TXT"));
		    	custInforVO.setAddTxt2(rs.getString("ADR_2_TXT"));
		    	custInforVO.setAddTxt3(rs.getString("ADR_3_TXT"));
		    	custInforVO.setAddTxt4(rs.getString("ADR_4_TXT"));
		    	custInforVO.setCtyTxt(rs.getString("CTY_TXT"));
		    	custInforVO.setStAbb(rs.getString("ST_ABB"));
		    	custInforVO.setZipCode(rs.getString("ZIP_CD"));
		    	custInforVO.setZipCodeExt(rs.getString("ZIP_EXTN_CD"));
		    	custInforVO.setCre8Ts(CommonFunction.convertDateTsByFmat(rs.getDate("CRE8_TS_1")));
		    	custInforVO.setCre8Uid(rs.getString("CRE8_UID_1"));
		    	custInforVO.setUpdtUid(rs.getString("LST_UPDT_UID_1"));
		    	custInforVO.setUpdtTs(CommonFunction.convertDateTsByFmat(rs.getDate("LST_UPDT_TS_1")));
		    	custInforVO.setCountry(rs.getString("CNTRY_NM"));
		    	
		    	custInforVO.setBillAddress(rs.getString("CUST_BILING_ADR_SW").toUpperCase().equals("N") ? false:true);
		    	custInforVO.setEmail(rs.getString("EMAIL_ID"));
		    	custInforVO.setCustFrstNm(rs.getString("CUST_FRST_NM"));
		    	custInforVO.setCustMidNm(rs.getString("CUST_MID_NM"));
		    	custInforVO.setCustLstNm(rs.getString("CUST_LST_NM"));
		    	custInforVO.setShipAddress(rs.getString("CUST_SHPNG_ADR_SW").toUpperCase().equals("N") ? false:true);
		    	order.setOrderInforVO(orderInforVO);
		    	order.setCustInforVO(custInforVO);
		    	order.setOrdSubTotAmt(rs.getFloat("ORD_SUB_TOT_AMT"));
		    	order.setOrdTotDiscAmt(rs.getFloat("ORD_TOT_DISC_AMT"));
		    	order.setOrdEstTaxAmt(rs.getFloat("ORD_EST_TAX_AMT"));
		    	order.setOrdTotShpngAmt(rs.getFloat("ORD_TOT_SHPNG_AMT"));
		    	order.setOrdNetAmt(rs.getFloat("ORD_NET_AMT"));
		    	order.setTotPymtAmt(rs.getFloat("TOT_PYMT_AMT"));
		    	order.setItmCnt(rs.getInt("ITM_CNT"));
				return order;
		    }
		};
		return rowMapper;
	}
	/**
	 * function convert result set to RowMapper<OrderCmtVO>.
	 * 
	 * @return RowMapper<OrderCmtVO>
	 */
	public static RowMapper<OrderCmtVO> getOrdCmtsByIdMapper() {
		RowMapper<OrderCmtVO> rowMapper = new RowMapper<OrderCmtVO>() {
		    public OrderCmtVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	OrderCmtVO order = new OrderCmtVO();
		    	order.setOrdId(rs.getLong("ORD_ID"));
		    	order.setOrdCmtCd(rs.getString("ORD_CMT_CD"));
		    	order.setOrdCmtTxt(rs.getString("ORD_CMT_TXT"));
		    	order.setOrdCmtTypDes(rs.getString("ORD_CMT_TYP_DES"));
		    	order.setCre8Uid(rs.getString("CRE8_UID"));
		    	order.setCre8Ts(CommonFunction.convertDateTsByFmat(rs.getDate("CRE8_TS")));
		    	order.setLstUpdtTs(CommonFunction.convertDateTsByFmat(rs.getDate("LST_UPDT_TS")));
		    	order.setLstUpdtUid(rs.getString("LST_UPDT_UID"));
				return order;
		    }
		};
		return rowMapper;
	}	
	/**
	 * function convert result set to RowMapper<OrderCmtVO>.
	 * 
	 * @return RowMapper<OrderCmtVO>
	 */
	public static RowMapper<OrderStatHistVO> getOrdStatHistByIdMapper() {
		RowMapper<OrderStatHistVO> rowMapper = new RowMapper<OrderStatHistVO>() {
		    public OrderStatHistVO mapRow(final ResultSet rs, int rowNum) throws SQLException {
		    	OrderStatHistVO order = new OrderStatHistVO();
		    	order.setOrdId(rs.getLong("ORD_ID"));
		    	order.setOrdStatTs(rs.getString("ORD_STAT_TS"));
		    	order.setOrdHdrStatCd(rs.getString("ORD_HDR_STAT_CD"));
		    	order.setOrdHdrStatDes(rs.getString("ORD_HDR_STAT_DES"));
		    	order.setOrdStatUsrId(rs.getString("ORD_STAT_USR_ID"));
		    	order.setCre8Ts(CommonFunction.convertDateTsByFmat(rs.getDate("CRE8_TS")));
		    	order.setCre8Uid(rs.getString("CRE8_UID"));
				return order;
		    }
		};
		return rowMapper;
	}	
	
}