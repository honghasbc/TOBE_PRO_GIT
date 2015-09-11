/*
 * $Id: MonitorController.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.heb.enterprise.coms.model.co.CustomerInformationCO;
import com.heb.enterprise.coms.model.co.OrderInformationCO;
import com.heb.enterprise.coms.model.vo.IndivOrdStatisticVO;
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
import com.heb.enterprise.coms.service.CustomersService;
import com.heb.enterprise.coms.service.OrdersService;
import com.heb.enterprise.coms.utils.COMSException;
import com.heb.enterprise.coms.utils.CommonFunction;
import com.heb.enterprise.coms.utils.Constants;
import com.heb.enterprise.coms.utils.ConstantsWeb;

/**
 * Controller for the Monitor screen.
 * 
 * @author ha.than
 * 
 */
@Controller
@RequestMapping(ConstantsWeb.MONITOR)
public class MonitorController{

	private Log log = LogFactory.getLog(MonitorController.class);
	
	// PATH
	private static final String ROOT_PATH = "/";
	private static final String ORDER_STATISTIC_PATH = "/orderStatistics";	
	private static final String INDIVIDUAL_ORDER_PATH = "/individualOrdStat";
	private static final String LINE_ITEM_PATH = "/lineItemDetail";
	private static final String MONITOR1_PATH = "/monitor1";
	private static final String MONITOR2_PATH = "/monitor2";
	
	private static final String AJAX_GETORDBYID_PATH = "/ajaxGetOrdById";
	private static final String AJAX_GETORDCOMMENTS_BYID_PATH = "/ajaxGetOrdComments";
	private static final String AJAX_GETSTATHISTORY_BYID_PATH = "/ajaxGetStatHistory";
	
	private static final String AJAX_GETDATA_PATH = "/ajaxGetData";
	private static final String AJAX_UPDATE_ORDER_INFO_PATH = "/ajaxUpdateOrderInformation";
	private static final String AJAX_UPDATE_CUST_INFO_PATH = "/ajaxUpdateCustInformation";

	// TILE
	private static final String ORDER_STATISTIC_TILE = "monitor.orderStatistics.tile";
	private static final String INDIVIDUAL_ORDER_TILE = "monitor.individualOrdStat.tile";
	private static final String LINE_ITEM_DETAIL_TILE = "monitor.lineitemdetail.tile";
	
	private static final String MONITOR_GET_DATA_TILE = "monitor.ajaxGetData.tile";
	private static final String MONITOR_GET_ORDBYID_TILE = "monitor.ajaxGetOrdById.tile";
	private static final String MONITOR_GET_ORDCOMMENTS_TILE = "monitor.ajaxGetOrdCommentsById.tile";
	private static final String MONITOR_GET_ORDSTATHISTORY_TILE = "monitor.ajaxGetStatHistory.tile";
	private static final String MONITOR_GET_MONITOR1_TILE = "monitor.monitor1.tile";
	private static final String MONITOR_GET_MONITOR2_TILE = "monitor.monitor2.tile";
	@Autowired
	private HttpServletRequest request;
	
	/**
     * Initial Order Service.
     *
     * @param ordersService set service
     */
	@Autowired
	@Qualifier(Constants.ORDERS_SERVICE)
	private OrdersService ordersService;
	/**
     * Initial Customer Service.
     *
     * @param ordersService set service
     */
	@Autowired
	@Qualifier(Constants.CUSTOMERS_SERVICE)
	private CustomersService custsService;
	
	/**
     * Handles any order statistics case.
     *
     * @param model Attributes set to jsp
     * @return the tile for the order statistics page
     */
	@RequestMapping(value = {ROOT_PATH,ORDER_STATISTIC_PATH}, method = RequestMethod.GET)
	public String index(ModelMap model) {
		return ORDER_STATISTIC_TILE;
	}
	
	/**
     * Handles any individual order stat case.
     *
     * @param model Attributes set to jsp
     * @return the tile for the individual order stat page
     */
	@RequestMapping(value = INDIVIDUAL_ORDER_PATH, method = RequestMethod.GET)
	public String invidualOrdStat(ModelMap model) {
		return INDIVIDUAL_ORDER_TILE;
	}
	
