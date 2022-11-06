package com.oOps.Inheritance;
 class Man1 {
	void running() {
		System.out.println("man is walking");
	}
}
class Army1 extends Man1{
	void firing() {
		System.out.println("army is firing");
	}
}
class Commando extends Army1{
	void attacking() {
		System.out.println("Commando is attacking ");
	}
}
public class MultileveLInheritance {
	public static void main(String args[]){  
		Commando c= new Commando();
		c.attacking();
		c.firing();
		c.running();
	
	
	}
}
