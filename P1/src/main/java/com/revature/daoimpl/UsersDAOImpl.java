package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.beans.Users;
import com.revature.dao.UserDAO;
import com.revature.util.ConnFactory;

public class UsersDAOImpl implements UserDAO {

	public static ConnFactory cf= ConnFactory.getInstance();
	public static Connection conn = cf.getConnection();
	private static Logger Log = Logger.getRootLogger();

	public void createUser(Users users) throws SQLException {
		

		String username = users.getUsername();
		String password = users.getPassword();
		String firstname = users.getFirstname();
		String lastname = users.getLastname();
		String email = users.getEmail();
		String user_tier = users.getEmp_or_mgr();
		

		
		String sql = "INSERT INTO ERS_USERS(users_username,users_password, users_firstname, users_lastname, users_email, users_tier) VALUES(?,?,?,?,?,?)";
	
		PreparedStatement stmt;
		
		stmt = conn.prepareStatement(sql);
		Log.info("grabbing info");
		
		stmt.setString(1, username);
	
		stmt.setString(2,password);
		stmt.setString(3, firstname);
		stmt.setString(4, lastname);
		stmt.setString(5, email);
		stmt.setString(6, user_tier);
		stmt.execute();
		// insert and save ....
		
	}
	
	
	public static Users getUser(String username, Users usr) {
	 Users user = new Users();
		
		
		String sql = "INSERT INTO ERS_USERS(users_username,users_password, users_id, users_firstname, users_lastname, users_email, emp_or_mgr) VALUES(?,?,?,?,?,?,?)";
		
		
		PreparedStatement stmt;
		Log.info("prepared stmt");
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, username);
			
			ResultSet rs=stmt.executeQuery();
			
			
			while(rs.next()) {
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setUser_id(rs.getInt(3));
				user.setFirstname(rs.getString(4));
				user.setLastname(rs.getString(5));
				user.setEmail(rs.getString(6));
				user.setEmp_or_mgr(rs.getString(7));

				
		
			}
			
			
		} catch (SQLException e) {
			Log.info("sql exception");
			
			e.printStackTrace();
		}
		
		
		
		return user;
	}
}