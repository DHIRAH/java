package com.day3.employee;

public class TechnicalEmployee extends Employee {
	int basicpay;
	double salary;
	TechnicalEmployee(int EmployeeID, String EmployeeName,int basicpay) {
		super(EmployeeID, EmployeeName);
	this.basicpay=basicpay;
	}

	
	@Override
	public String toString() {
		return "TechnicalEmployee [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + "]";
	}
	@Override
	public double  calculatSal() {
		
	
		return   ( basicpay + (basicpay*0.12));//HRA=	Technical Employee -  12% of Basic Pay
	}




	
	
	}
 
	
		
	


