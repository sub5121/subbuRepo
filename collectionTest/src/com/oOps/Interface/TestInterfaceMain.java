package com.oOps.Interface;
class InterfaceTestClass implements InterfaceTestInterface {
	public void draw(){System.out.println("drawing rectangle");}  
}
public class TestInterfaceMain {
	public static void main(String args[]) {
		InterfaceTestClass obj = new InterfaceTestClass();
		obj.draw();
		int c = 7;
		int val = InterfaceTestInterface.cube(c);
		System.out.println(c+" cube = "+val);
	}
}
