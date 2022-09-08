package com.yash.OopsTask4;

public class Test 
{
  public static void main(String[] args) 
  {
	  System.out.println("Branch details");
	  
	  Branch   b1 = new Branch(101,"BOB","Parbhani" );
	  System.out.println("Brnach 1");
	  System.out.println(1);
	  
	  Branch   b2 = new Branch(102,"Hdfc","pune" );
	  System.out.println("Brnach 2");
	  System.out.println(2);
	  
	  Branch   b3 = new Branch(103,"IDBI","Aurangabad" );
	  System.out.println("Brnach 3");
	  System.out.println(b3);
	  
	System.out.println("Customer detail");	
	
	Customer c1 = new Customer(101,30001,"prafull", "parbhani","31/12/96","11/12/22", b1);
	System.out.println(": Customer c1");
	System.out.println(c1);
	
	Customer c2 = new Customer(102,30002,"sachin", "pune","01/11/96","01/11/22", b2);
	System.out.println(": Customer c2");
	System.out.println(c2);
	
	Customer c3 = new Customer(103,30002,"sagar", "palam","29/05/96","01/02/20", b3);
	System.out.println(": Customer c3");
	System.out.println(c3);
	
	
	System.out.println("Details of Customer_Account_Statement");
	
	Customer_Account_Statement ca1 = new Customer_Account_Statement(201,c1, 1000, 2200, "04/09/22");
	System.out.println("Details of Customer_Account_Statement ca1");
	System.out.println(ca1);
	
	Customer_Account_Statement ca2 = new Customer_Account_Statement(202,c2, 2000, 7700, "12/07/22");
	System.out.println("Details of Customer_Account_Statement ca2");
	System.out.println(ca2);
	
	Customer_Account_Statement ca3 = new Customer_Account_Statement(203,c3, 3000, 8800, "11/08/22");
	System.out.println("Details of Customer_Account_Statement ca3");
	System.out.println(ca3);
  }
}
