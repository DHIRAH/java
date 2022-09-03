package com.day3;

public class rectangle extends Shape
{
int length;
int width;
rectangle(int length,int width){
	this.length=length;
	this.width=width;
}
	@Override
	double calculatearea() {
		// TODO Auto-generated method stub
		return  length*width ;
	}
	@Override
	public String toString() {
		return "rectangle [length=" + length + ", width=" + width + "]";
	}

}
