package com.sonataAssignment1;

public class product {
	double price;
	String name;
public product(String name,int price) {
	this.price=price;
	this.name=name;
	
}

public double getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "product [name=" + name + ",price=" + price + "]";
}
}