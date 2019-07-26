package com.revature.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.Reimbursment;
import com.revature.daoimpl.ReimbursmentDAOImpl;


public class SubmitRequestEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SubmitRequestEmpServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("SubmitRequestEmp.html");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String reimb_amount=request.getParameter("reimb_amount");
		String reimb_description=request.getParameter("reimb_description");
		String reimb_type=request.getParameter("reimb_type");	
		double rm_amount=Double.parseDouble(reimb_amount);

		
	
		
				
				ReimbursmentDAOImpl rd= new ReimbursmentDAOImpl();
				
				try {
					rd.createReimbursment(new Reimbursment(22.22,reimb_type,reimb_description));
					
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				response.sendRedirect("Employee.html");
			}
			
			
		}
		
		
	


