package com.assignment;

public class Emplyoee {
 public static void calSal() throws MyemployeeException{
	 int employeeSal = 120000;
	 if(employeeSal<100000)
		 throw new MyemployeeException("the yearly salary of an employee is less than\r\n"
		 		+ "\r\n"
		 		+ "1,00,000.");
	 else
		 System.out.print("Yearly salary is"+employeeSal);
		
 }
	public static void main(String[] args) throws MyemployeeException {
		// TODO Auto-generated method stub
		calSal();
	}

}