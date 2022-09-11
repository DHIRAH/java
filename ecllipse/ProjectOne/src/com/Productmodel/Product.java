package com.Productmodel;

public class Product {
	int productID;
	String productName;
	double productPrice;
	Product(int productID,String productName,double productPrice){
		this.productID =productID;
		this.productName=productName;
		this.productPrice=productPrice;
	}
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductModel [productID=" + productID + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}

}
