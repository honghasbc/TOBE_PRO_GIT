/*
 * $Id: HebUserDetails.java,v 1.1.1.1 2012/06/18 14:19:03 r511755 Exp $
 *
 * Copyright (c) 2010 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.jaf.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @author r511759
 *
 */
public class HebUserDetails extends User {

	private String displayName;
	private String hebJobCode;
	private String hebJobDesc;
	private String departmentNumber;
	private String mail;
	private String role;
	private String mobile;
	//Valid only for vendors
	private String vendorOrgId;
	private String vendorOrgName;
	private String hebGLlocation;

	public HebUserDetails(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}


	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return this.displayName;
	}


	/**
	 * @param hebJobCode the hebJobCode to set
	 */
	public void setHebJobCode(String hebJobCode) {
		this.hebJobCode = hebJobCode;
	}


	/**
	 * @return the hebJobCode
	 */
	public String getHebJobCode() {
		return this.hebJobCode;
	}


	/**
	 * @param hebJobDesc the hebJobDesc to set
	 */
	public void setHebJobDesc(String hebJobDesc) {
		this.hebJobDesc = hebJobDesc;
	}


	/**
	 * @return the hebJobDesc
	 */
	public String getHebJobDesc() {
		return this.hebJobDesc;
	}


	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}


	/**
	 * @return the mail
	 */
	public String getMail() {
		return this.mail;
	}


	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}


	/**
	 * @return the role
	 */
	public String getRole() {
		return this.role;
	}


	/**
	 * @param vendorOrgId the vendorOrgId to set
	 */
	public void setVendorOrgId(String vendorOrgId) {
		this.vendorOrgId = vendorOrgId;
	}


	/**
	 * @return the vendorOrgId
	 */
	public String getVendorOrgId() {
		return this.vendorOrgId;
	}


	/**
	 * @param vendorOrgName the vendorOrgName to set
	 */
	public void setVendorOrgName(String vendorOrgName) {
		this.vendorOrgName = vendorOrgName;
	}


	/**
	 * @return the vendorOrgName
	 */
	public String getVendorOrgName() {
		return this.vendorOrgName;
	}


	/**
	 * @param departmentNumber the departmentNumber to set
	 */
	public void setDepartmentNumber(String departmentNumber) {
		this.departmentNumber = departmentNumber;
	}


	/**
	 * @return the departmentNumber
	 */
	public String getDepartmentNumber() {
		return this.departmentNumber;
	}


	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}


	/**
	 * @param hebGLlocation the hebGLlocation to set
	 */
	public void setHebGLlocation(String hebGLlocation) {
		this.hebGLlocation = hebGLlocation;
	}


	/**
	 * @return the hebGLlocation
	 */
	public String getHebGLlocation() {
		return hebGLlocation;
	}

}
