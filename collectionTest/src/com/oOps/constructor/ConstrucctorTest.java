package com.oOps.constructor;

public class ConstrucctorTest {
	
	int id;  
    String name; 
    int age;  
	//creating a default constructor  
	ConstrucctorTest(){
		//System.out.println("ConstrucctorTest is created by subrata");
		}  
	ConstrucctorTest(int id ,String name){
		System.out.println("paramaterized ConstrucctorTest is created by subrata with passing id "+ id+" name "+name );
		}  
	ConstrucctorTest(int i ,String n,int a){
		
		System.out.println("contructor overload ConstrucctorTest is created by subrata with passing id "+ i+" name "+n +" age "+a );
		id = i;
		name = n;
		age = a;
	}  
	
		
		
		void display(){
			 System.out.println("copy constructor "+id+" "+name+" "+age);
		 }  
	public static void main(String args[]){  
		//calling a default constructor  
		ConstrucctorTest b = new ConstrucctorTest();  
		ConstrucctorTest b1 = new ConstrucctorTest(1,"subrata"); 
		ConstrucctorTest b2 = new ConstrucctorTest(1,"subrata",28); 
		ConstrucctorTest b3 = new ConstrucctorTest(); 
		b3.id=b2.id;
		b3.name=b2.name;
		b3.age=b2.age;
		b3.display();
	}
}
