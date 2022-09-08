package com.yash.OopsTask3;

import java.util.Scanner;

public class Rectangle implements Shape
{
	
		
	@Override
	public void area() 
	{
		double width, height, Area, Perimeter;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Width of Rectangle =  ");
		width = sc.nextDouble();
		System.out.println(" Enter Height of Rectangle = ");
		height = sc.nextDouble();

		Area = width * height;
		

		System.out.format(" Area of Rectangle = %.2f\n",Area);
		
		
	}

}
