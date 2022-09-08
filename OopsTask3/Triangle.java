package com.yash.OopsTask3;

import java.util.Scanner;

public class Triangle implements Shape{

	int vertexa,vertexb,vertexc;
	
	public Triangle()
	{ 	
		this(0,0,0);
	}
	public Triangle(int i, int j,int k)
	{
       	  this.vertexa=i;
       	  this.vertexb=j;
       	  this.vertexc=k;
	}
	public int getVertexa() {
		return vertexa;
	}
	public void setVertexa(int vertexa) {
		this.vertexa = vertexa;
	}
	public int getVertexb() {
		return vertexb;
	}
	public void setVertexb(int vertexb) {
		this.vertexb = vertexb;
	}
	public int getVertexc() {
		return vertexc;
	}
	public void setVertexc(int vertexc) {
		this.vertexc = vertexc;
	}
	@Override
	public void area()
	{
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter base: ");
	    int base = scan.nextInt();
	    System.out.print("Enter height: ");
	    int height = scan.nextInt();
	    double area = (0.5) * (base * height);
	    System.out.println("area of triangle = : "+area);
	}

}
