package org.practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Arrmy";
        String str1 = "Marry";
        char[] ch=str.toLowerCase().toCharArray();
        char[] ch1=str1.toLowerCase().toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if(Arrays.equals(ch,ch1))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
        
	}

}
