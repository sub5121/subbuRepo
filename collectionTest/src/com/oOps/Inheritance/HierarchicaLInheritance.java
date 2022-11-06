package com.oOps.Inheritance;
class Man2 {
	void running() {
		System.out.println("man is walking");
	}
}
class Army2 extends Man2{
	void firing() {
		System.out.println("army is firing");
	}
}
class Commando1 extends Man2{
	void attacking() {
		System.out.println("Commando is attacking ");
	}
}
public class HierarchicaLInheritance {
	public static void main(String args[]){  
		Commando1 c=new Commando1();  
		c.attacking();  
		c.running();  
		//c.firing(); //compile time error
	}
}
