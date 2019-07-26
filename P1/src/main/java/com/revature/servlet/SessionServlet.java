package com.revature.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Users;
import com.revature.daoimpl.UsersDAOImpl;


public class SessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UsersDAOImpl userImpl = new UsersDAOImpl();
		Users usr = new Users();
		

		
		HttpSession session = req.getSession(false);
		if (session != null) {
			try {
				HttpSession sess =req.getSession();
				sess.getAttribute("Username");
				System.out.println("username in session servlet session: "+sess.getAttribute("Username"));
				String sesUser = (String) sess.getAttribute("Username");
				
				usr = userImpl.getUser(sesUser, usr);
				ObjectMapper obj = new ObjectMapper();
	
				String sts = new ObjectMapper().writeValueAsString(usr);
				resp.getWriter().write(sts);
			
			
			
			} catch (Exception e) {
				e.printStackTrace();
				resp.getWriter().write("{\"session\":null}");
			}
		} else {
			resp.getWriter().write("{\"session\":null}");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}