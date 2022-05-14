package com.mapmay2;

public class Employee {

	int empId;   //properties=variables
	String empName;
	double salary;
	
	public int getEmpId() {  //behaviours=methods
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
