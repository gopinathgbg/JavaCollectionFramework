package com.example.StringExamquestions;

import java.util.Map;

public class modifyVariable {

	public static void main(String[] args) {

		// input: modify_variableName
		// Output: modifyVariableName
		String input1 = "modify_variableName";
		String result = "";

		if (input1.contains("_")) {
			System.out.println("Java");
  			char[] c = input1.toCharArray();
			for (int i = 0; i < c.length; i++) {
            if(c[i] !='_') {
              if(i!=0 && c[i-1] =='_') {
            	  result += String.valueOf(c[i]).toUpperCase();
            	  
              } else {
            	  result +=c[i];
              }           	
            }
			}
			System.out.println(result);
		}
	}
}