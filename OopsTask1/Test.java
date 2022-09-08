package com.yash.OopsTask1;

public class Test 
{

	public static void main(String[] args)
	{
       Employee e1 = new Employee();
                e1.InitializePerson();
       Customer c1 = new Customer();
                c1.InitializePerson();
       Department [] arr = new Department[3];
                    
                     arr[0] = new Department(101,"Computer Science");
                     arr[1] = new Department(102,"marketing Department");
                     arr[2] = new Department(103,"IT team");
       System.out.println("department data  in department arr 0:");
       arr[0].display();
       
       System.out.println("data  in department a 1:");
       arr[1].display();
       
       System.out.println("data  in department a 2:");
       arr[2].display();
     
       System.out.println("Details of Customer");
       Customer c2 = new Customer(2001,976461, "pune", "prafull@gmail.com");
       System.out.println(c2);
       System.out.println("Details of Employee");
       Employee e2 =new Employee();
       e2.setSalary(70000);
       e2.setDate_of_joining(2022);
       e2.setBase_location("hinjewadi");
       e2.setEmailid("yash.com");
       e2.setContactno(91301874);
       e2.setDeptobj(arr[1]);
       System.out.println(e2);
       
	}
   
}
