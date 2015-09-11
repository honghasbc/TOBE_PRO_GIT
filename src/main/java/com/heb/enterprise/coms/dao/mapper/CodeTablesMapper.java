/*
 * $Id: CodeTablesMapper.java
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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.RowMapper;

import com.heb.enterprise.coms.model.vo.MetaDataVO;

/**
 * @author ha.than
 * 
 */
public class CodeTablesMapper {
	private Log log = LogFactory.getLog(CodeTablesMapper.class);

	/**
	 * function convert result set to RowMapper<MetaDataVO>.
	 * 
	 * @return RowMapper<MetaDataVO>
	 */
	public static RowMapper<MetaDataVO> getMetaDataMapper() {
		RowMapper<MetaDataVO> rowMapper = new RowMapper<MetaDataVO>() {
			public MetaDataVO mapRow(final ResultSet rs, int rowNum)
					throws SQLException {
				MetaDataVO metaData = new MetaDataVO();
				metaData.setColumnName(rs.getString(1));
				metaData.setDataTyp(rs.getString(2));
				metaData.setDataLength(rs.getInt(3));
				metaData.setNullable(rs.getString(4));
				metaData.setConstraintTyp(rs.getString(5));
				return metaData;
			}
		};
		return rowMapper;
	}
}