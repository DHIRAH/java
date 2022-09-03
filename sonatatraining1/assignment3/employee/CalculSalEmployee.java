package com.day3.employee;

public class CalculSalEmployee {
	public static void main(String args[]) {
		TechnicalEmployee C =new TechnicalEmployee(121, "vijay", 27000);
		TechnicalEmployee CplusPlus =new TechnicalEmployee(127," raghav",28000 );
		TechnicalEmployee Java =new TechnicalEmployee(134, "sumith", 33000);
		staff HouseKp =new staff(234,"ravi", 11000);
		staff Security =new staff(331, "vijay", 15000);
		Address[] address1 =new Address[3];
		address1[0]=new Address(178, "bangalore", "banashankari", 560003);
		address1[1]=new Address(188, "mangalore", "surthkal", 575001);
		address1[2]=new Address(222, "bangalore", "jallahali", 560004);
		Address[] address2 =new Address[2];
		address2[0]=new Address(378, "bangalore", "jayanagara", 560009);
		address2[1]=new Address(202, "bangalore", "jallahali", 560004);
		System.out.println("C programmer	"+("\nEmpId  "  + C.EmployeeID +  "  EmpName  "	+C.EmployeeName+   "  Salary  "	+ C.calculatSal()));
	    System.out.println("DoorNo  "  	 +   address1[0].DoorNo  +		 " city  "	 +address1[0].city+  " street	"	 + address1[0].street +		"  Pincode   "  +address1[0].Pincode);
		System.out.println("C++ programmer	"+("\nEmpId  "  +  CplusPlus.EmployeeID +  "  EmpName  "	+ CplusPlus.EmployeeName+   "  Salary  "	+ CplusPlus.calculatSal()));
		System.out.println("DoorNo  "  	 +   address1[1].DoorNo  +		 " city  "	 +address1[1].city+  " street	"	 + address1[1].street +		"  Pincode   "  +address1[1].Pincode);
		System.out.println("Java programmer	"+("\nEmpId  "  + Java.EmployeeID +  "  EmpName  "	+Java.EmployeeName+   "  Salary  "	+ Java.calculatSal()));
		System.out.println("DoorNo  "  	 +   address1[2].DoorNo  +		 " city  "	 +address1[2].city+  " street	"	 + address1[2].street +		"  Pincode   "  +address1[2].Pincode);
		System.out.println("Staff of HouseKeeping	"+("\nEmpId  "  +  HouseKp.EmployeeID +  "  EmpName  "	+ HouseKp.EmployeeName+   "  Salary  "	+  HouseKp.calculatSal()));
	    System.out.println("DoorNo  "  	 +   address2[0].DoorNo  +		 " city  "	 +address2[0].city+  " street	"	 + address2[0].street +		"  Pincode   "  +address2[0].Pincode);
	    System.out.println("Security	"+("\nEmpId  "  + Security.EmployeeID +  "  EmpName  "	+Security.EmployeeName+   "  Salary  "	+Security.calculatSal()));
	    System.out.println("DoorNo  "  	 +   address2[1].DoorNo  +		 " city  "	 +address2[1].city+  " street	"	 + address2[1].street +		"  Pincode   "  +address2[1].Pincode);
	
	
	
	}
	
	
		
	
	}


