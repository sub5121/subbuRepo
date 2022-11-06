package com.java8.lambda;

public class LambdaExpressionSingleParameter {
	public static void main(String[] args) {  
		        // Lambda expression with single parameter.  
		        Sayable s1=(name)->{  
		            return "Hello, "+name;  
		        };  
		        System.out.println(s1.say("subrata"));  
		     // You can omit function parentheses    
		        Sayable s2= name ->{  
		            return "Hello, "+name;  
		        };  
		        System.out.println(s2.say("subrata mahato"));  
	}
}
