package com.yash.OopsTask3;

import java.util.Scanner;

public class Square implements Shape{

	@Override
	public void area() 
	{
		double a,s;
	      Scanner sc = new Scanner(System.in);

	      System.out.println("Enter side of square:");
	      s = sc.nextDouble();

	      a = s*s;
	      System.out.println("Area of square is: " + a);    		
	}

}
