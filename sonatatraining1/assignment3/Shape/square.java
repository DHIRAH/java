package com.day3;

public class square extends Shape {
	int side;
	square(int side){
		this.side=side;
		
	}
	@Override
	double calculatearea() {
		// TODO Auto-generated method stub
		return side*side;
	}
	@Override
	public String toString() {
		return "square [side=" + side + "]";
	}

}
