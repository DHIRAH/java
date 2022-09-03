package com.sonataAssignment1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class productList {
	public static void main(String args[]) throws  MyowException {
	 List<product>p2=new LinkedList<>();
	p2.add(new product("Tv",15000));
	p2.add(new product("Refrigerator",25000));
	p2.add(new product("cupboard",9500));
	p2.add(new product("sofaset",35000));
	double price = 34000;
	if(price>35000)
	{
		throw new MyowException("price is greater than 35000");
	}
	else
		
	{
		System.out.println("hapy Diwali");
	}
	}
}
