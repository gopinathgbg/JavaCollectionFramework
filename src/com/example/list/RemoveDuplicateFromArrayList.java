package com.example.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>()	; 
		al.add("Gopinath");
		al.add("Mayuri");
		al.add("Vaibhav");
		al.add("Vaibhav");
		al.add("Nitin");
		al.add("Nitin");
	    System.out.println("LIst "+al);
	    System.out.println(al.get(1));
	    System.out.println(al.get(3));
	    
	    ArrayList ll= new  ArrayList();
	    ll.add("akash");
	    ll.add(990);
	    ll.add(true);
	    System.out.println("List1 "+ll);
	    
	    System.out.println(ll.remove(1));
	    System.out.println("List1 "+ll);
	    
	   
	    	System.out.println(al.contains("Nitin"));
	    	System.out.println(al.contains("Nitin"));
	    
	    	
	    	//using  set
	    	Set<String> uniquele = new HashSet<String>();
	    	uniquele.addAll(al);
	    	  System.out.println("set elements :"+uniquele);
	    	// using java8 stream api
	    	  
	    	  List<String> uniqueList =al.stream().distinct().collect(Collectors.toList());
	    	  System.out.println("Using stream api unique elements are  :"+uniquele);
	    	  
}

}
