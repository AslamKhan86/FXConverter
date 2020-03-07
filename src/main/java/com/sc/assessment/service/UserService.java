package com.sc.assessment.service;

import com.sc.assessment.exception.UserException;
import com.sc.assessment.model.UserData;

public interface UserService {
	UserData getUserData(String userId) throws UserException;
}
