package org.practice;

import java.util.*;

public class RemoveDuplicates
{
	public static void main(String args[]) {
		RemoveDuplicates();
	}
 public static void  RemoveDuplicates() {
     String str = "geeksforgeeks";
     String str1="";
     for(int i=0;i<str.length();i++)
     {
      if(!str1.contains(String.valueOf(str.charAt(i))))
      {
         str1=str1+str.charAt(i); 
      }
      else{
          str1=str1;
      }
     }
     System.out.println(str1);

 }
}

