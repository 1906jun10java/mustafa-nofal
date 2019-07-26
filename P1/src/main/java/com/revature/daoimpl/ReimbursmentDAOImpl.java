package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.beans.Reimbursment;
import com.revature.beans.Users;
import com.revature.dao.ReimbursmentDAO;
import com.revature.util.ConnFactory;

public class ReimbursmentDAOImpl implements ReimbursmentDAO{
	
	public static ConnFactory cf= ConnFactory.getInstance();
	public static Connection conn = cf.getConnection();
	public static UsersDAOImpl ud= new UsersDAOImpl();
	
	public static Users user= new Users();
	
	public Users getuserDao(String username) {
		
		user=ud.getUser(username, user);
		
		return user ;
		
	}
	
	
	
	@Override
	public void createReimbursment(Reimbursment reimb) throws SQLException {
		
	
		double reimb_amount = reimb.getReimb_amount();
		String reimb_submitted = reimb.getReimb_submitted();
		String reimb_resolved = reimb.getReimb_resolved();
		String reimb_description = reimb.getReimb_description();
		//Blob reimb_reciept = reimb.getReimb_reciept();
		
		int user_id = user.getUser_id();
		
		int reimb_resolver = reimb.getReimb_resolver();
		String reimb_status = reimb.getReimb_status();
		String reimb_type = reimb.getReimb_type();
		
		
		String sql = "INSERT INTO ERS_REIMBURSMENT(reimb_amount, reimb_description, users_id, reimb_type) VALUES(?,?,?,?)";
		
		PreparedStatement stmt;
		
		stmt = conn.prepareStatement(sql);
		
		stmt.setDouble(1, reimb_amount);
		
		stmt.setString(2, reimb_description);
		
		stmt.setInt(3, user_id);

		stmt.setString(4, reimb_type);
		stmt.execute();
		
	}
	
 

}