	/**
     * Handles any line item in a order .
     *
     * @param model Attributes set to jsp
     * @return the tile for the individual order stat page
     */
	@RequestMapping(value = LINE_ITEM_PATH, method = RequestMethod.GET)
	public String lineItemDetail(ModelMap model) {
		return LINE_ITEM_DETAIL_TILE;
	}	
	/**
	 * Get data for charts
	 * 
	 * @param model
	 * @param name
	 * @return String
	 * @author ha.than
	 */
	@RequestMapping(value = AJAX_GETORDBYID_PATH, method = RequestMethod.POST)
	public @ResponseBody String getDataForChart(ModelMap model, @RequestParam String ordId) {
		String jsonData = "";
		try {
			this.log.info("ordId:"+ordId);
			IndivOrdStatisticVO  indivOrdStatisticVO = ordersService.getIndivOrdStattById(Long.parseLong(ordId));
			jsonData = CommonFunction.buildIndivOrdStatToJson(indivOrdStatisticVO);
			this.log.info("jsonData:"+jsonData);
			model.addAttribute("jsonData", jsonData);
		} catch (COMSException e) {
			this.log.error("error get order by id:"+e.getMessage(),e);
		}
		
//		return MONITOR_GET_ORDBYID_TILE;
		return jsonData;
	}
	/**
	 * Get data for charts
	 * 
	 * @param model
	 * @param name
	 * @return String
	 * @author ha.than
	 */
	@RequestMapping(value = AJAX_GETORDCOMMENTS_BYID_PATH, method = RequestMethod.GET, params = { "ordId"})
	public String ajaxGetOrdComments(ModelMap model, @RequestParam String ordId) {
		try {
			this.log.info("ordId:"+ordId);
			List<OrderCmtVO>  listOrderCmtVOs = ordersService.getOrdCmmtById(Long.parseLong(ordId));
			String jsonData = CommonFunction.buildListOrderCmtVOsToJson(listOrderCmtVOs);
			this.log.info("jsonData:"+jsonData);
			model.addAttribute("jsonData", jsonData);
		} catch (COMSException e) {
			this.log.error("error get order by id:"+e.getMessage(),e);
		}
		
		return MONITOR_GET_ORDCOMMENTS_TILE;
	}
	/**
	 * Get data for charts
	 * 
	 * @param model
	 * @param ordId
	 * @return String
	 * @author ha.than
	 */
	@RequestMapping(value = AJAX_GETSTATHISTORY_BYID_PATH, method = RequestMethod.GET, params = { "ordId"})
	public String ajaxGetStatHistory(ModelMap model, @RequestParam String ordId) {
		try {
			this.log.info("ordId:"+ordId);
			List<OrderStatHistVO>  listStatHistVOs = ordersService.getOrdStatHistById(Long.parseLong(ordId));
			String jsonData = CommonFunction.buildOrdStatHistVOsToJson(listStatHistVOs);
			this.log.info("jsonData:"+jsonData);
			model.addAttribute("jsonData", jsonData);
		} catch (COMSException e) {
			this.log.error("error get order by id:"+e.getMessage(),e);
		}
		
		return MONITOR_GET_ORDSTATHISTORY_TILE;
	}
	
