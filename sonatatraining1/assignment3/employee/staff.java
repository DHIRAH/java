package com.day3.employee;

public class staff extends Employee {
	int basicpay;
	double salary;

	staff(int EmployeeID,String EmployeeName,double basicpay) {
		super(EmployeeID, EmployeeName);
		
	}

	@Override
	 public double calculatSal() {
		

		
		return  salary = basicpay + (basicpay*0.18);//HRA=	staff -  18% of Basic Pay
	}

	@Override
	public String toString() {
		return "staff [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + "]";
	}

	}


