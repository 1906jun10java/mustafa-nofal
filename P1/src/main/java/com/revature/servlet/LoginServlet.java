package com.revature.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.revature.beans.Credentials;
import com.revature.beans.Users;
import com.revature.service.AuthenticationService;




public class LoginServlet  extends HttpServlet {

private static Logger Log=LogManager.getLogger(LoginServlet.class);
	private static AuthenticationService au = new AuthenticationService();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.sendRedirect("loginpage.html");
		Log.info("logging in");
	}
	  
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Credentials cred = new Credentials();
		cred.setUsername(req.getParameter("username")); 
		cred.setPassword(req.getParameter("password")); 
		cred.setPosition(req.getParameter("position")); 
	
		
		boolean istrue=au.authenticateUser(cred) != null;
		HttpSession sess =req.getSession();
		sess.setAttribute("username", cred.getUsername());
		System.out.println("username session: "+sess.getAttribute("username"));
		Log.info("access granted");
		System.out.println(cred.getUsername());
		
		if(istrue==true) {
			
			
			sess.setAttribute("Users", true);
			
			
			if(cred.getPosition().equals("manager")) {
				resp.sendRedirect("Manager");
				Log.info("access to manager page");
			}else {
				resp.sendRedirect("Employee");
				Log.info("access to employee page");

			}
		}		
		else 			
			resp.sendRedirect("loginpage");	
			Log.info("redirected to login page");
		
	}
	
	
	
}


