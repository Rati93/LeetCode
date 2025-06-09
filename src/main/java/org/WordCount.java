package org.practice;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCount {

	public void WordCount() {
		// TODO Auto-generated method stub

		String str = "Hi Welcome Rati";
		String[] strArr = str.split(" ");
		Map<String,Integer> map = new HashMap<>();
		System.out.println("Total no. of words in String : " + strArr.length);
		for(int i =0;i<strArr.length;i++)
		{
			map.put(strArr[i], strArr[i].length());
		}
		
		for(Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() +"   ->   " + entry.getValue());
		}
		
	}

}
