package com.day3;

public class Triangle extends Shape{
	int base;
	int height;
	Triangle(int base,int height){
		this.base=base;
		this.height=height;
	}

	@Override
	double calculatearea() {
		return (base / 2) * height;
		
	}

	
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	

}

