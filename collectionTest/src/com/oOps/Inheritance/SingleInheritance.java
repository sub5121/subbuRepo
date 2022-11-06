package com.oOps.Inheritance;
class Man {
	void walking() {
		System.out.println("man is walking");
	}
}
class Army extends Man{
	void running() {
		System.out.println("army is running");
	}
}
public class SingleInheritance {
	public static void main(String args[]){  
		Army a= new Army();
		a.running();
		a.walking();
	}
}
