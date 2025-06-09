package org.practice;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class FrequencyOfCharacters {

	public FrequencyOfCharacters() {
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
	 System.out.println(entry.getKey() +"  ---> "+ entry.getValue());
 }
	}

}
