package com.oOps.pollymorphysm;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

class AdderChangeDataType {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}
}

public class OverloadingTest {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
		System.out.println("**********ChangeDataType************");
		System.out.println(AdderChangeDataType.add(11, 11));
		System.out.println(AdderChangeDataType.add(12.3, 12.6));
	}

}
