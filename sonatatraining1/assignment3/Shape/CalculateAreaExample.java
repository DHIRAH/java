package com.day3;

public class CalculateAreaExample {
public static void main(String args[]) {
	Triangle t1 =new Triangle(4,6);
	square s1 = new square(3);
	rectangle r1 =new rectangle(3,4);
	System.out.println(s1.calculatearea());
	System.out.println(r1.calculatearea());
	System.out.println(t1.calculatearea());
}
}
