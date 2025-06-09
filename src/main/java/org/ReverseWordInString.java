package org.practice;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str="Hello Lavitra";
	        String[] strArr = str.split(" ");
	        for(int i=0;i<strArr.length;i++)
	        {
	            char[] ch = strArr[i].toCharArray();
	            for(int j=ch.length-1;j>=0;j--)
	            {
	                System.out.print(ch[j]);
	            }
	            System.out.print(" ");
	        }
	}

}
