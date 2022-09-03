package com.MyOwnAutoShopProject;



public class MyOwnAutoShop {
	public static void main(String[] args) {
	
		Sedan s=new Sedan(120,170000,"blue", 21);
		Ford f = new Ford(110,625000,"silver",0.1);
		Ford f1 = new Ford(100,550000,"white", 0.2);
		Car c=new Car(60, 220000, "blue");
		Truck t=new Truck(130, 500000, "redBlack",2900 );
		System.out.println("Sale Price of sedan Car\t"+s.getSalePrice());
		System.out.println("Sale Price of ford car1\t"+f.getSalePrice());
		System.out.println("Sale Price of ford car2\t"+f1.getSalePrice());
	
		System.out.println("Sale Price of Car\t"+c.getSalePrice());
	}
	

}



