package com.oOps.utility;

class A {
	private A() {
	}// private constructor

	void msg() {
		System.out.println("Hello java");
	}
}

public class RoleofPrivateConstructor {
	//Example of singleton class
	private RoleofPrivateConstructor() {
		
	}
	 public static void main(String args[]){  
		//   A obj=new A();//Compile Time Error  
		 RoleofPrivateConstructor obj=new RoleofPrivateConstructor();
		 }  
}
