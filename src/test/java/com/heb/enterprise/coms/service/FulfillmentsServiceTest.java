package com.heb.enterprise.coms.service;

import com.heb.enterprise.coms.service.FulfillmentsService.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.heb.enterprise.coms.dao.FulfillmentsDAO;
import com.heb.enterprise.coms.utils.Constants;
public class FulfillmentsServiceTest {

	@Test
	public void type() throws Exception {
		// TODO auto-generated by JUnit Helper.
		assertThat(FulfillmentsService.class, notNullValue());
	}

	@Test
	public void instantiation() throws Exception {
		// TODO auto-generated by JUnit Helper.
		FulfillmentsService target = new FulfillmentsService();
		assertThat(target, notNullValue());
	}

}