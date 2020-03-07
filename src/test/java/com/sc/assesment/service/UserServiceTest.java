package com.sc.assesment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sc.assessment.exception.UserException;
import com.sc.assessment.model.UserData;
import com.sc.assessment.service.UserService;
import com.sc.assessment.service.impl.UserServiceImpl;

public class UserServiceTest {
	@Test
	public void getUserDataTest() throws UserException {
		
		UserService userService = new UserServiceImpl();
		UserData userData = userService.getUserData("1");
		assertNotNull(userData);
		assertEquals(userData.getPricingTier(), "A");
	}
}
