package com.raaz.service.impl;
import java.sql.SQLException;

import com.raaz.dao.UserDao;
import com.raaz.service.UserService;


public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserDao getUserDao()
	{
		return this.userDao;
	}

	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}

	@Override
	public boolean isValidUser(String username, String password) throws SQLException
	{
		return userDao.isValidUser(username, password);
	}
}
