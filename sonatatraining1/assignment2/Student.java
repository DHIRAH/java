package com.demo;

public class Student {
	int StdId;
	String StdName;
	int StdClass;
	Student(int StdId,String StdName,int StdClass){
		this.StdId=StdId;
		this.StdName=StdName;
		this.StdClass=StdClass;
	}
	
	public static void main(String args[]) {
		Student s1 =new Student(121, "rajesh", 12);
		Student s2 =new Student(121, "raju", 11);
		System.out.println(s1.StdName);
		System.out.println(s1.StdId);
		System.out.println(s1.StdClass);
		System.out.println(s2.StdName);
		System.out.println(s2.StdId);
		System.out.println(s2.StdClass);
		
	}
}