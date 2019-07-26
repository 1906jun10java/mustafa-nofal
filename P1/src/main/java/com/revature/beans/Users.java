package com.revature.beans;

public class Users {

	private int user_id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private int user_tier;
	private String emp_or_mgr;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String username, String password, int users_id, String firstname, String lastname, String email,
			String emp_or_mgr) {
		super();
	
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.user_tier = user_tier;
		this.emp_or_mgr = emp_or_mgr;
	}
	
	
	public Users(String username, String password) {
		super();
	
		this.username = username;
		this.password = password;

	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUser_tier() {
		return user_tier;
	}
	public void setUser_tier(int user_tier) {
		this.user_tier = user_tier;
	}
	
	public String getEmp_or_mgr() {
		return emp_or_mgr;
	}
	public void setEmp_or_mgr(String emp_or_mgr) {
		this.emp_or_mgr = emp_or_mgr;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + user_id;
		result = prime * result + user_tier;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((emp_or_mgr == null) ? 0 : emp_or_mgr.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (user_id != other.user_id)
			return false;
		if (user_tier != other.user_tier)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (emp_or_mgr == null) {
			if (other.emp_or_mgr != null)
				return false;
		} else if (!emp_or_mgr.equals(other.emp_or_mgr))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", username=" + username + ", password=" + password + ", firstname="
				+ firstname + ", lastname=" + lastname + ", email=" + email + ", user_tier=" + user_tier
				+ ", usr_or_mgr=" + emp_or_mgr + "]";
	}

	
	
	
}