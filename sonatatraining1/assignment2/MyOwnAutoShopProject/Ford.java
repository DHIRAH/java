package com.MyOwnAutoShopProject;

public class Ford extends Car {
		int year;
		double manufacturerDiscount;

	public Ford(int speed, double regularPrice, String color,double manufacturerDiscount) {
		super(speed, regularPrice, color);
		
		this.manufacturerDiscount=manufacturerDiscount;
	}
		
	public double getSalePrice() {
		
			return (super.getSalePrice()-(super.getSalePrice()*manufacturerDiscount));
			
		}
}
