package com.day3.employee;

abstract class Employee {
	int	EmployeeID;
	String	EmployeeName;
	double salary;
	abstract public double calculatSal();
	
	
	Employee(int EmployeeID,String EmployeeName){
		this.EmployeeID=EmployeeID;
		this.EmployeeName=EmployeeName;
	}


	}





			



