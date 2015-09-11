/*
 * $Id: LoggingAspect.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.aspect;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author ha.than
 *
 */
@Aspect
public class LoggingAspect {
	private static final Logger LOG = Logger.getLogger(LoggingAspect.class);
	
	@Around("execution(* com.heb.enterprise.coms.controller.*.*(..))")
	public Object  logController(ProceedingJoinPoint joinPoint) throws Throwable {
		String infoMethod = joinPoint.getClass().getName() + "." + joinPoint.getSignature().getName();

		long startTime = System.nanoTime();

		Object result = joinPoint.proceed(); //continue on the intercepted method
	
		long endTime = System.nanoTime();
		LOG.info(infoMethod + ". Time Controller: " + (endTime-startTime));		  
		
		return result;
	}
	
	@Around("execution(* com.heb.enterprise.coms.service.*.*(..))")
	public Object  logService(ProceedingJoinPoint joinPoint) throws Throwable {
		String infoMethod = joinPoint.getClass().getName() + "." + joinPoint.getSignature().getName() + "(" + Arrays.toString(joinPoint.getArgs()) + ")";

		long startTime = System.nanoTime();

		Object result = joinPoint.proceed(); //continue on the intercepted method
	
		long endTime = System.nanoTime();
		LOG.info(infoMethod + ". Time Service: " + (endTime-startTime));
		
		return result;
	}
	
	@Around("execution(* com.heb.enterprise.coms.dao.impl.*.*(..))")
	public Object  logDao(ProceedingJoinPoint joinPoint) throws Throwable {
		String infoMethod = joinPoint.getClass().getName() + "." + joinPoint.getSignature().getName() + "(" + Arrays.toString(joinPoint.getArgs()) + ")";

		long startTime = System.nanoTime();
		
		Object result = joinPoint.proceed(); //continue on the intercepted method

		long endTime = System.nanoTime();
		LOG.info(infoMethod + ". Time DAO: " + (endTime-startTime));
		
		return result;
	}
	
	
}
