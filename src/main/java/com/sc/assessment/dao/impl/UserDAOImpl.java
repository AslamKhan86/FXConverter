package com.sc.assessment.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.sc.assessment.dao.UserDAO;
import com.sc.assessment.model.UserData;

public class UserDAOImpl implements UserDAO {
	private static final Map<String, UserData> userMap = new HashMap<String, UserData>();
	static {
		userMap.put("1", new UserData(1, "A", "abc@gmail.com"));
		userMap.put("2", new UserData(2, "B", "xyz@gmail.com"));
		userMap.put("3", new UserData(3, "C", "gef@gmail.com"));
		userMap.put("4", new UserData(4, "D", "lmn@gmail.com"));
	}

	@Override
	public UserData getUserData(String userId) {
		return userMap.get(userId);
	}

}
