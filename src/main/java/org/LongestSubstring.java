package org.practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      String s = "ababaabcdab";
		        int left=0,maxLength=0;
		        Set<Character> charSet = new HashSet<>();
		        for(int right =0;right <s.length();right++)
		        {
		        while(charSet.contains(s.charAt(right)))
		        {
		            charSet.remove(s.charAt(left));
		            left++;
		        }
		        charSet.add(s.charAt(right));
		        maxLength = Math.max(maxLength,right-left+1);
		        }
		        System.out.println(maxLength);
		        System.out.println(charSet);
		    }
	}