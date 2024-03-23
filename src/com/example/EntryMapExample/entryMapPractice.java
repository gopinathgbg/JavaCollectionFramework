package com.example.EntryMapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class entryMapPractice {

	
	public static void main(String[] args) {
		Map<String, String > hashmap= new HashMap<String, String>();
		hashmap.put("Test1", "A");
		hashmap.put("Test4", "D");
		hashmap.put("Test5", "B");
		hashmap.put("Test2", "D");
		hashmap.put("Test6", "E");
		hashmap.put("Test3", "C");
		hashmap.put("Test7", "F");
		
		Set<Entry<String, String>> entry = hashmap.entrySet();
		for (Entry<String, String> entry2 : entry) {
			System.out.println(entry2.getKey()+" : "+entry2.getValue());
		}
		System.out.println(hashmap);
		System.out.println("*********linkedhashmap MainTain Insertion Order*************");
		
		Map<String, String > linkedhashmap= new LinkedHashMap<>();
		linkedhashmap.put("Test1", "A");
		linkedhashmap.put("Test4", "D");
		linkedhashmap.put("Test5", "B");
		linkedhashmap.put("Test2", "D");
	    linkedhashmap.put("Test6", "E");
		linkedhashmap.put("Test3", "C");
		linkedhashmap.put("Test7", "F");
		
		
		Set<Entry<String, String>> entry1 = linkedhashmap.entrySet();
		for (Entry<String, String> entry3 : entry1) {
			System.out.println(entry3.getKey()+" : "+entry3.getValue());
		}
		System.out.println(linkedhashmap);
		System.out.println("*********TreeMap elements are in sorted order*************");	
		
		Map<String, String > treehmap= new TreeMap<>();
		treehmap.put("Test1", "A");
		treehmap.put("Test4", "D");
		treehmap.put("Test5", "B");
		treehmap.put("Test2", "D");
		treehmap.put("Test6", "E");
		treehmap.put("Test3", "C");
		treehmap.put("Test7", "F");
		
		
		Set<Entry<String, String>> entry2 = linkedhashmap.entrySet();
		for (Entry<String, String> entry4 : entry2) {
			System.out.println(entry4.getKey()+" : "+entry4.getValue());
		}
		System.out.println(treehmap);
	}

}
