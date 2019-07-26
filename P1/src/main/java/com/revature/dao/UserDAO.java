package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Users;

public interface UserDAO {
	
	
	public void createUser(Users users)
			throws SQLException;
}

