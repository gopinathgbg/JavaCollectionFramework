package com.example.StringExamquestions;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequenciesOfcharactersinAlphabeticalOrder {

	public static void main(String[] args) {
		// Input String: babdc
		// Output String : a1b2c1d1
		FrequenciesOfcharactersinAlphabeticalOrder e= new FrequenciesOfcharactersinAlphabeticalOrder();
		e.frequency("babdcdddd");
	

	}
public String frequency(String input1) {	
	
		String result="";

		char[] inputArray = input1.toCharArray();
		Arrays.sort(inputArray);
		 input1 = new String(inputArray);

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : input1.toCharArray()) {
        
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+ 1);
				
			}else {
				map.put(c, 1);
			}
			
		}
		for(Map.Entry<Character, Integer>entry: map.entrySet()) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
			result += String.valueOf( entry.getKey() +entry.getValue());
			
		}
		return result;
	}
}

