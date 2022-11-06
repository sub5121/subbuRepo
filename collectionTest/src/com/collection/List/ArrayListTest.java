package com.collection.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListTest {
	public static void main(String args[]){  
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
		      list.add("Mango");//Adding object in arraylist    
		      list.add("Apple");    
		      list.add("Banana");    
		      list.add("Grapes");    
		      //Printing the arraylist object   
		    //  System.out.println(list);  
		      
		      
		      ArrayList<Integer> list1=new ArrayList<Integer>();//Creating arraylist    
		      list1.add(2);//Adding object in arraylist    
		      list1.add(2);    
		      list1.add(5);    
		      list1.add(2);    
		      list1.add(3);    
		      list1.add(2);    
		      //Printing the arraylist object
		       list1 = (ArrayList<Integer>) list1.stream().distinct().collect(Collectors.toList());
		       //System.out.println("unique = "+list1);
		     for(int i=0;i<list1.size();i++) {
		    	  if(list1.contains(list1.get(i))==true) {
		    		  System.out.println("unique for = "+list1.get(i));
		    	  }
		      }
		      Set <Integer> setunique = new HashSet<Integer>();
		      setunique.addAll(list1);
		      System.out.println("unique using set = "+setunique);  
		      
	}
}
