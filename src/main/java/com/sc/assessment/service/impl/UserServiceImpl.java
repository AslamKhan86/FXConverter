package com.sc.assessment.service.impl;

import com.sc.assessment.dao.UserDAO;
import com.sc.assessment.dao.impl.UserDAOImpl;
import com.sc.assessment.exception.UserException;
import com.sc.assessment.model.UserData;
import com.sc.assessment.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO userDao = new UserDAOImpl();

	@Override
	public UserData getUserData(String userId) throws UserException {
		UserData userData = userDao.getUserData(userId);

		if (userData == null) {
			throw new UserException(500, "Invalid. User Not Found!!!");
		}

		return userData;
	}

}
