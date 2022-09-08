package com.yash.OopsTask5;

import java.util.Scanner;

public class Area
{
	static Scanner sc = new Scanner(System.in);

  public void areaofTriangle()
  {
	  	System.out.print("Enter base: ");
	    int base = sc.nextInt();
	    System.out.print("Enter height: ");
	    int height = sc.nextInt();
	    double area = (0.5) * (base * height);
	    System.out.println("The area of triangle is: "+area);  
  }
  public void areaOfSquare()
  {
	  double a,s;
      System.out.println("Enter the sides of square:");
      s = sc.nextDouble();
      a = s*s;
      System.out.println("Area of square is: " + a);    		
  }
  public void areOfRectangle()
  {
	  double width, height, Area;
		
		System.out.println("Enter Width of Rectangle =  ");
		width = sc.nextDouble();
		System.out.println(" Enter Height of Rectangle = ");
		height = sc.nextDouble();
		Area = width * height;
		System.out.format(" The Area of a Rectangle = %.2f\n",Area);

  }
  public static void main(String[] args) 
  {
	  int noOfSides;
	  Area a =new Area();
	  
	       System.out.println(" Enter the sides of shape: ");
	       System.out.println("Enter 1 print the are of Square");
	       System.out.println("Enter 2 print the are of Traingle");
	       System.out.println("Enter 3 print the are of Rectangle");
	       noOfSides =sc.nextInt();
	       if(noOfSides == 1)
	       {
	    	   a.areaOfSquare(); 
	       }
	       else if(noOfSides == 3)
	       {
	    	   a.areaofTriangle();
	    	   
	       }
	       else
	       {
	    	   a.areOfRectangle(); 
	       }

    }
      
}

