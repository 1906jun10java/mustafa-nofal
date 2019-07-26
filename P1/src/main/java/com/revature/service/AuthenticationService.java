package com.revature.service;


import com.revature.beans.Credentials;
import com.revature.beans.Users;
import com.revature.daoimpl.ReimbursmentDAOImpl;
import com.revature.daoimpl.UsersDAOImpl;

public class AuthenticationService {
	
	public static UsersDAOImpl ud= new UsersDAOImpl();
	public static ReimbursmentDAOImpl ur= new ReimbursmentDAOImpl();
	
	public Users authenticateUser(Credentials cred) {
		Users user = null;
		user=ud.getUser(cred.getUsername(), user);
		
		if(cred.getUsername().equals(user.getUsername()) && cred.getPassword().equals(user.getPassword()))
		{	
			
			user = new Users("mj23", "jordan", 23, "michael", "jordan","jordan23@nba.com", "employee");
			
			return user;
		}
			else
		return user;
}
	
	
}




