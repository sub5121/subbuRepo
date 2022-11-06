package com.mst.multithreading;
//user thread example
public class ThreadTest extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thred is created ");
		}
	}
}
