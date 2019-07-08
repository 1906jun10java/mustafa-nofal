package com.revature.beans;

public class Employee {
	private int employeeID;
	private String empFirstName;
	private String empLastName;
	private int departmentID;
	private double salary;
	private String empEmail;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeID, String empFirstName, String empLastName, int departmentID, double salary,
			String empEmail) {
		super();
		this.employeeID = employeeID;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.departmentID = departmentID;
		this.salary = salary;
		this.empEmail = empEmail;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", departmentID=" + departmentID + ", salary=" + salary + ", empEmail=" + empEmail
				+ ", getEmployeeID()=" + getEmployeeID() + ", getEmpFirstName()=" + getEmpFirstName()
				+ ", getEmpLastName()=" + getEmpLastName() + ", getDepartmentID()=" + getDepartmentID()
				+ ", getSalary()=" + getSalary() + ", getEmpEmail()=" + getEmpEmail() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
