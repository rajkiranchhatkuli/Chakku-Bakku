package com.raaz.dao;

import java.sql.SQLException;

 
 
public interface UserDao {
	
	public boolean isValidUser(String username, String password) throws SQLException;
}
