package org.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacters {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi Hello to this world";
		 str=str.replaceAll(" ", "");
		 Map<Character,Integer> map = new HashMap<>();
		 for(char ch : str.toCharArray())
		 {
			 map.put(ch,map.getOrDefault(ch,0)+1);
		 }
		 for(Entry<Character, Integer> entry : map.entrySet())
		 {
			 if(entry.getValue()>1)
			 {
			 System.out.println(entry.getKey() +"  ---> "+ entry.getValue());
			 }
		 }
	}

}
