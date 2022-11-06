package com.oOps.Inheritance;

/* Why use inheritance in java
1. For Method Overriding (so runtime polymorphism can be achieved).
2 . For Code Reusability .*/
class Employee{  
	 float salary=40000;  
	}  


public class InheritanceTest extends Employee {
	int bonus=10000;  
	public static void main(String args[]){  
		 InheritanceTest it = new InheritanceTest();
		 System.out.println("Programmer salary is:"+it.salary);  
		  System.out.println("Bonus of Programmer is:"+it.bonus);  
	 }
	
	

}
