/*
 * $Id: CommonFunction.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Types;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.heb.enterprise.coms.model.vo.DynamicDataVO;
import com.heb.enterprise.coms.model.vo.FullfillmentVO;
import com.heb.enterprise.coms.model.vo.IndivOrdStatisticVO;
import com.heb.enterprise.coms.model.vo.MetaDataVO;
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

/**
 * Common Function (Utility, parse JSON, convert..).
 * 
 */
public class CommonFunction {
	private static Log log = LogFactory.getLog(CommonFunction.class);
	private static DateFormat dateTimeFormat = new SimpleDateFormat(
			Constants.STRING_DATETIME_FM);

	/**
	 * parse list FullfillmentVO to JSON
	 * 
	 * @param list
	 * @return JSONObject
	 * @author ha.than
	 */
	@SuppressWarnings("unchecked")
	public static JSONObject parseFullfillmentsToJSON(String pathFileHeader,
			List<FullfillmentVO> list) {
		JSONObject obj;
		JSONObject obj1;
		JSONObject obj2 = new JSONObject();
		JSONArray listArrAll = new JSONArray();
		try {
			for (FullfillmentVO fullfillment : list) {
				JSONArray listArr = new JSONArray();
				obj1 = new JSONObject();
				obj1.put("v", fullfillment.getTime());
				listArr.add(obj1);
				obj1 = new JSONObject();
				obj1.put("v", fullfillment.getInStore());
				listArr.add(obj1);
				obj1 = new JSONObject();
				obj1.put("v", fullfillment.getEcomDistCenter());
				listArr.add(obj1);
				obj1 = new JSONObject();
				obj1.put("v", fullfillment.getWarehouse());
				listArr.add(obj1);
				obj1 = new JSONObject();
				obj1.put("v", fullfillment.getVendor());
				listArr.add(obj1);
				obj = new JSONObject();
				obj.put("c", listArr);
				listArrAll.add(obj);
			}
			JSONObject jsonHeader = parseFullfillmentsHeaderJSON(pathFileHeader);
			obj2.put("cols", (JSONArray) jsonHeader.get("cols"));
			obj2.put("rows", listArrAll);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj2;
	}

	/**
	 * parse list FullfillmentVO Header to JSON
	 * 
	 * @return JSONObject
	 * @author ha.than
	 */
	public static JSONObject parseFullfillmentsHeaderJSON(String pathFileHeader) {
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = new JSONObject();
		try {
			Object obj = parser.parse(new FileReader(pathFileHeader
					+ "/fulfillmentsystem"));
			jsonObject = (JSONObject) obj;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return jsonObject;
	}

	/**
	 * parse list OrderThroughPutVO to JSON
	 * 
	 * @param list
	 * @param pathFileHeader
	 *            path of file header of JSON
	 * @return JSONObject
	 * @author ha.than
	 */
	@SuppressWarnings("unchecked")
	public static JSONObject parseOrdThrPutToJSON(String pathFileHeader,
			List<OrderThroughPutVO> list, long startDateParam, long endDateParam) {
		DateFormat dateFormat = null;
		Calendar cal = Calendar.getInstance();

		long startDate = startDateParam;
		long endDate = endDateParam;

		JSONObject point;
		JSONObject value;
		JSONObject data = new JSONObject();
		JSONArray listArrAll = new JSONArray();

		int addTime = 60000;
		int milisecondInDay = 86400000;
		try {
			JSONArray jsonHeader = parseOrdThrPutHeaderJSON(pathFileHeader,
					startDate == endDate);
			data.put("cols", jsonHeader);

			if (list != null && !list.isEmpty()) {
				if (startDate == endDate) {
					endDate += milisecondInDay;
					dateFormat = new SimpleDateFormat(
							Constants.DATETIME_FORMAT_SPLASH);
				} else {
					addTime = milisecondInDay;
					dateFormat = new SimpleDateFormat(
							Constants.DATE_FORMAT_SPLASH);
				}
				while (startDate <= endDate) {
					OrderThroughPutVO ord = null;
					long currentDate = 0;
					if (!list.isEmpty()) {
						ord = list.get(0);
						currentDate = dateFormat.parse(ord.getCre8Ts())
								.getTime();
					}

					if (ord != null && currentDate == startDate) {
						JSONArray listArr = new JSONArray();
						value = new JSONObject();
						cal.setTime(dateFormat.parse(ord.getCre8Ts()));
						cal.add(Calendar.MONTH, -1);
						String dateStr = dateFormat.format(cal.getTime())
								.replace("/", ",");
						value.put("v", "Date(" + dateStr + ")");
						listArr.add(value);
						value = new JSONObject();
						value.put("v", ord.getOrders());
						listArr.add(value);
						point = new JSONObject();
						point.put("c", listArr);
						listArrAll.add(point);

						list.remove(ord);
					} else {
						JSONArray listArr = new JSONArray();
						value = new JSONObject();
						cal.setTimeInMillis(startDate);
						cal.add(Calendar.MONTH, -1);
						String dateStr = dateFormat.format(cal.getTime())
								.replace("/", ",");
						value.put("v", "Date(" + dateStr + ")");
						listArr.add(value);
						value = new JSONObject();
						value.put("v", 0);
						listArr.add(value);
						point = new JSONObject();
						point.put("c", listArr);
						listArrAll.add(point);
					}

					startDate += addTime;
				}
			}

			data.put("rows", listArrAll);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	/**
	 * parse list OrderThroughPutVO Header to JSON
	 * 
	 * @return JSONObject
	 * @author ha.than
	 */
	public static JSONArray parseOrdThrPutHeaderJSON(String pathFileHeader,
			boolean dateTime) {
		JSONParser parser = new JSONParser();
		JSONArray jSONArray = new JSONArray();
		try {
			Object obj = parser.parse(new FileReader(pathFileHeader
					+ "/orderthroughput"));
			if (dateTime)
				jSONArray = (JSONArray) (((JSONObject) obj).get("colsDateTime"));
			else
				jSONArray = (JSONArray) (((JSONObject) obj).get("colsDate"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return jSONArray;
	}

	/**
	 * build list OrderTypeVO to JSON
	 * 
	 * @param headerOrder
	 * @param dataOrder
	 * @return JSONObject
	 * @author ha.than
	 */
	@SuppressWarnings("unchecked")
	public static JSONObject buildOrderTypesToJson(
			List<OrderTypeVO> headerOrder, List<OrderTypesChartVO> dataOrder) {
		JSONObject obReturn = new JSONObject();
		JSONArray listArrAll = new JSONArray();
		JSONObject objJson = new JSONObject();
		JSONArray listArr;

		HashMap<String, Map<String, Integer>> map = new HashMap<String, Map<String, Integer>>();
		List<String> timeList = new ArrayList<String>();
		for (OrderTypesChartVO ordsmap : dataOrder) {
			String time = ordsmap.getTime();
			Map obj = null;
			if (map.containsKey(time)) {
				obj = map.get(time);
			} else {
				obj = new HashMap<String, Integer>();
				timeList.add(time);
			}
			obj.put(ordsmap.getOrdTypCd(), ordsmap.getCountOrd());
			map.put(time, obj);
		}
		Map<String, Integer> mapdata = null;
		for (String time : timeList) {
			listArr = new JSONArray();
			objJson = new JSONObject();
			objJson.put("v", time);
			listArr.add(objJson);
			for (OrderTypeVO ord : headerOrder) {
				objJson = new JSONObject();
				mapdata = map.get(time);
				if (mapdata.containsKey(ord.getOrdTypCd())) {
					objJson.put("v", mapdata.get(ord.getOrdTypCd()));
				} else {
					objJson.put("v", 0);
				}
				listArr.add(objJson);
			}
			objJson = new JSONObject();
			objJson.put("c", listArr);
			listArrAll.add(objJson);
		}
		obReturn.put("cols", buildHeaderOrderTypesToJson(headerOrder));
		obReturn.put("rows", listArrAll);
		return obReturn;
	}

	/**
	 * build list OrderTypeVO Header to JSON
	 * 
	 * @param headerOrder
	 * @return JSONArray
	 * @author ha.than
	 */
	@SuppressWarnings("unchecked")
	public static JSONArray buildHeaderOrderTypesToJson(
			List<OrderTypeVO> headerOrder) {
		JSONArray listArrAll = new JSONArray();
		JSONObject objJson = new JSONObject();
		objJson.put("id", "Time");
		objJson.put("label", "Time");
		objJson.put("type", "string");
		listArrAll.add(objJson);
		for (OrderTypeVO ord : headerOrder) {
			objJson = new JSONObject();
			objJson.put("id", ord.getOrdTypCd());
			objJson.put("label", ord.getOrdTypDes());
			objJson.put("type", "number");
			listArrAll.add(objJson);
		}
		return listArrAll;
	}

	/**
	 * parse list OrderingSystemVO to JSON
	 * 
	 * @param list
	 * @return JSONObject
	 * @author ha.than
	 */
	@SuppressWarnings("unchecked")
	public static JSONObject parseOrderingSystemsToJSON(
			List<OrderSrcVO> headerOrder, List<OrderingSystemVO> list) {
		JSONObject obReturn = new JSONObject();
		JSONArray listArrAll = new JSONArray();
		JSONObject objJson = new JSONObject();
		JSONArray listArr;

		HashMap<String, Map<String, Integer>> map = new HashMap<String, Map<String, Integer>>();
		List<String> timeList = new ArrayList<String>();
		for (OrderingSystemVO ordsmap : list) {
			String time = ordsmap.getTime();
			Map obj = null;
			if (map.containsKey(time)) {
				obj = map.get(time);
			} else {
				obj = new HashMap<String, Integer>();
				timeList.add(time);
			}
			obj.put(ordsmap.getOrdSrsCd(), ordsmap.getCountOrd());
			obj.put(ordsmap.getOrdSrsCd().trim() + Constants.ERROR,
					ordsmap.getCountOrdError());
			map.put(time, obj);
		}
		Map<String, Integer> mapdata = null;
		for (String time : timeList) {
			listArr = new JSONArray();
			objJson = new JSONObject();
			objJson.put("v", time);
			listArr.add(objJson);
			for (OrderSrcVO ord : headerOrder) {
				objJson = new JSONObject();
				mapdata = map.get(time);
				if (mapdata.containsKey(ord.getOrdSrcCd())) {
					objJson.put("v", mapdata.get(ord.getOrdSrcCd()));
					listArr.add(objJson);
					objJson = new JSONObject();
					objJson.put(
							"v",
							mapdata.get(ord.getOrdSrcCd().trim()
									+ Constants.ERROR));

					listArr.add(objJson);
				} else {
					objJson.put("v", 0);
					listArr.add(objJson);
					objJson = new JSONObject();
					objJson.put("v", 0);
					listArr.add(objJson);
					objJson = new JSONObject();
				}
			}
			objJson = new JSONObject();
			objJson.put("c", listArr);
			listArrAll.add(objJson);
		}
		obReturn.put("cols", parseOrderingSysHeaderJSON(headerOrder));
		obReturn.put("rows", listArrAll);
		return obReturn;
	}

	/**
	 * parse list OrderingSystemVO Header to JSON
	 * 
	 * @return JSONObject
	 * @author ha.than
	 */
	public static JSONArray parseOrderingSysHeaderJSON(
			List<OrderSrcVO> headerOrder) {
		JSONArray listArrAll = new JSONArray();
		JSONObject objJson = new JSONObject();
		objJson.put("id", "Time");
		objJson.put("label", "Time");
		objJson.put("type", "string");
		listArrAll.add(objJson);
		for (OrderSrcVO ord : headerOrder) {
			objJson = new JSONObject();
			objJson.put("id", ord.getOrdSrcCd().trim());
			objJson.put("label", ord.getOrdSrcDes());
			objJson.put("type", "number");
			listArrAll.add(objJson);

			objJson = new JSONObject();
			objJson.put("id", ord.getOrdSrcCd().trim() + Constants.ERROR);
			objJson.put("label", ord.getOrdSrcDes() + Constants.ERROR);
			objJson.put("type", "number");
			listArrAll.add(objJson);
		}
		return listArrAll;
	}

	/**
	 * parse list OrderBasketSizeVO to JSON
	 * 
	 * @param list
	 * @return JSONObject
	 * @author ha.than
	 */
	@SuppressWarnings("unchecked")
	public static JSONObject parseOrderBasketSizesToJSON(String pathFileHeader,
			List<OrderBasketSizeVO> list) {
		JSONObject bskSize;
		JSONObject objTemp;
		JSONObject jsonReturn = new JSONObject();
		JSONArray listArrAll = new JSONArray();
		try {
			for (OrderBasketSizeVO ord : list) {
				JSONArray listArr = new JSONArray();
				objTemp = new JSONObject();
				objTemp.put("v", ord.getTime());
				listArr.add(objTemp);

				objTemp = new JSONObject();
				objTemp.put("v", ord.getMax());
				listArr.add(objTemp);

				objTemp = new JSONObject();
				objTemp.put("v", ord.getMin());
				listArr.add(objTemp);

				objTemp = new JSONObject();
				objTemp.put("v", ord.getAverageBasketSize());
				listArr.add(objTemp);

				objTemp = new JSONObject();
				objTemp.put("v", ord.getDollarValue());
				listArr.add(objTemp);

				bskSize = new JSONObject();
				bskSize.put("c", listArr);
				listArrAll.add(bskSize);
			}
			JSONArray jsonHeader = parseOrderBksSizesHeaderJSON(pathFileHeader);
			jsonReturn.put("cols", jsonHeader);
			jsonReturn.put("rows", listArrAll);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonReturn;
	}

	/**
	 * parse list OrderingSystemVO Header to JSON
	 * 
	 * @return JSONObject
	 * @author ha.than
	 */
	public static JSONArray parseOrderBksSizesHeaderJSON(String pathFileHeader) {
		JSONParser parser = new JSONParser();
		JSONArray jSONArray = new JSONArray();
		try {
			Object obj = parser.parse(new FileReader(pathFileHeader
					+ "/orderbasketsize"));
			jSONArray = (JSONArray) (((JSONObject) obj).get("cols"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return jSONArray;
	}

	/**
	 * build list OrderHdrStatVO to JSON
	 * 
	 * @param headerOrder
	 * @param dataOrder
	 * @return JSONObject
	 * @author ha.than
	 */
	@SuppressWarnings("unchecked")
	public static JSONObject buildOrderStatusToJson(
			List<OrderHdrStatVO> headerOrder, List<OrderStatusVO> dataOrder) {
		JSONObject obReturn = new JSONObject();
		JSONArray listArrAll = new JSONArray();
		JSONObject objJson = new JSONObject();
		JSONArray listArr;

		HashMap<String, Map<String, Integer>> map = new HashMap<String, Map<String, Integer>>();
		List<String> timeList = new ArrayList<String>();
		for (OrderStatusVO ordsmap : dataOrder) {
			String time = ordsmap.getTime();
			Map obj = null;
			if (map.containsKey(time)) {
				obj = map.get(time);
			} else {
				obj = new HashMap<String, Integer>();
				timeList.add(time);
			}
			obj.put(ordsmap.getOrdHdrStatCd(), ordsmap.getCountOrd());
			map.put(time, obj);
		}
		Map<String, Integer> mapdata = null;
		for (String time : timeList) {
			listArr = new JSONArray();
			objJson = new JSONObject();
			objJson.put("v", time);
			listArr.add(objJson);
			for (OrderHdrStatVO ord : headerOrder) {
				objJson = new JSONObject();
				mapdata = map.get(time);
				if (mapdata.containsKey(ord.getOrdHdrStatCd())) {
					objJson.put("v", mapdata.get(ord.getOrdHdrStatCd()));
				} else {
					objJson.put("v", 0);
				}
				listArr.add(objJson);
			}
			objJson = new JSONObject();
			objJson.put("c", listArr);
			listArrAll.add(objJson);
		}
		obReturn.put("cols", buildHeaderOrderStatusToJson(headerOrder));
		obReturn.put("rows", listArrAll);
		return obReturn;
	}

	/**
	 * build list OrderHdrStatVO Header to JSON
	 * 
	 * @param headerOrder
	 * @return JSONArray
	 * @author ha.than
	 */
	@SuppressWarnings("unchecked")
	public static JSONArray buildHeaderOrderStatusToJson(
			List<OrderHdrStatVO> headerOrder) {
		JSONArray listArrAll = new JSONArray();
		JSONObject objJson = new JSONObject();
		objJson.put("id", "Time");
		objJson.put("label", "Time");
		objJson.put("type", "string");
		listArrAll.add(objJson);
		for (OrderHdrStatVO ord : headerOrder) {
			objJson = new JSONObject();
			objJson.put("id", ord.getOrdHdrStatCd());
			objJson.put("label", ord.getOrdHdrStatDes());
			objJson.put("type", "number");
			listArrAll.add(objJson);
		}
		return listArrAll;
	}

	/**
	 * parse list OrderBasketSizeVO to JSON
	 * 
	 * @param list
	 * @return JSONObject
	 * @author ha.than
	 */
	public static String buildIndivOrdStatToJson(IndivOrdStatisticVO indiv) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = mapper.writeValueAsString(indiv);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonString;
	}
	/**
	 * parse list OrderCmtVO to JSON
	 * 
	 * @param list
	 * @return jsonString
	 * @author ha.than
	 */
	public static String buildListOrderCmtVOsToJson(List<OrderCmtVO> cmts) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = mapper.writeValueAsString(cmts);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonString;
	}
	/**
	 * parse list OrderStatHistVO to JSON
	 * 
	 * @param list
	 * @return jsonString
	 * @author ha.than
	 */
	public static String buildOrdStatHistVOsToJson(List<OrderStatHistVO> cmts) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = mapper.writeValueAsString(cmts);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonString;
	}
	

	/**
	 * parse list DynamicDataVO to JSON
	 * 
	 * @return JSONObject
	 * @author ha.than
	 */
	@SuppressWarnings("unchecked")
	public static JSONObject parseLstDynamicToJSON(List<DynamicDataVO> lst) {

		JSONArray jsonData = new JSONArray();
		JSONArray jsonRow = new JSONArray();
		for (DynamicDataVO dynamic : lst) {
			jsonRow = new JSONArray();
			for (MetaDataVO meta : dynamic.getData()) {
				jsonRow.add(meta.getColumnData());
			}
			jsonRow.add("action");
			jsonData.add(jsonRow);
		}

		JSONObject ret = new JSONObject();
		ret.put("sEcho", "1");
		ret.put("iTotalRecords", String.valueOf(lst.size()));
		ret.put("iTotalDisplayRecords", String.valueOf(lst.size()));
		ret.put("aaData", jsonData);

		return ret;
	}

	public static String convertDateTsByFmat(Date date) {
		return dateTimeFormat.format(date).replace(" ", "@");
	}

	/**
	 * function convert array to string
	 * 
	 * @return String
	 * @author ha.than
	 */
	public static String arrToStr(String[] arr, int index) {
		String ret = "";
		for (int i = index; i < arr.length; i++) {
			ret += arr[i] + ",";
		}
		if (!ret.trim().isEmpty()) {
			ret = ret.substring(0, ret.length() - 1).trim();
		}
		return ret;
	}

	public static String getStrSetParamBySize(int y) {
		String ret = "";
		for (int i = 0; i < y; i++) {
			ret += "?,";
		}
		if (!ret.trim().isEmpty()) {
			ret = ret.substring(0, ret.length() - 1).trim();
		}
		return ret;
	}

	public static String getStrSetParamByArr(String[] arr, int index) {
		String ret = "";
		for (int i = index; i < arr.length; i++) {
			ret += arr[i] + "= ?,";
		}
		if (!ret.trim().isEmpty()) {
			ret = ret.substring(0, ret.length() - 1).trim();
		}
		return ret;
	}

	public static String getStrSetParamByArr(String[] arr, String[] values,
			int index) {
		String ret = "";
		for (int i = index; i < arr.length; i++) {
			ret += arr[i] + "= '" + values[i] + "',";
		}
		if (!ret.trim().isEmpty()) {
			ret = ret.substring(0, ret.length() - 1).trim();
		}
		return ret;
	}

	public static String[] swapArrayStr(String[] arr) {
		String[] ret = new String[arr.length];
		for (int i = 1; i < arr.length; i++) {
			ret[i - 1] = arr[i].trim();
		}
		ret[arr.length - 1] = arr[0];
		return ret;
	}

	public static int[] createArrTypSql(String[] arr) {
		int[] types = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			types[i] = Types.VARCHAR;
		}
		types[arr.length - 1] = Types.CHAR;
		return types;
	}
}
