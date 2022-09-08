package com.yash.OopsTask11;

import java.util.Date;

public class Test
{

	public static void main(String[] args) 
	{
		Date dob = new Date(1996,12,31);
		Date doj = new Date(2022, 16, 07);
         Employee e = new Employee(111,"prafulla","pune", 60000, dob, doj);
         System.out.println(e);
         
         
	}

}
