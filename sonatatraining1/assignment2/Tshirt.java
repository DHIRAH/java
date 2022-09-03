package com.demo;

public class Tshirt {

	
	String color;
	String material;
	String Design;
	
Tshirt(String color,String material,String Design){
	this.color=color;
	this.material=material;
	this.Design=Design;
	
	}
public static void main(String args[]) {



Tshirt[] small=new Tshirt[3];
small[0]=new Tshirt("red","cotton","david crew");
small[1]=new Tshirt("green","silk","superman");
small[2]=new Tshirt("while","semicotton","spiderman");

Tshirt[] large = new Tshirt[3];
large[0]=new Tshirt("red","cotton","david crew");
large[1]=new Tshirt("green","silk","superman");
large[2]=new Tshirt("while","semicotton","spiderman");

Tshirt[] xtralarge = new Tshirt[3];
xtralarge[0]=new Tshirt("red","cotton","david crew");
xtralarge[1]=new Tshirt("green","silk","superman");
xtralarge[2]=new Tshirt("while","semicotton","spiderman");


for( int i = 0 ; i < small.length ; i++ )
	{
	System.out.println("small");
	System.out.println("Tshirt-color = "   +small[i].color+   "Tshirt-material = "   +small[i].material+  "Tshirt-Design = "    +small[i].Design);

}

for( int i = 0 ; i < large.length ; i++ )
{
System.out.println("large");
System.out.println("Tshirt-color = "   +large[i].color+   "Tshirt-material = "   +large[i].material+  "Tshirt-Design = "    +large[i].Design);

}
for( int i = 0 ; i < xtralarge.length ; i++ )
{
System.out.println("xtralarge");
System.out.println("Tshirt-color = "   +xtralarge[i].color+   "Tshirt-material = "   +xtralarge[i].material+  "Tshirt-Design = "    +xtralarge[i].Design);

}

	
}
	
}




