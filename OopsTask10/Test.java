package com.yash.OopsTask10;

public class Test 
{
public static void main(String[] args) throws CloneNotSupportedException
{
	
	Product product = new Product(01,27000,100,"intex Mobile");
	System.out.println("original value: "+product);
	
	Product copyProduct = (Product) product.clone();
	copyProduct.setPname("NothigOne Mobile");
	copyProduct.setPrice(12000);
	System.out.println("after clonning: "+copyProduct);
	
	if(copyProduct instanceof Product)
	{
		System.out.println("new object is belongs to Product class");
	}
	else
{
		System.out.println("new object is not beongs to Product class");
	}
}
}	
	


