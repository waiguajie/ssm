package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}
}
