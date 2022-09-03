package com.demo;

public class Product {
int ProId;
String ProName;
double ProPrice;


public Product(int ProId, String ProName,double ProPrice) {
	this.ProId=ProId;
	this.ProName=ProName;
	this.ProPrice=ProPrice;
	
}
public static void main(String args[]) {
	 float orgcost =10000;double GST=0.15;
	 double ProPrice =orgcost +(orgcost*GST);
	 Product P1 =new Product(121,"TV", ProPrice);
     System.out.println(P1.ProId);
     System.out.println(P1.ProName);
     System.out.println(P1.ProPrice);
}
}