	/**
	 * Get data for charts
	 * 
	 * @param model
	 * @param name
	 * @return String
	 * @author ha.than
	 * @throws COMSException 
	 */
	@RequestMapping(value = AJAX_GETDATA_PATH, method = RequestMethod.GET, params = { "name","startdate","enddate"})
	public String getDataForChart(ModelMap model, @RequestParam String name,@RequestParam long startdate,@RequestParam long enddate) {
		try{
			JSONObject jsonData = null;
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constants.SHORT_DATE_FORMAT);
			String fromDate = simpleDateFormat.format(new Date(startdate));
			String toDate = simpleDateFormat.format(new Date(enddate));
			if (name.equals("fulfillmentsystem")) {
	//			List<FullfillmentVO> fullfillments = ordersService
	//					.getFullfillments(fromDate, toDate);
	//			jsonData = CommonFunction.parseFullfillmentsToJSON(request.getRealPath(ConstantsWeb.PATH_RESOURCE_HEADER),fullfillments);
	//			this.log.info(jsonData);
			}else if(name.equals("orderingsystem")){
				this.log.info("orderingsystem");
				List<OrderSrcVO> orderSrcVo = ordersService.getOrderSrcVOs();
				List<OrderingSystemVO> orderingSystems = ordersService.getOrderingSystems(fromDate, toDate);
				jsonData = CommonFunction.parseOrderingSystemsToJSON(orderSrcVo,orderingSystems);
				this.log.info(jsonData);
			}else if(name.equals("orderstatus")){
				this.log.info("orderstatus");
				List<OrderHdrStatVO> orderHdrStatVO = ordersService.getOrderHdrStatVOs();
				List<OrderStatusVO> orderStatusVO = ordersService.getAllOrderStatus(fromDate, toDate);
				jsonData = CommonFunction.buildOrderStatusToJson(orderHdrStatVO,orderStatusVO);
				this.log.info(jsonData);
			}else if(name.equals("orderbasketsize")){ 
				this.log.info("orderbasketsize");
				List<OrderBasketSizeVO> orders = ordersService.orderBasketSizes(fromDate, toDate);
				jsonData = CommonFunction.parseOrderBasketSizesToJSON(request.getRealPath(ConstantsWeb.PATH_RESOURCE_HEADER),orders);
				this.log.info(jsonData);
			}else if(name.equals("orderthroughput")){ //orderthroughput
				List<OrderThroughPutVO> orderThroughPuts = null;
				if(startdate!=enddate){
					orderThroughPuts = ordersService.getOrdThrPutByRag(fromDate,toDate);				
				}else{
					orderThroughPuts = ordersService.getOrdThrPutByDate(fromDate);
				}
				jsonData = CommonFunction.parseOrdThrPutToJSON(request.getRealPath(ConstantsWeb.PATH_RESOURCE_HEADER),orderThroughPuts,startdate,enddate);
			}else if(name.equals("ordertypes")){
				this.log.info("ordertypes");
				List<OrderTypeVO> orderTypeVo = ordersService.getOrderTypeVOs();
				List<OrderTypesChartVO> ordTypes = ordersService.getAllOrdTypes(
						fromDate, toDate);
				jsonData = CommonFunction.buildOrderTypesToJson(orderTypeVo,
						ordTypes);
				this.log.info(jsonData);
			}
			model.addAttribute("jsonDataFullfillment", jsonData);
		} catch (COMSException e) {
			this.log.error("error get order by id:"+e.getMessage(),e);
		}
		return MONITOR_GET_DATA_TILE;
	}
	
	/**
	 * Update Order infor data
	 * 
	 * @param model
	 * @param name
	 * @return String
	 * @author ha.than
	 * @throws COMSException 
	 */
	@RequestMapping(value = AJAX_UPDATE_ORDER_INFO_PATH, method = RequestMethod.POST)
	public @ResponseBody boolean ajaxUpdateOrderInformation(ModelMap model,@ModelAttribute final  OrderInformationCO order) {
		boolean result= false;
		try{
			int i =  ordersService.updateOrderInfo(order);
			if(i>0) result=true;
		} catch (COMSException e) {
			this.log.error("error get order by id:"+e.getMessage(),e);
		}
		return result;
	}
	
	/**
	 * Update Customer infor data by orderId
	 * 
	 * @param model
	 * @param name
	 * @return String
	 * @author ha.than
	 * @throws COMSException 
	 */
	@RequestMapping(value = AJAX_UPDATE_CUST_INFO_PATH, method = RequestMethod.POST)
	public @ResponseBody boolean ajaxUpdateCustInformation(ModelMap model,@ModelAttribute final  CustomerInformationCO cust) throws COMSException {
		boolean result= false;
		try{
			int i =  custsService.updateCustInfo(cust);
			if(i>0) result=true;
		} catch (COMSException e) {
			this.log.error("error get order by id:"+e.getMessage(),e);
		}
		return result;
	}
	@RequestMapping(value = { ROOT_PATH, MONITOR1_PATH }, method = RequestMethod.GET)
	public String monitor1(ModelMap model) {
		log.info("monitor1============");
		return MONITOR_GET_MONITOR1_TILE;
	}
	@RequestMapping(value = { ROOT_PATH, MONITOR2_PATH }, method = RequestMethod.GET)
	public String monitor2(ModelMap model) {
		log.info("monitor2============");
		return MONITOR_GET_MONITOR2_TILE;
	}
}